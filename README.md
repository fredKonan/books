# books
8th Light Application 

Retrieve 5 books from google book's API by just enter a query
This is a command line application that allows you to search the Google Books API and create a reading list.
🏁 Getting started These instructions assume that you already have java, jdk jre and maven on your computer. 🕺
Open your terminal and clone this repository in a location of your choosing. git clone and copy and past the https link on the repository
Open the folder that your clone in your favorite IDE if you know how to run a java application on it. 
I would recommend to use intelliJ IDE community version which is free of charge.
Install the project dependencies but open the pom.xml on the project and run add maven for more information about the project dependencies, please see the "Dependencies" section below.
🤷 How to After install the project dependencies, you will be able to run the app class to start use the application and search for any book you want and add it to the reading list
Challenge I faced when building the application
Deserialized the Json file to a java object with multiple classes to retrieve only the specific value that the user need. Writing a test
Framework used: Spring boot Design: MVC pattern

-- Run the Application using Command line interface--

1 - clone the application on your computer and save it as books.java

2- Open a command prompt window and go to the directory where you saved the java program (app.java). Assume it's C:\.

3- Type 'javac books.java' and press enter to compile your code. If there are no errors in the code, the command prompt will take you to the next line (Assumption: The path variable is set).

4- Now, type ' java books' to run your program.

You will be able to see the result printed on the window.