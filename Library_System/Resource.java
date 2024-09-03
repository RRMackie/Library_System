import java.util.ArrayList;

/**
 * This class stores the information about a resource (book/e-book).
 * Resources can be stored and dsiplayed. This class serves as superclass for
 * more specific resource types.
 *
 * @author Robert Mackie
 * @version 1.2 29/11/23
 */
public class Resource
{
    public String resTitle;
    public int noOfCopies;
    public int loanTime;
    public int noOfTimesLoaned;
    public boolean resAvailability;
    public ArrayList<String> bookDamage;
    public ArrayList<Author> resourceAuthor;
    public ArrayList<User> resourceUser;
    /**
     * Constructor for objects of class Resource
     * Acts as a superclass for the individual resources and
     * will use the same datafields to initialise
     * 
     * @param resTitle title  Set the title of the resource.
     */
    public Resource(String title)
    {
        resTitle = title;
        noOfCopies = 0;
        loanTime = 0;
        noOfTimesLoaned = 0;
        resAvailability = false;
        bookDamage = new ArrayList<>();
        resourceAuthor = new ArrayList<>();
        resourceUser = new ArrayList<>();
    }
    
    /**
     * Attribute the resource to an Author Object.
     * This method is called by the Author class when adding the Resource
     * to the Author object and updates arraylists on both classes.
     *
     * @param Author Author The Author Object to be added
     */
    public void updateAuthor(Author author)
    {
        if (resourceAuthor.size() == 1){
            System.out.println("This resource already has an Author");
        }
        else{
            resourceAuthor.add(author);
            System.out.println("The resource's Author has been updated");
        }
    }
        
     /**
     * Remove the author object attributed to the resource.
     * 
     * Can be used independently with any subclasses to remove any
     * set Author.
     */
    public void removeAuthor()
    {
        resourceAuthor.remove(0);
        System.out.println("This books Author has been removed");
    }
    
     /**
     * Attribute the resource to an User Object.
     * This method is called by the Library class when adding the Resource
     * to the Library Member object and updates arraylists on both classes.
     *
     * @param User LibraryMember The LibraryMember Object to be added
     */
    public void updateUser(User LibraryMember)
    {
        if (resourceUser.size() == 1){
            System.out.println("This resource is currently being borrowed");
        }
        else{
            resourceUser.add(LibraryMember);
            System.out.println("The current resource user has been updated");
        }
    }
   
    /**
     * Remove the user object attributed to the resource.
     * Called during the method in library to return a borrowed resources.
     * 
     * Can be used independently with any subclasses to remove any
     * set user.
     * 
     */
    public void removeUser()
    {
        resourceUser.remove(0);
        System.out.println("This books user has been removed");
    }
    
    /**
     * A method to print the details of each resource that are initalised
     * in the superclass. Each individual resource will call this method when 
     * printing any details of each object instance.
     */ 
    public void printDetails() {
         System.out.println("Name: " + resTitle);
         System.out.println("Number of copies: " + noOfCopies);
         System.out.println("Loan Time: " + loanTime);
         System.out.println("Times Loaned: " + noOfTimesLoaned);
        if (noOfCopies > 0 ){
            resAvailability = true;
            System.out.println("Availability: " + 
            "A copy is available in the library");
        } 
        else {
            System.out.println("Availability: " + 
            "No copies are currently available in the library");
        }
        if (resourceAuthor != null && resourceAuthor.size() == 0 ){
            System.out.println("Author:" + 
            "There is currently no Author for this resource");
        } 
        else {
            Author existingAuthor = resourceAuthor.get(0);
            System.out.println("Author: " + existingAuthor.fName + ""
             + existingAuthor.lName);
        }
        if (resourceUser != null && resourceUser.size() == 0){
            System.out.println("User: " +
            "There is currently no User for this resource");
        } 
        else {
            User currentUser = resourceUser.get(0);
            System.out.println("User: " + currentUser.memberName);
        }
    }
}
