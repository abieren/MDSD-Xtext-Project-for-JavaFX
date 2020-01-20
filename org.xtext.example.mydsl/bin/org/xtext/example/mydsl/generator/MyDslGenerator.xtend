/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Domainmodel
import org.xtext.example.mydsl.myDsl.Frame
import org.xtext.example.mydsl.myDsl.GuiElement
import org.xtext.example.mydsl.myDsl.Container
import org.xtext.example.mydsl.myDsl.Textfield
import org.xtext.example.mydsl.myDsl.Label
import org.xtext.example.mydsl.myDsl.Button
import org.xtext.example.mydsl.myDsl.Checkbox
import org.xtext.example.mydsl.myDsl.ContainerReference
import org.xtext.example.mydsl.myDsl.LayoutHorizontal
import org.xtext.example.mydsl.myDsl.LayoutVertical
import org.xtext.example.mydsl.myDsl.LayoutPosition
import org.xtext.example.mydsl.myDsl.Layout
import org.xtext.example.mydsl.myDsl.LayoutHorizontalEntry
import org.xtext.example.mydsl.myDsl.Space
import org.xtext.example.mydsl.myDsl.LayoutVerticalEntry
import org.xtext.example.mydsl.myDsl.LayoutPositionEntry
import org.xtext.example.mydsl.myDsl.PositionValue
import org.xtext.example.mydsl.myDsl.Size
import org.xtext.example.mydsl.myDsl.Radiobutton

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		
		// generate the frames
		for (frame : resource.allContents.toIterable.filter(Frame))
		{
			fsa.generateFile("Frame" + frame.name.toFirstUpper + ".java", frame.compile)
		}
		
		// generate the containers
		for (container : resource.allContents.toIterable.filter(Container))	
		{
			fsa.generateFile("Container" + container.name + ".java", container.compile)
		}	
	}
	
	
	def errorUnrecognizedType(Class<?> clazz)
	{
		throw new RuntimeException("Unrecognized " + clazz.name)
	}
	
	
	def errorShouldBeUnreachable()
	{
		throw new RuntimeException("Reached code that should be unreachable")
	}
	
	
	def errorUnexpectedCase()
	{
		throw new RuntimeException("Reached an unexpected case")
	}
	
	def compile(Frame frame) '''
		import guigen.*;
		import java.util.Arrays;
		
		public class Frame�frame.name.toFirstUpper� extends Container
		{
			public Frame�frame.name.toFirstUpper�()
			{
				super(Arrays.asList(
					�if (frame.layout !== null) frame.layout.compile
					else "null"�
				));
			}
		}'''

	
	def compile(Container container) '''
		import guigen.*;
		import java.util.Arrays;
		
		public class Container�container.name.toFirstUpper� extends Container
		{
			public Container�container.name.toFirstUpper�()
			{
				super(Arrays.asList(
					�if (container.layout !== null) container.layout.compile
					else "null"�
				));
			}
		}'''
		
	
	def compile(Layout layout)
	{
		if (layout instanceof LayoutHorizontal) return layout.compile
		else if (layout instanceof LayoutVertical) return layout.compile
		else if (layout instanceof LayoutPosition) return layout.compile
		else errorUnrecognizedType(layout.class)
	}
	
	
	def compile(LayoutHorizontal layout) '''
		new Horizontal(�layout.fixed !== null ? layout.fixed.fixed : "null"�, Arrays.asList(
			null,
			�FOR entry : layout.entries�
				�entry.compile�,
			�ENDFOR�
			null
		))'''
	
	
	def compile(LayoutHorizontalEntry entry)
	{
		if (entry.space !== null) return '''new Space(�entry.space.space�, 0)'''
		if (entry.guielement !== null) return entry.guielement.compile
		errorShouldBeUnreachable
	}
	
	
	def compile(LayoutVertical layout) '''
		new Vertical(�layout.fixed !== null ? layout.fixed.fixed : "null"�, Arrays.asList(
			null,
			�FOR entry : layout.entries�
				�entry.compile�,
			�ENDFOR�
			null
		))'''
	
	
	def compile(LayoutVerticalEntry entry)
	{
		if (entry.space !== null) return '''new Space(0, �entry.space.space�)'''
		if (entry.guielement !== null) return entry.guielement.compile
		errorShouldBeUnreachable
	}
	
	
	def compile(LayoutPosition layout) '''
		new Positional(Arrays.asList(
			null,
			�FOR entry : layout.entries�
				�entry.compile�,
			�ENDFOR�
			null
		))'''
	
	
	def compile(LayoutPositionEntry entry) '''
		new Position(�entry.position.posX�, �entry.position.posY�,
			�entry.guielement.compile�
		)'''
	

	def compile(GuiElement element)
	{
		if (element instanceof ContainerReference) return element.compile
		else if (element instanceof Layout) return element.compile
		else if (element instanceof Textfield) return element.compile
		else if (element instanceof Label) return element.compile
		else if (element instanceof Button) return element.compile
		else if (element instanceof Checkbox) return element.compile
		else if (element instanceof Radiobutton) return element.compile
		else errorUnrecognizedType(element.class)
	}
	
	
	def compile(ContainerReference containerRef) '''
		new Container�containerRef.referenceName.toFirstUpper�()'''
		
	
	def compile(Textfield textfield) '''
		new Textfield(
			"�textfield.text.text�"
		)'''
	
	
	def compile(Label label) '''
		new Label(
			"�label.text.text�"
		)'''
	
		
	def compile(Button button) '''
		new Button(
			"�button.text.text�"
		)'''
	
		
	def compile(Checkbox checkbox) '''
		new Checkbox(�if (checkbox.checked == "X") "true"
			else if (checkbox.checked == "O") "false"
			else errorUnexpectedCase�,
			"�checkbox.text.text�"
		)'''
		
	
	def compile(Radiobutton radio)'''
		/*<RADIOBUTTON>*/ null'''
}
