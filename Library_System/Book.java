import java.util.ArrayList;

/**
 * A class that simulates the properties of a physical book.
 * This calls acts as a subclass of the Resource class but has
 * specific variables.
 *
 * @author Robert Mackie
 * @version 0.5 26/11/23
 */
public class Book extends Resource
{
    public String bookISBN;
    public int bookFee;
    private ArrayList<String> bookDamage;

    /**
     * Constructor for objects of class Book. The method uses parameters to set default
     * values for the object instance.
     * 
     * @ param String title    The name of the book object
     * @ param String ISBN     The ISBN of the book (13 digits long)
     * @ param int fee         The fee of the book if overdue/damaged
     */
    public Book(String title, String ISBN, int fee)
    {
        super(title);
        bookISBN = ISBN;
        bookFee = fee;
    }
    
    /**
     * Show the ISBN for the Book
     * 
     * @return String getISBN    The ISBN of the book object
     */
    public String getISBN()
    {
        return bookISBN;
    }
    
    /**
     * Show the current fee if the book is overdue or damaged.
     * 
     * @return int getFee   The fee value of the book object
     */
    public int getFee()
    {
        return bookFee;
    }
    
    /**
     * Update the books fee if late or damaged
     * 
     * @param int updateFee   Set the fee value of the book object
     */
    public void setFee(int updateFee)
    {
        bookFee = updateFee;
    }
    
     /**
     * Display the details of this post.
     * Prints out inherited values through calling printDetails method
     * and values specific to this class in terminal window.
     * 
     */
    public void display()
    {
        printDetails();
        System.out.println("ISBN: " + bookISBN);
        System.out.println("Book Fee: " + "£" + bookFee);
    }
}
