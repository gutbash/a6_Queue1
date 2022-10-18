//// a6_Queue1
// program for simulating a printer queue with jobs, interfaced by command prompt operations for CSCI 211
// last edited Oct. 18, 2022 by S. Gutierrez

package edu.ccp.printqueue; // includes project package

import java.util.Scanner; // imports Scanner class for input

/**
 * Main
 * driver code for PrintQueue operations
 */
public class Main {

    /**
     * MAIN METHOD / DRIVER CODE
     */
    public static void main(String[] args) {

        // instantiates new printer queue
        PrintQueue queue = new PrintQueue();

        // initializes ID counter for tracking print queue jobs
        int id = 1;

        boolean exit = true; // stops loop if exit command sets to false

        while (exit) {

            // initializes Scanner object for input
            Scanner input = new Scanner(System.in);

            // prints a list of commands to operate on PrintQueue
            System.out.println("\nOPERATE ON THE PRINTER WITH THE FOLLOWING COMMANDS:\n\nadd\nprint\nexit\n");
            System.out.print("INPUT COMMAND: "); // prompts input
            String command = input.nextLine(); // reads user input
            System.out.println();

            // uses switch/case structure for printer operations
            switch (command) {

                case "add":

                    System.out.print("NUMBER OF PAGES: "); // prompts input
                    int pages = input.nextInt(); // reads user input
                    PrintJob job = new PrintJob(id, pages);
                    System.out.println(); // pads
                    queue.push(job); // pushes job to end of queue
                    id++;
                    break; // breaks from switch

                case "print":

                    // pops and stores current job from queue
                    PrintJob currentJob = queue.pop();

                    break; // breaks from switch

                case "exit":

                    exit = false;
                    input.close();
                    
                    break; // breaks from switch

                default:

                    System.out.println("ERROR: command not found");
                    break;

            } // ends switch case
        } // ends while loop
    } // ends main() method
} // ends Main class
