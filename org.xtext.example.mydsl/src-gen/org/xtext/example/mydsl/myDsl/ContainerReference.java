/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ContainerReference#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ContainerReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getContainerReference()
 * @model
 * @generated
 */
public interface ContainerReference extends GuiElement
{
  /**
   * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Name</em>' attribute.
   * @see #setReferenceName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getContainerReference_ReferenceName()
   * @model
   * @generated
   */
  String getReferenceName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ContainerReference#getReferenceName <em>Reference Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Name</em>' attribute.
   * @see #getReferenceName()
   * @generated
   */
  void setReferenceName(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getContainerReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ContainerReference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ContainerReference
