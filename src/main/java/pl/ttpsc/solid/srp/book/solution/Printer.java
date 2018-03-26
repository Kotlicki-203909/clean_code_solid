package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public class Printer implements IPrinter {
    @Override
    public void printCurrentPage(Book book) {
        System.out.println(book.getCurrentPageContents());
    }

    @Override
    public String printPages(Book book) {
        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getAllPagesContents()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
