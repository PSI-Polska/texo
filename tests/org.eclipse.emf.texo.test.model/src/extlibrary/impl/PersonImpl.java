/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.4 2011/08/25 14:34:34 mtaal Exp $
 */
package extlibrary.impl;

import extlibrary.ExtlibraryPackage;
import extlibrary.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Person</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link extlibrary.impl.PersonImpl#getAddress <em>Address</em>}</li>
 * <li>{@link extlibrary.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 * <li>{@link extlibrary.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
  /**
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PersonImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ExtlibraryPackage.Literals.PERSON;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getAddress() {
    return address;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setAddress(String newAddress) {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.PERSON__ADDRESS, oldAddress, address));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setFirstName(String newFirstName) {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.PERSON__FIRST_NAME, oldFirstName,
          firstName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setLastName(String newLastName) {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.PERSON__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case ExtlibraryPackage.PERSON__ADDRESS:
      return getAddress();
    case ExtlibraryPackage.PERSON__FIRST_NAME:
      return getFirstName();
    case ExtlibraryPackage.PERSON__LAST_NAME:
      return getLastName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case ExtlibraryPackage.PERSON__ADDRESS:
      setAddress((String) newValue);
      return;
    case ExtlibraryPackage.PERSON__FIRST_NAME:
      setFirstName((String) newValue);
      return;
    case ExtlibraryPackage.PERSON__LAST_NAME:
      setLastName((String) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case ExtlibraryPackage.PERSON__ADDRESS:
      setAddress(ADDRESS_EDEFAULT);
      return;
    case ExtlibraryPackage.PERSON__FIRST_NAME:
      setFirstName(FIRST_NAME_EDEFAULT);
      return;
    case ExtlibraryPackage.PERSON__LAST_NAME:
      setLastName(LAST_NAME_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case ExtlibraryPackage.PERSON__ADDRESS:
      return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
    case ExtlibraryPackage.PERSON__FIRST_NAME:
      return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
    case ExtlibraryPackage.PERSON__LAST_NAME:
      return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (address: ");
    result.append(address);
    result.append(", firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(')');
    return result.toString();
  }

} // PersonImpl
