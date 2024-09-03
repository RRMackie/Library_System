import java.util.ArrayList;

/**
 * The LibraryMember class simulates a user of the library.
 * This class works as a subclass to the user superclass but has specific variables.
 * It has special priveleges compared to a guest user in that
 * it can borrow a list of books.
 *
 * @author Robert Mackie
 * @version 0.6 28/11/23
 */
public class LibraryMember extends User
{
    private ArrayList <Resource> overdue;
    private int timesOverdue;
    /**
     * Constructor for objects of class LibraryMember
     * 
     * @param String ID    Enters a Library Members ID
     * @param String name    Enters a Libraary Members name
     * @param String address    Enters a library Members address
     * @Override boolean isMember     Sets isMember in superclass to true
     */
    public LibraryMember(String ID, String name, String address)
    {
        super(ID, name, address);
        boolean isMember = true;
        overdue = new ArrayList<>();
        timesOverdue = 0;
    }
    
    /**
     * Get the arraylist collection of borrowed objects.
     * 
     * @return ArrayList borrowed    Return values assigned to borrowed ArrayList
     * 
     */
    public ArrayList borrowed()
    {
        return onLoan;
    }
    
     /**
     * Get the number of of borrowed objects.
     * 
     * @return int amountBorrowed    Return int value of borrowed resources
     * 
     */
    public int amountBorrowed()
    {
        return onLoan.size();
    }
    
    /**
     * Get the arraylist collection of overdue objects.
     * 
     * @return ArrayList overdue    Return values assigned to overdue ArrayList
     * 
     */
    public ArrayList overdue()
    {
        return overdue;
    }    
    
    /**
     * Get the boolean value for the isMember datafield
     * There will be no setter method for the value as the
     * isMember field is defined by object instance.
     * 
     * @return ArrayList isMember    value for isMember field
     */
    public boolean isMember()
    {
        return isMember;
    }
    
    /**
     * Get the amount of times a Library Member has been overdue
     * 
     * @return int timesOverdue    The amount of times a member has been overdue
     */
    public int timesOverdue()
    {
        return timesOverdue;
    }
    
     /**
     * Add a resource to the library Members currently borrowed list
     *
     * @param  Resource resource The resource object to be added to the list.
     * 
     */
    public void borrowResource(Resource resource)
    {
        if (onLoan.contains(resource)){
            System.out.println("The library member is already borrowing this resource");
        }
        else{
            onLoan.add(resource);
            System.out.println("The resource was added successfully to the borrowed list");
        }
    }
    
    /**
     * Get the arraylist collection of borrowed objects.
     * 
     * @param int updateOverdue    Update the amount of times overdue
     * 
     */
    public void setTimesOverdue(int updateOverdue)
    {
        timesOverdue = updateOverdue;
    }
    
    /**
     * Display the details of this user.
     * Prints out inherited values through calling printDetails method
     * and values specific to this class in terminal window.
     */
    public void display()
    {
        printUserDetails();
        for(Resource resource : onLoan) {
        System.out.println("Current Resources Borrowed: " + resource.resTitle);
      }
       
      for(Resource resource : overdue) {
        System.out.println("Current Resources Overdue: " + resource.resTitle);
        timesOverdue += 1;
       }
       System.out.println("Total Times Overdue: " + timesOverdue);
    }
}
