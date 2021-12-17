package com.virtualpairprogramming.isbntools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateISBNTest {

    @Test
    public void check_ValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        Assertions.assertTrue(result, "first value");

        result = validator.checkISBN("0140177396");
        Assertions.assertTrue(result, "second value");
    }

    @Test
    public void check_InValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        Assertions.assertFalse(result);
    }
}