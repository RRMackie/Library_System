import java.util.ArrayList;

/**
 * The superclass User defines a typical person using a library.
 * It uses parameters to define similar aspects between a
 * library member and a guest member to the libary and acts as
 * a superclass to those specific subclasses.
 *
 * @author Robert Mackie
 * @version 0.5 25/11/23
 */
public class User
{
    public String memberID;
    public String memberName;
    public String memberAddress;
    public boolean isMember;
    public ArrayList <Resource> onLoan;

    /**
     * Constructor for objects of superclass User
     *
     * @param ID     The users ID number
     * @param name    The users full name
     * @param address    The users current address
     */
    public User(String ID, String name, String address)
    {
        memberID = ID;
        memberName = name;
        memberAddress = address;
        isMember = true;
        onLoan = new ArrayList<>();
    }

    /**
     * This method prints out the details of the user. This method works
     * is called in the sublclasses to print details of library members 
     * inherited from this superclass. The if statment allows the system
     * to differentiate between guest user and library members.
     * 
     */
     public void printUserDetails() {
     System.out.println("Member ID: " +  memberID);
     System.out.println("Member Name: " + memberName);
     System.out.println("Member Address: " + memberAddress);
     if (isMember = true) {
         System.out.println("Library Member: " + "This user has full member priveleges");
     }
     else{
         System.out.println("Library Member: " + "This user has guest access");
    }
    } 
}
