import java.util.ArrayList;

/**
 * Simulates an online journal resource for a library.
 * This is a subclass to the Resource class with variables
 * that are specific to journals.
 *
 * @author Robert Mackie
 * @version 0.6 26/11/23
 */
public class Journal extends Resource
{
    private boolean availableToDownload;
    private String researchArea;
    private String availableFrom;

    /**
     * Constructor for objects of class Journal.When instantiated the constructer contains a
     * conditional statement to set the download availability to true due to setting the
     * resAvailability when the object is added to the library.
     * This can also be manually set by a method.
     * 
     * @param String title    Add in the title of the Journal
     * @param String specificResearch   Add the area of research for this Journal
     * @param String foundAt    Add the Url/source of this journal
     */
    public Journal(String title, String specificResearch, String foundAt)
    {
        super(title);
        if (resAvailability = true){
            availableToDownload = true;
        }
        researchArea = specificResearch;
        availableFrom = foundAt;
    }

    /**
     * Show if the Journal is available to download
     * 
     * @return boolean availableToDownload    Returns the vale of the boolean
     */
    public boolean getDownloadAvailablity()
    {
        return availableToDownload;
    }
    
    /**
     * Set the Journals download availability.
     * 
     * @param boolean apdateDownload   Set the download to 'true' or 'false'
     */
    public void ableToDownload(boolean updateDownload)
    {
         availableToDownload = updateDownload;
    }

    /**
     * Show the research area of the Journal
     */
    public String getResearchArea()
    {
        return researchArea;
    }
     
    /**
     * Update the Journals Research Area
     * 
     * @param String updateResearch    Updates the ResearchArea value 
     */
    public void setArea(String updateResearch)
    {
        researchArea = updateResearch;
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
           System.out.println("Downloadable: " + "This Journal is available online");
        } 
        else {
           System.out.println("Downloadable: " + "This e-book is not available online");
        }      
        System.out.println("Area Research: " + researchArea);
        System.out.println("Available from: " + availableFrom);
    }
}
