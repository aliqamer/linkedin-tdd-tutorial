package com.virtualpairprogramming.isbntools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateISBNTest {

    @Test
    public void check_Valid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        Assertions.assertTrue(result, "first value");

        result = validator.checkISBN("0140177396");
        Assertions.assertTrue(result, "second value");
    }

    @Test
    public void check_ValidISBNEndingWithX() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        Assertions.assertTrue(result, "first value");
    }

    @Test
    public void check_Valid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260087");
        Assertions.assertTrue(result, "first value");

        result = validator.checkISBN("9781853267338");
        Assertions.assertTrue(result, "second value");
    }

    @Test
    public void check_InValid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853267336");
        Assertions.assertFalse(result);
    }

    @Test
    public void check_InValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        Assertions.assertFalse(result);
    }

    @Test
    public void check_InValid9DigitISBN() {
        ValidateISBN validator = new ValidateISBN();

        Assertions.assertThrows(NumberFormatException.class, () -> {
            validator.checkISBN("123456789");
        });
    }

    @Test
    public void check_NonNumbericISBNNotAllowed() {
        ValidateISBN validator = new ValidateISBN();

        Assertions.assertThrows(NumberFormatException.class, () -> {
            validator.checkISBN("helloworld");
        });
    }
}