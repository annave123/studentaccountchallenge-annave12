package com.company;


import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the PV student account generator");
        //Scanner system that accepts user input
            Scanner keyboardInput = new Scanner(System.in);
            System.out.println("Enter student first name");
            String fName = keyboardInput.next();
            System.out.println("Enter student last name");
            String lName = keyboardInput.next();
        //end scanner system

        //call method that generates random number
            String studentID = studentRandomID.randID();
        //end call for random number

        //Your goal is to create a system that uses the user input to generate an ID just like PV does.
        //You'll need to use substring, just as we talked about yesterday.
        //All usernames are first name initial followed by last name initial followed by last 3 digits
        //Output the username to the console and then provide the PV default password: pizza=10
        //Once done, send that back to GitHub and we'll review tomorrow
        //Think you are the next Zuckerburg?
        //This is the hacker challenge if you have time...
        //randomly generate a 128 bit secure password for the user. PV takes security serious
        //Finally, and if you truly are the Zuck, prompt the user to see if the user to create is a staff
        //If that is the case, use firstName initial and the full lastName

        //Program begins here...
    }


}
