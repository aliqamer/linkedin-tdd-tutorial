package com.virtualpairprogramming.isbntools;

public class ValidateISBN {

    public boolean checkISBN(String value) {

        if(value.length() == 13) {
            int total = 0;

            for (int i = 0; i < 13; i++) {

                if(i%2 == 0) {
                    total += Character.getNumericValue(value.charAt(i));
                } else {
                    total += Character.getNumericValue(value.charAt(i)) * 3;
                }
            }
            if(total % 10 == 0) {
                return true;
            }
            return false;
        } else {
            if(value.length() != 10) {
                throw new NumberFormatException("Invalid isbn number");
            }
            int total = 0;

            for (int i = 0; i < 10; i++) {
                if(!Character.isDigit(value.charAt(i))) {
                    if(i == 9 && value.charAt(i) == 'X') {
                        total += 10;
                    } else  {
                        throw new NumberFormatException("ISBN can only contain numeric digit");
                    }
                } else {
                    total += Character.getNumericValue(value.charAt(i)) * (10 - i);
                }
            }
            if(total % 11 == 0) {
                return true;
            }
            return false;
        }
    }
}
