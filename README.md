# Billing-System

This project provides a basic command-line billing system. The project contains items relating to a restaurant but it can be modified for other uses.

**Interface.java**

This class provides a basic interface to the user to let them choose between adding a new item to the menu or printing a bill.

_METHODS INCLUDED: getInput(), doAsSaid(int choice)_

**Menu.java**

This class contains the variables and methods relating to the menu. It initializes the list of menu with some food items and lets the user add items to the menu. It also displays the menu to the user.

_METHODS INCLUDED: init(), addItem(), printMenu()_

**Bill.java**

This class contains the variables and methods relating to the bill. It automates the process of calcualating the total price of one's orders and provides a detailed bill that shows the name of the item, quantity bought, amount per item and the total amount.


_METHODS INCLUDED: inputOrdersAndQuantity(), printBill()_
