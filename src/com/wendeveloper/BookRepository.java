package com.wendeveloper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    // constructor
    public BookRepository(){
        // construct a new book and add to array
        books.add(new Book("83471","The Dead of Night", "Horror", null, "S.K.Eleton"));
        books.add(new Book("25274","Castles and Crenellations", "Historical", null, "H.P. Anderson"));
        books.add(new Book("51573","The Knight's Sword", "Fantasy", null, "F.E. Anvil"));
        books.add(new Book("39662","Time of Night", "Romance", null, "A.U. Ring"));
        books.add(new Book("40831","Castle Siege", "Historical", null, "N.N. Blacksmith"));
        books.add(new Book("61522","Night and Day", "Mystery", null, "Q.Z. Bizar"));
        books.add(new Book("86917","Never Time", "Thriller", null, "P.B. Jelliton"));
    }

    public Book findByIsbn(String isbn){
        for(Book book: books) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<Book>(); //list of all books found
        for(Book book: books) {
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);   // add book to array list
            }
        }
        return booksFound;
    }

}
