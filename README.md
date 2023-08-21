# Coffee Ordering Application
# What is aim of that app?
This application allows users to order coffee by selecting predetermined coffee types. Users select coffee from menu, see the content and price of the selected coffee.
# How to start?
-	To run this application, Java 8 or higher must be installed.
-	Start the application by running the main method in the CoffeeOrder class.
# User Guide
-	When the application is launched, a coffee menu is displayed. The users must determine which coffee they want.
-	The users enter the number of desired coffee.
-	The application displays recipe and price of this coffee.
# Used Class and Methods
-	Ingredient: The class that represents the coffee content. Includes ingredient name and dosage.
-	Coffee: The class that represents the coffee beverage. It consists of name, price and ingredients.
-	CoffeeData: Interface that holds coffee data. It rotates the menu and provides the coffee selection. 
-	DefaultCoffeeData: The class containing coffee data. Defines coffee types and ingredients.
-	CoffeeShop: The class that manages coffee orders. Shows the menu and rotates the selected coffee.
-	CoffeeOrder: The class from which the application is started. Makes the coffee order. 

I used OOP, dependency injection, and solid methods. I will explain them shortly;
Dependency Injection: The ‘CoffeeShop’ class depends on and injects a ‘CoffeeData’ object. In this way, the ‘CoffeeShop’ class receive coffee data independently.
Single Responsibility Principle: According to this principle, each class should have only one responsibility. Accordingly, the 	‘Ingredient’ class holds the names and doses of ingredients. The ‘Coffee’ class holds the coffee content and price, as well as creates the recipe for a coffee. 
Open-Closed Principle: The ‘DefaultCoffeeData’ class can remain unchanged when adding new coffee types. Just adding new coffee definitions will suffice.
Interface Segregation Principle: The ‘CoffeeData’ interface designed with the needs of the application and in a simple way.
