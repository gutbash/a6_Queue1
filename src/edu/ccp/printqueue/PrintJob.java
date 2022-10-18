package edu.ccp.printqueue; // includes project package

/**
 * PrintJob
 * stores data about particular PrintJob object
 */
public class PrintJob {

    // declares instance variables
    int id;
    int pages;

    // constructs instance variables
    public PrintJob(int id, int pages) {

        // assigns arguments to instance variables
        this.id = id;
        this.pages = pages;

    } // ends PrintJob() constructor

    // getters //
    int get_job_id() { return id; } // ends get_job_id() method
    int get_num_pages() { return pages; } // ends get_num_pages() method

} // ends PrintJob class
