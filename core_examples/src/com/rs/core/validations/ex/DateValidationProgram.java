package com.rs.core.validations.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateValidationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (in format dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

        if (isValidDate(inputDate, "dd/MM/yyyy")) {
            System.out.println("Entered date is valid.");
        } else {
            System.out.println("Entered date is not valid.");
        }

        scanner.close();
    }

    public static boolean isValidDate(String dateStr, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false); // Disable lenient parsing (e.g., February 30 will be invalid)
            Date date = sdf.parse(dateStr);
            return true; // If parsing succeeds, the date is valid
        } catch (ParseException e) {
            return false; // If parsing fails, the date is not valid
        }
    }
}