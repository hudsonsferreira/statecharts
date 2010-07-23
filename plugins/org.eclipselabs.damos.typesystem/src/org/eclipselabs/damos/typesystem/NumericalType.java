/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.damos.typesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numerical Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.damos.typesystem.NumericalType#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.damos.typesystem.TypeSystemPackage#getNumericalType()
 * @model abstract="true"
 * @generated
 */
public interface NumericalType extends PrimitiveType {

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(Unit)
	 * @see org.eclipselabs.damos.typesystem.TypeSystemPackage#getNumericalType_Unit()
	 * @model containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipselabs.damos.typesystem.NumericalType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.damos.typesystem.NumericalType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(Unit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.damos.typesystem.NumericalType#getUnit <em>Unit</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' containment reference is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(Unit)
	 * @generated
	 */
	boolean isSetUnit();
} // NumericalType
