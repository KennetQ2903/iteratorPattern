package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookIteratorTest {
    private Book[] books;
    private BookIterator bookIterator;

    @Before
    public void setUp() throws Exception {
        books = new Book[3];
        books[0] = new Book("The Hobbit");
        books[1] = new Book("The Lord of the Rings");
        books[2] = new Book("The Silmarillion");
        bookIterator = new BookIterator(books);
    }

    @Test
    public void hasNext() {
        assertTrue(bookIterator.hasNext());
        bookIterator.next();
        bookIterator.next();
        bookIterator.next();
        assertFalse(bookIterator.hasNext());
    }

    @Test
    public void next() {
        assertEquals("The Hobbit", bookIterator.next().getTitle());
        assertEquals("The Lord of the Rings", bookIterator.next().getTitle());
        assertEquals("The Silmarillion", bookIterator.next().getTitle());
    }
}