------------------------------------------------------------------------
This is the project README file.
Please find the system design image in the project folder.
The API/documentation is in the doc folder.
------------------------------------------------------------------------

PROJECT TITLE:Library_System Coursework
PURPOSE OF PROJECT:
Implement a library system in java using advanced elements of the language such as encapsulation and inheritance, with complex data elements and data structures. 
This coded program is the culmination of my own programming learning and taught materials from the module. 
It operates with the software development cycle in requirements gathering and specification, system design, system documentation and testing(both manual and JUnit testing).

DOCUMENTATION:
Documentation: 
When creating the layout for this project, there was several objects that shared inherent rules that overlapped, such as individual resources in a library.
I felt that each resource would require similar constructors and it made sense to use an inheritance system. Data fields such as:
    • Book Title - (String)
    • Author object
    • Library member Object (User) 
    • Fee (Lost or damages) - (String/Int)
    • Number of Copies (Int)
    • Loan time - Combination of number of copies and time used (int/string)
    • Times loaned - Could be used to define time spent as well as popularity (Int/String)
    • Book availability - (Boolean)
Although not all of these fields would be apparent to each resource (no of copies wouldn't make sense for an electronic book) the idea of setting these within a Resource superclass meant that I could access and update values for instances far easier. 
From this the subclasses Book, E-book and Journal could have specific data fields as required.

When constructing the Library member and guest member classes, there was a similar reasoning for inheritance due to reusing code. 
Likewise it meant that the two objects could mostly be identified by a Boolean value in whether they were a member or not, which meant that they could have set privileges. 
Data fields such as:
    • Library Member ID (String/Int) 
    • List of Book Objects currently borrowed (List - Objects) (ArrayList)
    • Library Member Name (String - May be made from First + Last Name)
    • Library Member Address (String)
    • Library Membership (Boolean) - Can be used to define if Active member/Guest/Old Member
    • Total Number of Books Borrowed (Could be defined by Membership duration and Amount Overdue books) (List/String - Object)
    • List of Overdue Books (List) (ArrayList)
    • Number of times books overdue/damaged (Int)
The superclass User would share these values but guest members would have set access limits and could not borrow any books. 
I had originally set the idea of using a overdue system to greater effect but settled on it being a condition when borrowing books for a Library Member instead.

I feel the system works well but there is always room for improvement with efficiency. 
In some instances the use of the iterations method would have created better results, while using less processing power. 
It would have also likely led to less infinite loops while iterating through the array lists.

VERSION or DATE: 1.0 (completed on 29/11/23)

HOW TO START THIS PROJECT:
Create a library object, a few instances of the resources(Book,Ebook,Journal) and start to add/remove them to the library.
The Author object allows setting resources an Author.
The User subclasses (LibraryMember/GuestMember) are used to borrow and return resources.
Every created objected should have inherent rules that allow them to have variable results when interacting with other objects.

AUTHORS: Robert Mackie

