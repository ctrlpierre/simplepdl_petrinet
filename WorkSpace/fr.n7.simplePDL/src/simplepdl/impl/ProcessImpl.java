/**
 */
package simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getProcessElements <em>Process Elements</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getProcesselement <em>Processelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements simplepdl.Process {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessElements() <em>Process Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessElement> processElements;

	/**
	 * The cached value of the '{@link #getProcesselement() <em>Processelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesselement()
	 * @generated
	 * @ordered
	 */
	protected ProcessElement processelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessElement> getProcessElements() {
		if (processElements == null) {
			processElements = new EObjectContainmentWithInverseEList<ProcessElement>(ProcessElement.class, this, SimplepdlPackage.PROCESS__PROCESS_ELEMENTS, SimplepdlPackage.PROCESS_ELEMENT__PROCESS);
		}
		return processElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement getProcesselement() {
		if (processelement != null && processelement.eIsProxy()) {
			InternalEObject oldProcesselement = (InternalEObject)processelement;
			processelement = (ProcessElement)eResolveProxy(oldProcesselement);
			if (processelement != oldProcesselement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.PROCESS__PROCESSELEMENT, oldProcesselement, processelement));
			}
		}
		return processelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElement basicGetProcesselement() {
		return processelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesselement(ProcessElement newProcesselement) {
		ProcessElement oldProcesselement = processelement;
		processelement = newProcesselement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.PROCESS__PROCESSELEMENT, oldProcesselement, processelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__PROCESS_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__PROCESS_ELEMENTS:
				return ((InternalEList<?>)getProcessElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__NAME:
				return getName();
			case SimplepdlPackage.PROCESS__PROCESS_ELEMENTS:
				return getProcessElements();
			case SimplepdlPackage.PROCESS__PROCESSELEMENT:
				if (resolve) return getProcesselement();
				return basicGetProcesselement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case SimplepdlPackage.PROCESS__PROCESS_ELEMENTS:
				getProcessElements().clear();
				getProcessElements().addAll((Collection<? extends ProcessElement>)newValue);
				return;
			case SimplepdlPackage.PROCESS__PROCESSELEMENT:
				setProcesselement((ProcessElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplepdlPackage.PROCESS__PROCESS_ELEMENTS:
				getProcessElements().clear();
				return;
			case SimplepdlPackage.PROCESS__PROCESSELEMENT:
				setProcesselement((ProcessElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplepdlPackage.PROCESS__PROCESS_ELEMENTS:
				return processElements != null && !processElements.isEmpty();
			case SimplepdlPackage.PROCESS__PROCESSELEMENT:
				return processelement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
