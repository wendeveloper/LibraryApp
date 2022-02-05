package com.wendeveloper;

import java.util.ArrayList;

public class LibraryApp {

    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.printf("Searching for books with ISBN %s. \n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s",
                    book.getTitle(),
                    book.getGenre(),
                    book.getAuthor());
        }else{
            System.out.printf("0 books found.");
        }
        System.out.printf("\n\n");
    }

    public void searchByTitle(String keyword){
        System.out.printf("Searching for books with '%s' in the title...\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s\n", books.size(), books.size() > 0 ? ":" : ".");  //prints out how many books were found for each search
        for(Book book : books){
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n",
                    book.getTitle(),
                    book.getGenre(),
                    book.getAuthor());
        }
        System.out.println();
    }

}
