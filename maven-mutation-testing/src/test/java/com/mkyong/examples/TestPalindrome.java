package com.mkyong.examples;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPalindrome {

    @Test
    public void whenPalindrom_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

//    @Test
//    public void whenNotPalindrom_thanReject() {
//        Palindrome palindromeTester = new Palindrome();
//        assertFalse(palindromeTester.isPalindrome("box"));
//    }
//    @Test
//    public void whenNearPalindrom_thanReject() {
//        Palindrome palindromeTester = new Palindrome();
//        assertFalse(palindromeTester.isPalindrome("neon"));
//    }

}