/**
 * generated by Xtext 2.10.0
 */
package pucrs.lp.turtle.turtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pucrs.lp.turtle.turtle.Repeat#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see pucrs.lp.turtle.turtle.TurtlePackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends Command
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link pucrs.lp.turtle.turtle.Model}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see pucrs.lp.turtle.turtle.TurtlePackage#getRepeat_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Model> getCommands();

} // Repeat
