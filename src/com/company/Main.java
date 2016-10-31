package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the PV student account generator");

        Scanner newName = new Scanner(System.in);
        FIRSTRANDOM infos = new FIRSTRANDOM();
        String FinalRealPass = infos.getPass();


        studentRandomID info = new studentRandomID();
        String studentID = info.randID();
        String finalStudentId = studentID.substring(0,3);


            Scanner keyboardInput = new Scanner(System.in);
            System.out.println("Enter student first name");
            String fName = keyboardInput.next().toLowerCase();
            String thanks = fName.substring(0,3);
            StringBuffer hello = new StringBuffer(thanks);
            StringBuffer h =hello.reverse();




        System.out.println("Enter student last name");
        String lName = keyboardInput.next().toLowerCase();
        String please = lName.substring(0,3);
        StringBuffer bye = new StringBuffer(please);
        StringBuffer j =bye.reverse();



            String finnishing = h.substring(2);
            String up = j.substring(2);

            String Final = finnishing+up+finalStudentId;




        System.out.println("Your Username: "+Final);
        System.out.println("\nYour Password is: "+ FinalRealPass);



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

        //Program begins here..
    }


}
