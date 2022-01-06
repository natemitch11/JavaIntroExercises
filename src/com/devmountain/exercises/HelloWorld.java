package com.devmountain.exercises;

public class HelloWorld {
    /*Java programs need an entry point. The entry point of every Java class is the 'main' method
    Everything inside the main method is what actually runs in a Java program */

    public static void main(String[] args) {
        /* JavaScript uses console.log() to print out text to the terminal
        Java has a few methods that perform similar functions that we will use in this exercise
        Using System.out.println();, print out "Hello World" to the terminal below */

        //************************CODE HERE****************************

        /* The next method we will use prints information to the terminal on the same line.
        Using 2 separate System.out.print(); statements, print "Hello World" and "my name is YOUR_NAME"
        to the terminal. Feel free to pause here and explore how things are printed to the terminal using
        print rather than println. To move to a new line you need the new line character '\n' and wherever
        that character appears you will move to a new line.
         */

        //************************CODE HERE****************************

        /* The next method will be the last one we introduce, but know there are other methods within the
        System.out realm, which is the formatted option. This option is the closest thing to a Template Literal
        string from JavaScript and is System.out.printf(); which accepts at least 2 arguments 1)The string you want to format
        2) the variables you want plugged in.
         */
        String name = "YOUR_NAME_HERE";
        int age = 0;
        System.out.printf("Hello World! my name is %s\n", name);
        /*
        Pause here and spend some time seeing how you can plug things into Strings with printf.
        There are many different % modifiers available in java, %s plugs your variable in as a string.
        Wherever there is a % modifier within the string being formatted, a variable will be plugged in, in the order they appear
        Replace the age variable with your age, and see if you can modify the string to dynamically display
        "and I am YOUR_AGE years old!"

        ** You may need to add a few more new line characters **
         */

        //************************CODE HERE****************************
    }
}
