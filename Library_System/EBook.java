import java.util.ArrayList;

/**
 * A class that simulates an online book or e-book found in library systems.
 * This class functions as a subclass to the Resource class, with specific
 * varibles for a digital book.
 *
 * @author Robert Mackie
 * @version 0.5 26/11/23
 */
public class EBook extends Resource
{
    public boolean availableToDownload;
    private int downloadTimeLimit;

    /**
     * Constructor for objects of class EBook. When instantiated the constructer contains a
     * conditional statement to set the download availability to true due to setting the
     * resAvailability when the object is added to the library.
     * This can also be manually set by a method.
     * 
     * @ param string title    The title of the book
     * @ param int timeLimit    The amount of days the book can be downloaded for
     */
    public EBook(String title, int timeLimit)
    {
        super(title);
        if (resAvailability = true){
            availableToDownload = true;
        }
        downloadTimeLimit = timeLimit;
    }

    /**
     * Show if the e-book is available for download
     * 
     * @return boolean getdownloadAvailability    Return if the Ebook can be downloaded
     */
    public boolean getdownloadAvailability()
    {
        return availableToDownload;
    }
    
    /**
     * Set the Ebooks download availability.
     * 
     * @param boolean updateDownload   Set the download to 'true' or 'false'
     */
    public void ableToDownload(boolean updateDownload)
    {
         availableToDownload = updateDownload;
    }
    
    /**
     * Show the current time limit for download for the EBook object
     * 
     * @return int getDownloadLimit    Return the value for the download limit
     */
    public int getDownloadLimit()
    {
        return downloadTimeLimit;
    }
    
    /**
     * Update the Ebooks download time
     * 
     * @param int updateLimit    Set the download limit value
     */
    public void setLimit(int updateLimit)
    {
        downloadTimeLimit = updateLimit;
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
        if (availableToDownload = true){
           System.out.println("Downloadable: " + "This e-book is available online");
        } 
        else {
           System.out.println("Downloadable: " + "This e-book is not available online");
        }      
        System.out.println("Download Limit: " + downloadTimeLimit + " Days");
    }
    
}
