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

    }

}