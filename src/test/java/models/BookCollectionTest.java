package models;

import interfaces.Iterator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookCollectionTest {
    private BookCollection bookCollection;
    @Before
    public void setUp() throws Exception {
        bookCollection = new BookCollection(2);
    }

    @Test
    public void addBook() {
        bookCollection.addBook(new Book("The Catcher in the Rye"));
        bookCollection.addBook(new Book("To Kill a Mockingbird"));

        Iterator<Book> iterator = bookCollection.createIterator();
        assertTrue(iterator.hasNext());
        assertEquals("The Catcher in the Rye", iterator.next().getTitle());
        assertEquals("To Kill a Mockingbird", iterator.next().getTitle());
    }

    @Test
    public void createIterator() {
        bookCollection.addBook(new Book("Brave New World"));
        Iterator<Book> iterator = bookCollection.createIterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
    }
}