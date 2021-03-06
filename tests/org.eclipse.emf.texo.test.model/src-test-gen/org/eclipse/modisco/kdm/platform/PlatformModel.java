package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.kdm.KDMModel;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PlatformModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_PlatformModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PlatformModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractPlatformElement> platformElement = new HashSet<AbstractPlatformElement>();

  /**
   * Returns the value of '<em><b>platformElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>platformElement</b></em>' feature
   * @generated
   */
  public Set<AbstractPlatformElement> getPlatformElement() {
    return platformElement;
  }

  /**
   * Adds to the <em>platformElement</em> feature.
   * 
   * @param platformElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToPlatformElement(AbstractPlatformElement platformElementValue) {
    if (!platformElement.contains(platformElementValue)) {
      boolean result = platformElement.add(platformElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>platformElement</em> feature.
   * 
   * @param platformElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromPlatformElement(AbstractPlatformElement platformElementValue) {
    if (platformElement.contains(platformElementValue)) {
      boolean result = platformElement.remove(platformElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>platformElement</em> feature.
   * 
   * @generated
   */
  public void clearPlatformElement() {
    while (!platformElement.isEmpty()) {
      removeFromPlatformElement(platformElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link PlatformModel#getPlatformElement() <em>platformElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPlatformElement
   *          the new value of the '{@link PlatformModel#getPlatformElement() platformElement}' feature.
   * @generated
   */
  public void setPlatformElement(Set<AbstractPlatformElement> newPlatformElement) {
    platformElement = newPlatformElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PlatformModel ";
  }
}
