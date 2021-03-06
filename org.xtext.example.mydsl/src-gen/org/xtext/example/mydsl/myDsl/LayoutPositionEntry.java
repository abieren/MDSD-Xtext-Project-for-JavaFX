/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Position Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LayoutPositionEntry#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LayoutPositionEntry#getGuielement <em>Guielement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLayoutPositionEntry()
 * @model
 * @generated
 */
public interface LayoutPositionEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(PositionValue)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLayoutPositionEntry_Position()
   * @model containment="true"
   * @generated
   */
  PositionValue getPosition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LayoutPositionEntry#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(PositionValue value);

  /**
   * Returns the value of the '<em><b>Guielement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guielement</em>' containment reference.
   * @see #setGuielement(GuiElement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLayoutPositionEntry_Guielement()
   * @model containment="true"
   * @generated
   */
  GuiElement getGuielement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LayoutPositionEntry#getGuielement <em>Guielement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guielement</em>' containment reference.
   * @see #getGuielement()
   * @generated
   */
  void setGuielement(GuiElement value);

} // LayoutPositionEntry
