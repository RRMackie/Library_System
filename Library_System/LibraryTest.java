

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTest
{
    private Library library1;
    private EBook eBook1;
    private Book book1;
    private Journal journal1;
    private Author author1;
    private EBook eBook2;
    private Book book2;
    private Journal journal2;
    private Author author2;
    private LibraryMember libraryM1;
    private GuestMember guestMem1;

    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    

    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        library1 = new Library();
        eBook1 = new EBook("1984", 2);
        book1 = new Book("Animal Farm", "1212122121345", 25);
        journal1 = new Journal("Why I Write", "Humanity Studies", "www.orwell.com");
        author1 = new Author("George", "Orwell", "England");
        eBook2 = new EBook("The Mist", 3);
        book2 = new Book("The Shining", "6667787878765", 35);
        journal2 = new Journal("The style of Stephen King", "Literature", "www.somewhere.com");
        author2 = new Author("Stephen", "King", "Maine");
        libraryM1 = new LibraryMember("252525", "Robert", "Ayr");
        guestMem1 = new GuestMember("GUE22223", "Guest", "Guest");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void addResource_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(eBook1);
        library1.addResource(eBook2);
        library1.addResource(journal1);
        library1.addResource(journal2);
    }

    @Test
    public void addResource_Neg()
    {
        library1.addResource(book1);
        library1.addResource(book1);
        library1.addResource(book1);
    }
    
    @Test
    public void borrowResource_Pos()
    {
        library1.addResource(book1);
        libraryM1.borrowResource(book1);
    }
    
    @Test
    public void borrowResource_Neg()
    {
        library1.borrowBook(book1, libraryM1);
    }

    @Test
    public void printDetails_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(eBook1);
        library1.addResource(eBook2);
        library1.addResource(journal1);
        library1.addResource(journal2);
        library1.printLibraryDetails();
        library1.addAuthor(author1);
        library1.addAuthor(author2);
        author1.addResource(book1, author1);
        library1.borrowBook(book1, libraryM1);
        library1.printLibraryDetails();
    }

    @Test
    public void printDetails_Neg()
    {
        library1.printLibraryDetails();
    }

    @Test
    public void editAuthor_Pos()
    {
        library1.addAuthor(author1);
        library1.addResource(book1);
        author1.addResource(book1, author1);
        library1.changeAuthorFirstName(book1, "Greg");
        library1.printLibraryDetails();
    }

    @Test
    public void editAuthor_Neg()
    {
        library1.changeAuthorFirstName(book1, "Greg");
    }

    @Test
    public void searchForTitle_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(book1);
        library1.addResource(eBook1);
        library1.searchForTitle("Animal Farm");
    }

    @Test
    public void searchForTitle_Neg()
    {
        library1.searchForTitle("Animal Farm");
    }

    @Test
    public void searchForAuthor_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addAuthor(author1);
        library1.addAuthor(author2);
        author1.addResource(book1, author1);
        library1.addResource(eBook1);
        author1.addResource(eBook1, author1);
        library1.searchForAuthor("Orwell");
    }

    @Test
    public void searchForAuthor_Neg()
    {
        library1.searchForAuthor("King");
    }

    @Test
    public void borrowBook_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.borrowBook(book1, libraryM1);
        library1.printLibraryDetails();
    }

    @Test
    public void borrowBook_Neg()
    {
        library1.borrowBook(book1, libraryM1);
    }

    @Test
    public void returnBook_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.borrowBook(book1, libraryM1);
        library1.printLibraryDetails();
        library1.returnBook(book1, libraryM1, true, "Tear on Cover");
        library1.printLibraryDetails();
        book1.display();
    }

    @Test
    public void returnBook_Neg()
    {
        library1.returnBook(book1, libraryM1, true, "Tear on cover");
        library1.addResource(book1);
        library1.addResource(book2);
        library1.borrowBook(book1, libraryM1);
        library1.returnBook(book2, libraryM1, false, "");
    }

    @Test
    public void addAuthor_Pos()
    {
        library1.addAuthor(author1);
        library1.addAuthor(author2);
    }

    @Test
    public void addAuthor_Neg()
    {
        library1.addAuthor(author1);
        library1.addAuthor(author1);
    }

    @Test
    public void printAvailableResources_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(eBook1);
        library1.addResource(eBook2);
        library1.addResource(journal1);
        library1.addResource(journal2);
        library1.printAvailableResources();
        library1.borrowBook(book1, libraryM1);
        library1.printAvailableResources();
    }

    @Test
    public void printPhysicalRes_Pos()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(eBook1);
        library1.addResource(eBook2);
        library1.printPhysicalResources();
    }

    @Test
    public void printPhysicalRes_Neg()
    {
        library1.addResource(eBook1);
        library1.addResource(eBook2);
        library1.printPhysicalResources();
    }

    @Test
    public void printElectronicRes_Pos()
    {
        library1.addResource(eBook1);
        library1.addResource(eBook2);
        library1.printElectronic();
    }

    @Test
    public void printElectronic_Neg()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.printElectronic();
    }

    @Test
    public void removeResource()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(eBook1);
        library1.removeResource(book2);
        library1.printLibraryDetails();
    }

    @Test
    public void removeResourceIndex()
    {
        library1.addResource(book1);
        library1.addResource(book2);
        library1.addResource(eBook1);
        library1.printLibraryDetails();
        library1.removeResource(0);
        library1.removeResource(1);
        library1.printLibraryDetails();
    }
}

























