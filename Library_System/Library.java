import java.util.ArrayList;

/**
 * The Library Class stores all book/e-book related resources in an arraylist,
 * simulating a library that holds resources such as physical books, electronic
 * books and online journals.
 *
 * @author Robert Mackie
 * @version 1.6 (29/11/23)
 */
public class Library
{
    private final ArrayList<Resource> resources;
    private final ArrayList<Resource> borrowed;
    private final ArrayList<Author> authorsAvailable;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        resources = new ArrayList<>();
        borrowed = new ArrayList<>();
        authorsAvailable = new ArrayList<>();
    }

    /**
     * A method to print the details of each resource that is added to the library
     * and the print method is able to differentiate between individual subclass
     * instances (Book, Ebook, Journal)of resources in each list and 
     * prints the instance to the terminal.
     */ 
    public void printLibraryDetails() {
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        boolean noDetails = false;
        while (index1 < resources.size() && noDetails == false){
             Resource resourceDetails = resources.get(index1);
          if(resourceDetails instanceof Book){
             System.out.println("Physical book's currently in the Library: ");
             resourceDetails.printDetails();
             index1++;
             System.out.println();
             }
             else{
           if(resourceDetails instanceof EBook){
             System.out.println("Electronic Book's currently in the Library: ");
             resourceDetails.printDetails();
             index1++;
             System.out.println();
            }
             else{
                if(resourceDetails instanceof Journal){
              System.out.println("Journal's currently in the Library: ");
              resourceDetails.printDetails();
              index1++;
              System.out.println();
              
              }
              else{
               break;
              }
              }
            if(resources.size() == index1 && noDetails == false){
                noDetails = true;
           }
            } 
           }
        if( resources.size() == 0 && noDetails == true){
             System.out.println(
             "There are no resources currently available in the library");
             System.out.println();
              }
              while(index2 < authorsAvailable.size()){
            Author authorDetails = authorsAvailable.get(index2);
            authorDetails.showDetails();
            index2++;
            System.out.println();
        }
        if(authorsAvailable.size() == 0 && index2 == 0){
             System.out.println(
             "There are no Authors currently available in the Library");
             System.out.println();
        }
        while(index3 < borrowed.size()){
            Resource resourceBorrowed = borrowed.get(index3);
            if(resourceBorrowed instanceof Book){
             System.out.println("Physical Book's currently borrowed: ");
             resourceBorrowed.printDetails();
             index3++;
             System.out.println();
             }
             else{
            if(resourceBorrowed instanceof EBook){
             System.out.println("Electromic Book's currently borrowed: ");
             resourceBorrowed.printDetails();
             index3++;
             System.out.println();
             }
             else{
                if(resourceBorrowed instanceof Journal){
             System.out.println("Journal's currently borrowed: ");
             resourceBorrowed.printDetails();
             index3++;
             System.out.println();
            }
            }
          }
         }
        if(borrowed.size() == 0 && index2 == 0){
             System.out.println(
             "There are no resources currently being borrowed from the library");
             System.out.println();
        } 
        }
        
     /**
     * Check if Library currently contains a specific resource
     * 
     * @ param Resource resource    The resource that you are checking for
     */
    public boolean checkLibrary(Resource resource)
    {
        if (resources.contains(resource)) {
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * A method to edit an author objects first name.
     * The method first checks if their is an Author Object associated with the resource
     * before allowing any change.
     * 
     * @param   Resource resources    The resource object the Author is attributed to
     * @param   String newName    The new first name for the Author to be changed to
     */
    public void changeAuthorFirstName(Resource resources, String newName)
    {
        if (resources.resourceAuthor != null && resources.resourceAuthor.size() == 0){
            System.out.println("There is no Author object to edit");
        }
        else{
            Author existingAuthor = resources.resourceAuthor.get(0);
            existingAuthor.fName = newName;
            System.out.println("The Authors first name has been updated");
            }  
        }
    
     /**
     * Search through the library ArrayList for a specific resource title.
     * When printing out the number of resources matching the search we also take
     * into account the number of copies of the resource.
     * 
     * @param  String searchString    The book title you are searching for
     */
    public void searchForTitle(String searchString)
      {
        boolean inCatalogue = false;
        int resourcesFound = 0;
        int totalMatches = 0;
          for (Resource resource : resources){
           if(resource.resTitle.equalsIgnoreCase(searchString)) {
            System.out.println("Here is your Search Results: ");
            System.out.println();
            resource.printDetails();
            inCatalogue = true;
            resourcesFound ++;
            totalMatches = resourcesFound + resource.noOfCopies;
            System.out.println("The number of search results found: " + totalMatches);
            }
           else{
            System.out.println("Searching: Library");
            System.out.println("No matches were found");
           }
        }
         if(resources.size() == 0){
             System.out.println("There are no resources in the library");
        } 
    }  
    
    /**
     * Search through the library ArrayList for a specific author by last name.
     * The method will print out the information of the Author and the total 
     * number of resources they have associated with them. The search string also
     * ignores case sensitive searches.
     * 
     * @param  String searchString    The authors last name that you are searching for
     */
    public void searchForAuthor(String searchString)
      {
        boolean inCatalogue = false;
        int resourcesFound = 0;
        int totalMatches = 0;
          for (Author author : authorsAvailable ){
           if(author.lName.equalsIgnoreCase(searchString)) {
            System.out.println("Here is your Search Results: ");
            System.out.println();
            author.printMaterials();
            inCatalogue = true;
            if (author.materialsWritten.isEmpty()){
            System.out.println("There are currently no resources attributed to this Author.");
            }
            else{
            resourcesFound ++;
            totalMatches = resourcesFound;
            System.out.println("The number of search results found: " + totalMatches);
            }
          }
           else{
            System.out.println("Searching: Library");
            System.out.println("No matches were found");
           }
        }
         if(authorsAvailable.size() == 0){
             System.out.println("There are no Authors available within the library");
        } 
    }
    
    /**
     * This method removes a specific resource from the library.
     * The method checks if the resource is in the library and if it is
     * available to be removed (i.e not currently being borrowed)
     *
     * @param Resource resource    The resource object you want to remove
     */
    public void removeResource(Resource resource)
    {
        if( resources.contains(resource) && resource.resAvailability == true){
            resources.remove(resource);
            System.out.println("The resource has been removed successfully from the library");
        }
        else{
            System.out.println("The resource is not currently available to remove");
        }
    } 
    
    /**
     * This method removes a resource from the library at a specified index.
     * The method checks if the resource is in the library and if it is
     * available to be removed (i.e not currently being borrowed)
     *
     * @param int index    The resource you wish to remove from the library
     */
    public void removeResource(int index)
    {
        Resource resourceDetails = resources.get(index);
        if( resources.size() == index && resourceDetails.resAvailability == true){
            resources.remove(index);
            System.out.println("The resource has been removed successfully from the library");
        }
        else{
            System.out.println("The resource is not currently available to remove");
        }
    } 
    
    /**
     * Return the number of total number of resources added to the Library
     * 
     * @return int resources.size    The total size of the resources list
     */
    public int getNumberOfResources()
    {
        return resources.size();
    }
    
    /**
     * Return the ArrayList of Resources added to the Library
     * 
     * @ return ArrayList    The arrraylist containing the resources objects
     */
    public ArrayList getListOfResources()
    {
        return resources;
    }
    
    /**
     * Add an instance of a resource to the library. The conditional
     * statment checks to see if the resource is already in the library
     * before adding. If there is already a copy of the resource then
     * the number of copies is updated to reflect this.
     *
     * @param  resource The resource object to be added to the library.
     * 
     */
    public void addResource(Resource resource)
    {
        if (resources.contains(resource)){
            System.out.println("There is already a copy of this resource is already in your library");
            resource.noOfCopies ++;
        }
        else{
            resources.add(resource);
            resource.noOfCopies ++;
            resource.resAvailability = true;
            System.out.println("The resource was added successfully to your library");
        }
    }
    
    /**
     * A method that allows a library member to borrow a book from the library.
     * 
     * The method takes a Library Member and Resource input then adds the resource
     * to the borrowed arraylist in the Library Class and the onloan ArrayList
     * in the LIbrary Members class. 
     * 
     * The method first checks if the resource is 
     * an instance of a book, if the user is a Library Member, if there is a copy
     * available, if the Library Membership is true, and if there is not already
     * a library member borrowing it.
     * 
     * If the User is a guest member then they are not allowed to borrow books as 
     * it is a member only privilege.
     *
     * @param  resource Resource    The resource to be added
     * @param  user Library Member    The resource object to be borrowed
     * 
     */
    public void borrowBook(Resource resource, User LibraryMember)
    {
        if (resource instanceof Book && LibraryMember == LibraryMember
        && resource.noOfCopies > 0 && LibraryMember.isMember == true 
        && resource.resourceUser.size() == 0){
            borrowed.add(resource);
            LibraryMember.onLoan.add(resource);
            resource.noOfCopies --;
            resource.updateUser(LibraryMember);
            resource.resAvailability = false;
            System.out.println("This book has been added to the borrowed list");
        }
        else{
        if (LibraryMember instanceof GuestMember){
            System.out.println("Guests cannot borrow books");
        }
        else
            System.out.println("Apologies, the book is not available. Please try again another day");
        }
       }  
     
    /**
     * A method that allows a library member to return a book from the library.
     * The method takes a Library Member and Resource input then removes the resource
     * from the borrowed arraylist in the Library Class and the onloan ArrayList
     * in the LIbrary Members class. The method first checks if the resource is 
     * an instance of a book, if the user is a Library Member, if there is a copy
     * available, if the Library Membership is true, and there isn't currently a
     * libraryMember borrowing it.
     * 
     *
     * @param  Resource resource    The resource object to be returned.
     * @param  user Library Member    The the library member that is returning the resource.
     * @param  boolean damage     If there is damage then it should be true, else then false.
     * @param String updateDamage    If there is damage then describe it, else use "".
     * 
     */
    public void returnBook(Resource resource, User LibraryMember, boolean damage,
    String updateDamage){
        if (resource instanceof Book && LibraryMember == LibraryMember
         && LibraryMember.isMember == true 
         && resource.resourceUser.size() == 1){
            borrowed.remove(resources);
            LibraryMember.onLoan.remove(resources);
            resource.removeUser();
            resource.noOfCopies ++;
            resource.noOfTimesLoaned ++;
            System.out.println("This book has been returned to the library");
        }
        if (damage = true){
            resource.bookDamage.add(updateDamage);
            
        }
        else{
            System.out.println("You do not have any books to return");
        }
       }  

    /**
     * A method to add an Author object to the Library.
     * The method checks to see if the Author already exists within the Library before
     * attempting to add the object.
     *
     * @param  Author The author object to be added to the library.
     * 
     */
    public void addAuthor(Author author)
    {
        if (authorsAvailable.contains(author)){
            System.out.println("This Author is already included in your library");
        }
        else{
            authorsAvailable.add(author);
            System.out.println("The Author was added successfully to your library");
        }
    }
    
    /**
     * A method to print the details of only available resources added to the library
     * (i.e not borrowed) and the print method is able to differentiate 
     * between available individual resources in each list and prints the 
     * instances to the terminal.
     */ 
    public void printAvailableResources() {
        int index = 0;
        boolean noDetails = false;
        while (index < resources.size() && noDetails == false){
             Resource resourceDetails = resources.get(index);
          if(resourceDetails instanceof Book && resourceDetails.resAvailability == true
          && resourceDetails.noOfCopies > 0){
             System.out.println("Physical books currently available in the Library: ");
             resourceDetails.printDetails();
             index++;
             System.out.println();
             }
             else{
           if(resourceDetails instanceof EBook && resourceDetails.resAvailability
           && resourceDetails.noOfCopies > 0){
             System.out.println("Electronic Books currently available in the Library: ");
             resourceDetails.printDetails();
             index++;
             System.out.println();
            }
             else{
            if(resourceDetails instanceof Journal && resourceDetails.resAvailability
            && resourceDetails.noOfCopies > 0 ){
              System.out.println("Journals currently available in the Library: ");
              resourceDetails.printDetails();
              index++;
              System.out.println();
              }
              else{
                break;
              }
            }
            } 
           if(resources.size() == index){
                noDetails = true;
          }
          else {
           }
          if(resources.isEmpty() && index == 0){
            System.out.println(
            "There are no resources currently available in the library");
            System.out.println();
              }
        }
    }
        
     /**
     * A method to print the details of only physical book objects added to the library
     * and print out their details.
     */ 
    public void printPhysicalResources() {
        int index = 0;
        boolean noDetails = false;
        while (index < resources.size()){
             Resource resourceDetails = resources.get(index);
          if(resourceDetails instanceof Book){
             System.out.println("Physical books currently available in the Library: ");
             resourceDetails.printDetails();
             index++;
             System.out.println();
            }
            else{
                index ++;
             if(index >= resources.size()){
                noDetails = true;
             }
          }
            }
        if(resources.isEmpty() && noDetails){
             System.out.println(
             "There are no resources currently available in the library");
             System.out.println();
              }
        } 
        
    /**
     * A method to print the details of all electronic resources added to the library
     * (E-Books and Journals) and print their details.
     */ 
    public void printElectronic() {
        int index = 0;
        boolean noDetails = false;
        while (index < resources.size()){
             Resource resourceDetails = resources.get(index);
           if(resourceDetails instanceof EBook){
             System.out.println("Electronic Books currently in the Library: ");
             resourceDetails.printDetails();
             index++;
             System.out.println();
            }
             else{
                if(resourceDetails instanceof Journal){
              System.out.println("Journals currently in the Library: ");
              resourceDetails.printDetails();
              index++;
              System.out.println();
              }
              else{
                  index++;
              }
            }
             if(index >= resources.size()){
                noDetails = true;
           }
            }  
        if(resources.isEmpty() && noDetails){
             System.out.println(
             "There are no Electronic resources currently available in the library");
             System.out.println();
              }
        }
    }



