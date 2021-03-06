/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.FunctionCall#getSource <em>Source</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.FunctionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Type
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Type)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getFunctionCall_Source()
   * @model containment="true"
   * @generated
   */
  Type getSource();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.FunctionCall#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Type value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getFunctionCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // FunctionCall
