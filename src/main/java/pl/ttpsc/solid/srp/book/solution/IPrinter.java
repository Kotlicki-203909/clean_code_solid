package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public interface IPrinter {
    /**
     * Prints the current page.
     */
    void printCurrentPage(Book book);

    /**
     * Prints all pages
     * @return
     */
    String printPages(Book book);
}
