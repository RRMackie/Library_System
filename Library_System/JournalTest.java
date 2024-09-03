

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class JournalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JournalTest
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
     * Default constructor for test class JournalTest
     */
    public JournalTest()
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
        journal1.display();
        assertEquals(true, journal1.getDownloadAvailablity());
        assertEquals("Humanity Studies", journal1.getResearchArea());
    }

    @Test
    public void checkSetters()
    {
        journal1.ableToDownload(false);
        assertEquals(false, journal1.getDownloadAvailablity());
        journal1.setArea("Literature");
        assertEquals("Literature", journal1.getResearchArea());
    }
}


