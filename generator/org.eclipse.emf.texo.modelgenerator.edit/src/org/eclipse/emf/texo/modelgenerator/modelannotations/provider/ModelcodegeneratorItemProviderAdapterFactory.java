/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelcodegeneratorItemProviderAdapterFactory.java,v 1.7 2011/09/23 11:03:09 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.texo.modelgenerator.modelannotations.util.ModelcodegeneratorAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelcodegeneratorItemProviderAdapterFactory extends ModelcodegeneratorAdapterFactory implements
    ComposeableAdapterFactory, IChangeNotifier, IDisposable {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModelcodegeneratorItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EPackageModelGenAnnotationItemProvider ePackageModelGenAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEPackageModelGenAnnotationAdapter() {
    if (ePackageModelGenAnnotationItemProvider == null) {
      ePackageModelGenAnnotationItemProvider = new EPackageModelGenAnnotationItemProvider(this);
    }

    return ePackageModelGenAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EClassModelGenAnnotationItemProvider eClassModelGenAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEClassModelGenAnnotationAdapter() {
    if (eClassModelGenAnnotationItemProvider == null) {
      eClassModelGenAnnotationItemProvider = new EClassModelGenAnnotationItemProvider(this);
    }

    return eClassModelGenAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EAttributeModelGenAnnotationItemProvider eAttributeModelGenAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEAttributeModelGenAnnotationAdapter() {
    if (eAttributeModelGenAnnotationItemProvider == null) {
      eAttributeModelGenAnnotationItemProvider = new EAttributeModelGenAnnotationItemProvider(this);
    }

    return eAttributeModelGenAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EReferenceModelGenAnnotationItemProvider eReferenceModelGenAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEReferenceModelGenAnnotationAdapter() {
    if (eReferenceModelGenAnnotationItemProvider == null) {
      eReferenceModelGenAnnotationItemProvider = new EReferenceModelGenAnnotationItemProvider(this);
    }

    return eReferenceModelGenAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation} instances.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  protected EEnumModelGenAnnotationItemProvider eEnumModelGenAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEEnumModelGenAnnotationAdapter() {
    if (eEnumModelGenAnnotationItemProvider == null) {
      eEnumModelGenAnnotationItemProvider = new EEnumModelGenAnnotationItemProvider(this);
    }

    return eEnumModelGenAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EDataTypeModelGenAnnotationItemProvider eDataTypeModelGenAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEDataTypeModelGenAnnotationAdapter() {
    if (eDataTypeModelGenAnnotationItemProvider == null) {
      eDataTypeModelGenAnnotationItemProvider = new EDataTypeModelGenAnnotationItemProvider(this);
    }

    return eDataTypeModelGenAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaoFinderDefinitionItemProvider daoFinderDefinitionItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.DaoFinderDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDaoFinderDefinitionAdapter() {
    if (daoFinderDefinitionItemProvider == null) {
      daoFinderDefinitionItemProvider = new DaoFinderDefinitionItemProvider(this);
    }

    return daoFinderDefinitionItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void dispose() {
    if (ePackageModelGenAnnotationItemProvider != null) ePackageModelGenAnnotationItemProvider.dispose();
    if (eClassModelGenAnnotationItemProvider != null) eClassModelGenAnnotationItemProvider.dispose();
    if (eAttributeModelGenAnnotationItemProvider != null) eAttributeModelGenAnnotationItemProvider.dispose();
    if (eReferenceModelGenAnnotationItemProvider != null) eReferenceModelGenAnnotationItemProvider.dispose();
    if (eEnumModelGenAnnotationItemProvider != null) eEnumModelGenAnnotationItemProvider.dispose();
    if (eDataTypeModelGenAnnotationItemProvider != null) eDataTypeModelGenAnnotationItemProvider.dispose();
    if (daoFinderDefinitionItemProvider != null) daoFinderDefinitionItemProvider.dispose();
  }

}