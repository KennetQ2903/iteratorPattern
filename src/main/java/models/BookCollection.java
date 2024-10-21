package models;

import interfaces.Iterable;
import interfaces.Iterator;

public class BookCollection implements Iterable<Book> {
    private Book[] books;
    private int index = 0;

    public BookCollection(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index < books.length) {
            books[index] = book;
            index++;
        } else {
            System.out.println("No more space to add new books.");
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}

