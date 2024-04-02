package com.rs.core.exception.ex;

public class ArthmeticException {
    public static void main(String[] args) {
        // Number of cookies sold
        int totalCookiesSold = 10;
        // Number of customers
        int numberOfCustomers = 0;

        try {
            int averageCookiesPerCustomer = totalCookiesSold / numberOfCustomers;
            System.out.println("Average Cookies Per Customer: " + averageCookiesPerCustomer);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Something went wrong with the calculations.");
            System.out.println("Error Details: " + e.getMessage());
        }
    }
}
