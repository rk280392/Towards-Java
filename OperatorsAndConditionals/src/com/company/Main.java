package com.company;

public class Main {

    public static void main(String[] args) {



        boolean myname = false;

        if (myname == true)
            System.out.println(" No name specified");
            System.out.println("Please Enter Your Name: ");   // This line will be executed even when if fails,
             // because there is no code block

        if (myname == false) { // code blocks are necessary to execute more than one line
            System.out.println("No name specified");
            System.out.println("Please Enter Your Name Here: ");
        }

        
    }
}
