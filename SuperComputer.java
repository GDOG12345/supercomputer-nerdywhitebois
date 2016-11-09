//Author: Elijah Ryder
//Date: Halloween, 2016
//Description: make two loops

// get into the right directory :)
// cd supercomputer-nerdywhitebois


import java.util.Scanner;

public class SuperComputer {
    public static void main(String []args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our looping program.. Please chose a loop to execute");
        System.out.println("3. Loop from 0 to 100 by 2's");
        System.out.println("4. Loop from 0 to 100 by 5's");
        System.out.print("Please enter your choice here: ");
        String choice = scanner.nextLine();


        //choice 3..
        //counts by 2's up to 100
        if (choice.equals("3")) {
            for( int i = 0 ; i <= 100 ; i+=2 ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //choice 4
        //counts to by 5's up to 100

        else if (choice.equals("4")) {
            for( int i = 0 ; i <= 100 ; i +=5) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // author: Gavyn Mutz
// Date: 10/31/16
// description: making two loops

import java.util.Scanner;
public class Test {
    public static void main (String[] args) {
        
        /*
        int x = 5;
        System.out.println("x == " + x);
        x = x + 1;
        */
        
        // print what loop do you want? 
        // 1. loop from 0 to 20 counting by 2
        // 2. loop from 15 to 0 counting down by 1
        // collect using a scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("welcome to my looping program.");
       
        System.out.println("1. Loop from 0 to 20 counting by 2");
        
        System.out.println("2. Loop from 15 to 0 counting down by 1");
       
        System.out.println("please enter your choice here: ");
        String choice =scanner.nextLine();
       
        if (choice.equals("1")) {
        
            for (int i = 0 ; i <= 20; i+=2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else if (choice.equals("2")) {
        
            for (int i = 15; i >= 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            
            
        }
        
    }
    
// author: Gavyn Mutz
// Date: 10/31/16
// description: making two loops

import java.util.Scanner;
public class Test {
    public static void main (String[] args) {
        
        /*
        int x = 5;
        System.out.println("x == " + x);
        x = x + 1;
        */
        
        // print what loop do you want? 
        // 1. loop from 0 to 20 counting by 2
        // 2. loop from 15 to 0 counting down by 1
        // collect using a scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("welcome to my looping program.");
       
        System.out.println("1. Loop from 0 to 20 counting by 2");
        
        System.out.println("2. Loop from 15 to 0 counting down by 1");
       
        System.out.println("please enter your choice here: ");
        String choice =scanner.nextLine();
       
        if (choice.equals("1")) {
        
            for (int i = 0 ; i <= 20; i+=2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else if (choice.equals("2")) {
        
            for (int i = 15; i >= 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            
            
        }
        
    }
    


    }

}
