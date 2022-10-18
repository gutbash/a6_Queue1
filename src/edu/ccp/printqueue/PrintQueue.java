package edu.ccp.printqueue; // includes project package

/**
 * PrintQueue
 * queue for PrintJob data,
 * contains head and tail trackers,
 * push and pop methods
 */
public class PrintQueue {

    // declares instance variables
    Node head; // starts Node in list
    Node tail; // ends Node in list

    // constructs instance variables
    public PrintQueue() {

        // sets to null to be replaced with Node
        head = null;
        tail = null;

    } // ends PrintQueue() constructor

    /**
     * push()
     * adds a node to the back of the queue
     */
    void push(PrintJob job) {

        Node new_node = new Node(); // instantiates new Node
        new_node.set_data(job); // sets job as Node data

        // pushes Node at the end of the list
        if (head == null && tail == null) { // checks if list is empty

            head = new_node; // sets head to new Node

        } else { // pushes if not empty

            // sets start Node as head
            // aims to traverse for last Node
            Node last = head;

            // traverses list while there is a next Node
            while (last.get_next() != null) {

                // sets current last Node to next Node
                last = last.get_next();

            } // ends while loop list traversal

            // sets the current last Node's next Node to the new Node
            last.set_next(new_node);

            // sets the new_node's previous
            new_node.set_previous(last);

        } // ends if/else logic

        // sets the tail to be the new Node
        tail = new_node;

    } // ends push() method

    /**
     * pop()
     * removes node at the front of the queue
     */
    PrintJob pop() {

        // initializes new job object set to null
        PrintJob job = new PrintJob(0, 0);

        // checks for an empty queue by head
        if (head == null) {

            System.out.println("ERROR: print queue is empty!"); // prints error message

        } else { // runs if head isn't empty

            job = head.get_data(); // sets job to return to head job of queue

            // pops current head
            if (head.get_next() == null) { // checks if next is empty

                head = null; // sets head to null so is queue empty

            } else { // runs if there is a head next Node

                head = head.get_next(); // sets head to current head's next node
                head.set_previous(null); // sets new head's previous to null

            } // ends if/else statements

            // formats and prints "print" job results
            System.out.println("ID: " + job.get_job_id() + "\nPRINTED " + job.get_num_pages() + " PAGES");

        } // ends if/else statements

        // returns popped job as head of queue or null if empty
        return job;

    } // ends pop() method
} // ends PrintQueue class
