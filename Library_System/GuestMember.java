
/**
 * The GuestMember class simulates a guest to the library and is
 * as subclass to the User superclass.
 * The guestMember has set privileges compared to the LibraryMember class
 * in that it only has 3 Days of library access
 *
 * @author Robert Mackie
 * @version 0.4 24/11/23
 */
public class GuestMember extends User
{
    private int daysLibraryAccess;

    /**
     * Constructor for objects of class GuestMember
     * 
     * @param String ID     The guest members ID
     * @param String name    The guest members name
     * @param String address   The guest members address
     * @Override boolean isMember    The boolean value is set to false (default is false)
     */
    public GuestMember(String ID, String name, String address )
    {
        super(ID, name, address);
        isMember = false;
        daysLibraryAccess = 3;
       
    }
    
    /**
     * Get the value for the guest members days of access
     * 
     * @return int daysLibraryAccess    The amount of days for library access
     */
    public int daysLibraryAccess()
    {
        return daysLibraryAccess;
    }
    
       /**
     * Get the boolean value for the isMember datafield
     * There will be no setter method for the value as the
     * isMember field is defined by object instance.
     * 
     * @return boolean isMember    value for isMember field
     */
    public boolean isMember()
    {
        return isMember;
    }
    
      /**
     * Set the value for the guest members days of access
     * 
     * @param int daysAccess    Set the amount of days for guest library access
     */
    public void setAccess(int daysAccess)
    {
        if (daysAccess > 3){
            System.out.println("A Guest Member cannot have more than 3 days access");
        }
        else{
            daysLibraryAccess = daysAccess;
            System.out.println("The amount of days access has been updated");
        }
        
    }
    
    /**
     * Display the details of this user.
     * Prints out inherited values through calling printDetails method
     * in superclass User and values specific to this class in terminal window.
     *
     */
    public void display()
    {
       printUserDetails();
       System.out.println("Days of Library Access: " + daysLibraryAccess + "Days");
    }
}
