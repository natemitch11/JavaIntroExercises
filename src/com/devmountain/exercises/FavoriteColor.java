package com.devmountain.exercises;

import java.util.Scanner;

public class FavoriteColor {
    /*
    Java is a strongly typed and verbose language, meaning that when you declare a variable you have to specify
    what type of data it is, and it is verbose meaning there is a lot of syntax to get your point across.
    This is great for learning because it shows the programmer what is going on behind the scenes, how a computer
    'thinks', and will increase your programming sense.

    Within Java there are primitive types and reference types. Primitive types serve as the basis for all other
    data types within the Java language and are shown below.
     */

    boolean trueOrFalse = true; //booleans are true or false expressions.
    int number = 42; //int stands for integer and is used to represent whole numbers which are < 4,294,967,295
    long bigNumber = 1234567891234856L; //long is used to store very large numbers > 4,294,967,295
    float decimal = 2.02f; //float is used to represent decimals out to 7 places
    double smallDecimal = 2.00000000000004d; //double is used to represent decimals out to 15 places
    char character = 'a'; //char is used to represent a single character or symbol and is defined with single quotes

    /*
    Practice following the pattern for defining a variable shown above and make variables for your
    first initial,
    last initial,
    age,
    age of the earth,
    atomic mass of the element silicon,
    and a boolean answering "Do you like Ice Cream?"
     */

    //************************CODE HERE****************************

    /*
    Reference types are built upon the foundation of primitive types and there are too many to list in this exercise
    Some important ones to list are Lists, Sets, Strings, and Maps. Later this week you will have more in depth practice
    with Lists, Sets, and Maps so for now lets focus on Strings.

    Strings are a series of chars in a sequence and each char takes up an index within the String starting at index 0.
    For now, lets practice making Strings and then move on to using them.
     */

    String name = "YOUR_NAME_HERE"; //Notice 'String' is capitalized, and you define the String with double quotes

    /*
    Make String variables that contain your first name and your last name
     */

    //************************CODE HERE****************************

    /*
    Let's practice interacting with our program in the command line. First we give our program an entry point
     */
    public static void main(String[] args) {
        //Next we will import a new Type called Scanner which allows us to listen for inputs into the terminal
        Scanner input = new Scanner(System.in);
        //Pause here and try to research what each piece on line 57 is doing. Ask for help if you need clarification

        System.out.println("What is your favorite color?");
        String favoriteColor = input.nextLine(); //This line gets user input and stores it in the favoriteColor variable

        System.out.println("Nice, I like " + favoriteColor + " too!"); //Notice you can concatenate Strings in Java

        //Pause here and play around with the scanner. Try adding more messages and inputs!

        /*
        Let's look at some conditional logic! if-else statements inside of Java function similarly to JavaScript
        Since Java is a strongly typed language, it negates the need for the triple-equals sign '===' from JS.
        Java uses a single equals '=' to assign a value and a double equals '==' to see if two things are the same.
        All other comparators are similar such as '<' and '<=' as well as '>' and '>='
         */

        boolean isTrue = true;
        int number = 42;

        //The ! operator can be used to invert the condition. Play around with the if statement below to see how it works
        if (isTrue){
            System.out.println("It's True!");
        } else{
            System.out.println("It's False!");
        }

        //feel free to edit this statement to try out the other operators mentioned above
        if (number < 50){
            System.out.println("True! " + number + " is less than 50.");
        } else{
            System.out.println("False, " + number + " is greater than 50.");
        }

        /*
        Create conditional logic (an if-else statement) that checks whether the favoriteColor variable is green
        if it is, print out 'green is the best!', if it is not then print out 'sorry, that's not correct'
         */

        //************************CODE HERE****************************

    }
}
