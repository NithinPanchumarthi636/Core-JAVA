package com.rs.core.validations.ex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidDateExample {
	
    public static void main(String[] args) {

        // Enter your date here in format dd/MM/yyyy
        String inputDate = "17/07/2023";

        // Define date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Parse date using the formatter
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Print date if it is valid
            System.out.println("The entered date is valid: " + date);

        } catch (DateTimeParseException e) {
            // Print error message if the entered date is not valid
            System.out.println("The entered date is not valid. Please use the format dd/MM/yyyy");
        }
    }
}


