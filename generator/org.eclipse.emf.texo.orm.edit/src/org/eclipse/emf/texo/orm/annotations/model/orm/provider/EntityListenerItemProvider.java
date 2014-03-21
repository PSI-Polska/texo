/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityListenerItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EntityListenerItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EntityListenerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptionPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityListener_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityListener_description_feature", "_UI_EntityListener_type"),
				 OrmPackage.eINSTANCE.getEntityListener_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityListener_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityListener_class_feature", "_UI_EntityListener_type"),
				 OrmPackage.eINSTANCE.getEntityListener_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PrePersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PostPersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PreRemove());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PostRemove());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PreUpdate());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PostUpdate());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityListener_PostLoad());
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns EntityListener.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EntityListener"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((EntityListener)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityListener_type") :
			getString("_UI_EntityListener_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EntityListener.class)) {
			case OrmPackage.ENTITY_LISTENER__DESCRIPTION:
			case OrmPackage.ENTITY_LISTENER__CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ENTITY_LISTENER__PRE_PERSIST:
			case OrmPackage.ENTITY_LISTENER__POST_PERSIST:
			case OrmPackage.ENTITY_LISTENER__PRE_REMOVE:
			case OrmPackage.ENTITY_LISTENER__POST_REMOVE:
			case OrmPackage.ENTITY_LISTENER__PRE_UPDATE:
			case OrmPackage.ENTITY_LISTENER__POST_UPDATE:
			case OrmPackage.ENTITY_LISTENER__POST_LOAD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PrePersist(),
				 OrmFactory.eINSTANCE.createPrePersist()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PostPersist(),
				 OrmFactory.eINSTANCE.createPostPersist()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PreRemove(),
				 OrmFactory.eINSTANCE.createPreRemove()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PostRemove(),
				 OrmFactory.eINSTANCE.createPostRemove()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PreUpdate(),
				 OrmFactory.eINSTANCE.createPreUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PostUpdate(),
				 OrmFactory.eINSTANCE.createPostUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityListener_PostLoad(),
				 OrmFactory.eINSTANCE.createPostLoad()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator() {
		return Eclipselink_ormEditPlugin.INSTANCE;
	}

}