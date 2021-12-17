package com.virtualpairprogramming.isbntools;

public class ValidateISBN {

    public boolean checkISBN(String value) {
        int total = 0;

        for (int i = 0; i < 10; i++) {
            total += value.charAt(i) * (10 - i);
        }
        if(total % 11 == 0) {
            return true;
        }
        return false;
    }
}
