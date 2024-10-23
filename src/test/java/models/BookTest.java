package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("The shell");
    }

    @Test
    public void getTitle() {
        assertEquals("The shell", book.getTitle());
    }

    @Test
    public void testToString() {
        assertEquals("Book{title='The shell'}", book.toString());
    }
}