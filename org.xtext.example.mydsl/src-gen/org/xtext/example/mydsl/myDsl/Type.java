/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type#getGuielements <em>Guielements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Size)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

  /**
   * Returns the value of the '<em><b>Guielements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.GuiElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guielements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_Guielements()
   * @model containment="true"
   * @generated
   */
  EList<GuiElement> getGuielements();

} // Type
