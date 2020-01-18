/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CheckboxChoice#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCheckboxChoice()
 * @model
 * @generated
 */
public interface CheckboxChoice extends EObject
{
  /**
   * Returns the value of the '<em><b>Choice</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice</em>' attribute.
   * @see #setChoice(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCheckboxChoice_Choice()
   * @model
   * @generated
   */
  String getChoice();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CheckboxChoice#getChoice <em>Choice</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choice</em>' attribute.
   * @see #getChoice()
   * @generated
   */
  void setChoice(String value);

} // CheckboxChoice
