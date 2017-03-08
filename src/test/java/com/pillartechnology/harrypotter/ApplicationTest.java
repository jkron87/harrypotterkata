package com.pillartechnology.harrypotter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class ApplicationTest {

    private HashMap<String, Integer> booksToPurchase;
    private Application application;


    @Before
    public void setUp() throws Exception {
        booksToPurchase = new HashMap<String, Integer>();
        application = new Application();
    }

    @Test
    public void purchasingOneBookReturnsPricePerBook() throws Exception {
        booksToPurchase.put("book1", 1);
        Assert.assertEquals(8, 0.01, application.checkout(booksToPurchase));
    }


    @Test
    public void purchasingTwoIdenticalBooksReturnsPriceForTwoBooks() throws Exception {
        booksToPurchase.put("book1", 2);
        Assert.assertEquals(16, 0.01, application.checkout(booksToPurchase) );
    }

    @Test
    public void purchasingTwoUniqueBooksReturnsPriceWithDiscount() throws Exception {
        booksToPurchase.put("book1", 1);
        booksToPurchase.put("book2", 1);
        Assert.assertEquals(16 * 0.95, application.checkout(booksToPurchase), 0.01);
    }

    @Test
    public void purchasingThreeUniqueBooksReturnsPriceWithDiscount() throws Exception {
        booksToPurchase.put("book1", 1);
        booksToPurchase.put("book2", 1);
        booksToPurchase.put("book3", 1);
        Assert.assertEquals(24 * 0.90, application.checkout(booksToPurchase), 0.01);
    }
}
