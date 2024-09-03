import java.util.ArrayList;

/**
 * A class that operates as an Author. It contains fields for a first name, a last name
 * and the authors address. 
 * There is also an ArrayList to specify materials written in
 * library that is associated with the Resource object.
 *
 * @author Robert Mackie
 * @version 0.5 (28/11/23)
 */
public class Author
{
    public String fName;
    public String lName;
    public String currentAddress;
    public ArrayList <Resource> materialsWritten;

    /**
     * Constructor for objects of class Author
     * 
     * @param String firstName    The first name of the Author
     * @param String lastName    The last name of the Author
     * @param String address    The address of the Author
     */
    public Author(String firstName, String lastName, String address)
    {
        fName = firstName;
        lName = lastName;
        currentAddress = address;
        materialsWritten = new ArrayList<>();
    }

    /**
     * Show the authors fullname by concatenating the string values in fName and lName
     * data fields.
     * 
     * @return String getfullName   Returns the authors full name
     */
    public String getFullName()
    {
        return fName + " " + lName;
    }
    
    /**
     * Show the Authors Address
     * 
     * @return String getAddress    Reuturns the authors address value.
     */
    public String getAddress()
    {
        return currentAddress;
    }
    
     /**
     * This method adds a resource to Arraylist of Materials written, while
     * also calling the updateAuthor method in the resource class. 
     *
     * @param resource The resource/material to be attributed to the Author
     * @param Author   The Author the resource is to be attributed to.
     */
    public void addResource(Resource resource,Author author)
    {
        materialsWritten.add(resource);
        resource.updateAuthor(author);
    }
    

    /**
     * This method displays the details of this Author object by printing
     * them to the terminal.
     * 
     */
    public void showDetails()
    {
        System.out.println("Full Name: " + fName + "" + lName);
        System.out.println("Current Adress: " + currentAddress);
        for (Resource resource : materialsWritten){
            System.out.println("Materials Written: " + resource.resTitle);
     }
    }
    
    /**
     * This method will display the details of any resource object in the
     * Materials written  ArrayList in the Author class .
     *
     * Prints out inherited values of the resource class
     * through calling printDetails method and cycles through
     * specific instances of each resource.
     * 
     */
    public void printMaterials() 
       {
        int index1 = 0;
        while (index1 < materialsWritten.size()){
             Resource materialDetails = materialsWritten.get(index1);
          if(materialDetails instanceof Book){
             System.out.println("Physical book's written by the Author: ");
             materialDetails.printDetails();
             index1++;
             }
             else{
           if(materialDetails instanceof EBook){
             System.out.println("Electronic Book's written by the Author: ");
             materialDetails.printDetails();
             index1++;
            }
             else{
                if(materialDetails instanceof Journal){
             System.out.println("Journal's written by the Author: ");
             materialDetails.printDetails();
             index1++;
              }
            }
            } 
           }
    }
   }
