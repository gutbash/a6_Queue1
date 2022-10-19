//// a6_Queue1
// program for simulating a printer queue with jobs, interfaced by command prompt operations for CSCI 211
// last edited Oct. 18, 2022 by S. Gutierrez

package edu.ccp.printqueue; // includes project package

/**
 * Node
 * contains PrintJob object data
 * part of PrintQueue queue
 */
public class Node {

    // declares instance variables
    PrintJob data; // stores PrintJob object
    Node next; // keeps track of place in queue in forward direction
    Node previous; // keeps track of place in queue in previous direction

    // constructs instance variables
    public Node() {

        data = null;
        next = null;
        previous = null;

    } // ends Node() constructor method

    // getters //
    public Node get_next() { return next; }
    public Node get_previous() { return previous; }
    public PrintJob get_data() { return data; }

    // setters //
    public void set_next(Node next) { this.next = next; }
    public void set_previous(Node previous) { this.previous = previous; }
    public void set_data(PrintJob data) { this.data = data; }

} // ends Node class
