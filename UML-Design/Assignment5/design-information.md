**Author: David Lee**
**CS370: Software Engineering**
**Assignment5: SoftwareDesign**

Prerequisites:
UML Tool Software (that allows viewing of UML models)

This is only an information file about the design of the software, not the actual guide and use of the software.

Information:
1) First, this is the design of a software for GroceryListManager an
application for managing grocery lists whose requirements will be listed below.
2) Before jumping into straight designing and drawing UML, first we must carefully review the requirements as a whole so that we have an idea of how to design the software efficiently
3) The user is able to do check off items in their lists as they like as well as clearing off the check marks and the user can also change the quantity of the items in their lists.
4) There is an option for users to search for the item they desire by typing out the item name.
5) Lists will be saved automatically after any adjustments or modifications to them
6) Users can create multiple lists if needed.
7) For designing the Users class, there is a one to many relationship between users and lists because one User may have more than one list at a given time.
8) The methods in User class are actions that the user can make without having to access the list first, such as deleting the list.
9) GroceryList is an important class of the design in that it creates a way for Users to add the items they want to their lists.
10) Changing the quantity of items in the list can be called anywhere since there can be a need for a new item or an item in a list is no longer needed.
11) The item class only contains the item names for the User class to search for.
12) There is a 0 to many relationship between items and GroceryList since a list is not required to have one of each item that is available.
13) Item types class is there as a hierarchal list for when the User wants to search for items based on types before the actual items, such as a fruit and then looking for banana.
14) There is a one to many relationship between items and item types because each item type can have more than 1 item of its type. 
