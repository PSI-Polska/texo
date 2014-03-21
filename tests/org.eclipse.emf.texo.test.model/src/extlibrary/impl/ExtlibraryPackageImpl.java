/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibraryPackageImpl.java,v 1.4 2011/08/25 14:34:34 mtaal Exp $
 */
package extlibrary.impl;

import extlibrary.Addressable;
import extlibrary.AudioVisualItem;
import extlibrary.Book;
import extlibrary.BookCategory;
import extlibrary.BookOnTape;
import extlibrary.Borrower;
import extlibrary.CirculatingItem;
import extlibrary.Employee;
import extlibrary.ExtlibraryFactory;
import extlibrary.ExtlibraryPackage;
import extlibrary.Item;
import extlibrary.Lendable;
import extlibrary.Library;
import extlibrary.Periodical;
import extlibrary.Person;
import extlibrary.VideoCassette;
import extlibrary.Writer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExtlibraryPackageImpl extends EPackageImpl implements ExtlibraryPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass bookEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass libraryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass writerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass lendableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass circulatingItemEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass periodicalEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass audioVisualItemEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass bookOnTapeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass videoCassetteEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass borrowerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass employeeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass addressableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum bookCategoryEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see extlibrary.ExtlibraryPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExtlibraryPackageImpl() {
    super(eNS_URI, ExtlibraryFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>
   * This method is used to initialize {@link ExtlibraryPackage#eINSTANCE} when that field is accessed. Clients should
   * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExtlibraryPackage init() {
    if (isInited)
      return (ExtlibraryPackage) EPackage.Registry.INSTANCE.getEPackage(ExtlibraryPackage.eNS_URI);

    // Obtain or create and register package
    ExtlibraryPackageImpl theExtlibraryPackage = (ExtlibraryPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtlibraryPackageImpl ? EPackage.Registry.INSTANCE
        .get(eNS_URI) : new ExtlibraryPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExtlibraryPackage.createPackageContents();

    // Initialize created meta-data
    theExtlibraryPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExtlibraryPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExtlibraryPackage.eNS_URI, theExtlibraryPackage);
    return theExtlibraryPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getBook() {
    return bookEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBook_Title() {
    return (EAttribute) bookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBook_Pages() {
    return (EAttribute) bookEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBook_Category() {
    return (EAttribute) bookEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBook_Author() {
    return (EReference) bookEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getLibrary() {
    return libraryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getLibrary_Name() {
    return (EAttribute) libraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_Writers() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_Employees() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_Borrowers() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_Stock() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_Books() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_Branches() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLibrary_ParentBranch() {
    return (EReference) libraryEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getLibrary_People() {
    return (EAttribute) libraryEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getWriter() {
    return writerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getWriter_Name() {
    return (EAttribute) writerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getWriter_Books() {
    return (EReference) writerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getItem() {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getItem_PublicationDate() {
    return (EAttribute) itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getLendable() {
    return lendableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getLendable_Copies() {
    return (EAttribute) lendableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getLendable_Borrowers() {
    return (EReference) lendableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCirculatingItem() {
    return circulatingItemEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPeriodical() {
    return periodicalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPeriodical_Title() {
    return (EAttribute) periodicalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPeriodical_IssuesPerYear() {
    return (EAttribute) periodicalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAudioVisualItem() {
    return audioVisualItemEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAudioVisualItem_Title() {
    return (EAttribute) audioVisualItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAudioVisualItem_MinutesLength() {
    return (EAttribute) audioVisualItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAudioVisualItem_Damaged() {
    return (EAttribute) audioVisualItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getBookOnTape() {
    return bookOnTapeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBookOnTape_Reader() {
    return (EReference) bookOnTapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBookOnTape_Author() {
    return (EReference) bookOnTapeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getVideoCassette() {
    return videoCassetteEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVideoCassette_Cast() {
    return (EReference) videoCassetteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getBorrower() {
    return borrowerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBorrower_Borrowed() {
    return (EReference) borrowerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPerson() {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPerson_FirstName() {
    return (EAttribute) personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPerson_LastName() {
    return (EAttribute) personEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEmployee() {
    return employeeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmployee_Manager() {
    return (EReference) employeeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAddressable() {
    return addressableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAddressable_Address() {
    return (EAttribute) addressableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getBookCategory() {
    return bookCategoryEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ExtlibraryFactory getExtlibraryFactory() {
    return (ExtlibraryFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its
   * first. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    bookEClass = createEClass(BOOK);
    createEAttribute(bookEClass, BOOK__TITLE);
    createEAttribute(bookEClass, BOOK__PAGES);
    createEAttribute(bookEClass, BOOK__CATEGORY);
    createEReference(bookEClass, BOOK__AUTHOR);

    libraryEClass = createEClass(LIBRARY);
    createEAttribute(libraryEClass, LIBRARY__NAME);
    createEReference(libraryEClass, LIBRARY__WRITERS);
    createEReference(libraryEClass, LIBRARY__EMPLOYEES);
    createEReference(libraryEClass, LIBRARY__BORROWERS);
    createEReference(libraryEClass, LIBRARY__STOCK);
    createEReference(libraryEClass, LIBRARY__BOOKS);
    createEReference(libraryEClass, LIBRARY__BRANCHES);
    createEReference(libraryEClass, LIBRARY__PARENT_BRANCH);
    createEAttribute(libraryEClass, LIBRARY__PEOPLE);

    writerEClass = createEClass(WRITER);
    createEAttribute(writerEClass, WRITER__NAME);
    createEReference(writerEClass, WRITER__BOOKS);

    itemEClass = createEClass(ITEM);
    createEAttribute(itemEClass, ITEM__PUBLICATION_DATE);

    lendableEClass = createEClass(LENDABLE);
    createEAttribute(lendableEClass, LENDABLE__COPIES);
    createEReference(lendableEClass, LENDABLE__BORROWERS);

    circulatingItemEClass = createEClass(CIRCULATING_ITEM);

    periodicalEClass = createEClass(PERIODICAL);
    createEAttribute(periodicalEClass, PERIODICAL__TITLE);
    createEAttribute(periodicalEClass, PERIODICAL__ISSUES_PER_YEAR);

    audioVisualItemEClass = createEClass(AUDIO_VISUAL_ITEM);
    createEAttribute(audioVisualItemEClass, AUDIO_VISUAL_ITEM__TITLE);
    createEAttribute(audioVisualItemEClass, AUDIO_VISUAL_ITEM__MINUTES_LENGTH);
    createEAttribute(audioVisualItemEClass, AUDIO_VISUAL_ITEM__DAMAGED);

    bookOnTapeEClass = createEClass(BOOK_ON_TAPE);
    createEReference(bookOnTapeEClass, BOOK_ON_TAPE__READER);
    createEReference(bookOnTapeEClass, BOOK_ON_TAPE__AUTHOR);

    videoCassetteEClass = createEClass(VIDEO_CASSETTE);
    createEReference(videoCassetteEClass, VIDEO_CASSETTE__CAST);

    borrowerEClass = createEClass(BORROWER);
    createEReference(borrowerEClass, BORROWER__BORROWED);

    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__FIRST_NAME);
    createEAttribute(personEClass, PERSON__LAST_NAME);

    employeeEClass = createEClass(EMPLOYEE);
    createEReference(employeeEClass, EMPLOYEE__MANAGER);

    addressableEClass = createEClass(ADDRESSABLE);
    createEAttribute(addressableEClass, ADDRESSABLE__ADDRESS);

    // Create enums
    bookCategoryEEnum = createEEnum(BOOK_CATEGORY);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
   * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bookEClass.getESuperTypes().add(this.getCirculatingItem());
    libraryEClass.getESuperTypes().add(this.getAddressable());
    writerEClass.getESuperTypes().add(this.getPerson());
    circulatingItemEClass.getESuperTypes().add(this.getItem());
    circulatingItemEClass.getESuperTypes().add(this.getLendable());
    periodicalEClass.getESuperTypes().add(this.getItem());
    audioVisualItemEClass.getESuperTypes().add(this.getCirculatingItem());
    bookOnTapeEClass.getESuperTypes().add(this.getAudioVisualItem());
    videoCassetteEClass.getESuperTypes().add(this.getAudioVisualItem());
    borrowerEClass.getESuperTypes().add(this.getPerson());
    personEClass.getESuperTypes().add(this.getAddressable());
    employeeEClass.getESuperTypes().add(this.getPerson());

    // Initialize classes and features; add operations and parameters
    initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBook_Title(), ecorePackage.getEString(), "title", "Book", 0, 1, Book.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBook_Pages(), ecorePackage.getEInt(), "pages", "100", 0, 1, Book.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBook_Category(), this.getBookCategory(), "category", null, 0, 1, Book.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Author(), this.getWriter(), this.getWriter_Books(), "author", null, 1, 1, Book.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_Writers(), this.getWriter(), null, "writers", null, 0, -1, Library.class, IS_TRANSIENT,
        IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
        IS_ORDERED);
    initEReference(getLibrary_Employees(), this.getEmployee(), null, "employees", null, 0, -1, Library.class,
        IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_Borrowers(), this.getBorrower(), null, "borrowers", null, 0, -1, Library.class,
        IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_Stock(), this.getItem(), null, "stock", null, 0, -1, Library.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        !IS_ORDERED);
    initEReference(getLibrary_Books(), this.getBook(), null, "books", null, 0, -1, Library.class, IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
        !IS_ORDERED);
    initEReference(getLibrary_Branches(), this.getLibrary(), this.getLibrary_ParentBranch(), "branches", null, 0, -1,
        Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_ParentBranch(), this.getLibrary(), this.getLibrary_Branches(), "parentBranch", null, 0,
        1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLibrary_People(), ecorePackage.getEFeatureMapEntry(), "people", null, 0, -1, Library.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(writerEClass, Writer.class, "Writer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWriter_Name(), ecorePackage.getEString(), "name", "Jim", 0, 1, Writer.class, IS_TRANSIENT,
        IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWriter_Books(), this.getBook(), this.getBook_Author(), "books", null, 0, -1, Writer.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItem_PublicationDate(), ecorePackage.getEDate(), "publicationDate", null, 0, 1, Item.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lendableEClass, Lendable.class, "Lendable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLendable_Copies(), ecorePackage.getEInt(), "copies", null, 1, 1, Lendable.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLendable_Borrowers(), this.getBorrower(), this.getBorrower_Borrowed(), "borrowers", null, 0, -1,
        Lendable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(circulatingItemEClass, CirculatingItem.class, "CirculatingItem", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(periodicalEClass, Periodical.class, "Periodical", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPeriodical_Title(), ecorePackage.getEString(), "title", null, 0, 1, Periodical.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPeriodical_IssuesPerYear(), ecorePackage.getEInt(), "issuesPerYear", null, 1, 1,
        Periodical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(audioVisualItemEClass, AudioVisualItem.class, "AudioVisualItem", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAudioVisualItem_Title(), ecorePackage.getEString(), "title", null, 0, 1, AudioVisualItem.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAudioVisualItem_MinutesLength(), ecorePackage.getEInt(), "minutesLength", null, 1, 1,
        AudioVisualItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAudioVisualItem_Damaged(), ecorePackage.getEBoolean(), "damaged", null, 0, 1,
        AudioVisualItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(bookOnTapeEClass, BookOnTape.class, "BookOnTape", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBookOnTape_Reader(), this.getPerson(), null, "reader", null, 0, 1, BookOnTape.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getBookOnTape_Author(), this.getWriter(), null, "author", null, 0, 1, BookOnTape.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(videoCassetteEClass, VideoCassette.class, "VideoCassette", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVideoCassette_Cast(), this.getPerson(), null, "cast", null, 0, -1, VideoCassette.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(borrowerEClass, Borrower.class, "Borrower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorrower_Borrowed(), this.getLendable(), this.getLendable_Borrowers(), "borrowed", null, 0, -1,
        Borrower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Person.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Person.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmployee_Manager(), this.getEmployee(), null, "manager", null, 0, 1, Employee.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(addressableEClass, Addressable.class, "Addressable", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddressable_Address(), ecorePackage.getEString(), "address", null, 0, 1, Addressable.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(bookCategoryEEnum, BookCategory.class, "BookCategory");
    addEEnumLiteral(bookCategoryEEnum, BookCategory.MYSTERY);
    addEEnumLiteral(bookCategoryEEnum, BookCategory.SCIENCE_FICTION);
    addEEnumLiteral(bookCategoryEEnum, BookCategory.BIOGRAPHY);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void createExtendedMetaDataAnnotations() {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    addAnnotation(getLibrary_Writers(), source, new String[] { "group", "#people" });
    addAnnotation(getLibrary_Employees(), source, new String[] { "group", "#people" });
    addAnnotation(getLibrary_Borrowers(), source, new String[] { "group", "#people" });
    addAnnotation(getLibrary_People(), source, new String[] { "kind", "group" });
  }

} // ExtlibraryPackageImpl