

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
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
     * Default constructor for test class BookTest
     */
    public BookTest()
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
    public void checkConstructors()
    {
        book1.display();
        assertEquals(25, book1.getFee());
        assertEquals("1212122121345", book1.getISBN());
    }

    @Test
    public void setFee()
    {
        assertEquals(25, book1.getFee());
        book1.setFee(15);
        assertEquals(15, book1.getFee());
    }
}


