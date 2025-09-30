package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    static Scanner myScanner = new Scanner(System.in);
    static StringBuilder addressBuilder = new StringBuilder();
    public static void main(String[] args) {

        System.out.println("Please input your Full Name: ");
        inputScanner();
        addressBuilder.append("\n\nBilling Address: \n");

        System.out.println("Please input your Billing Street: ");
        inputScanner();
        addressBuilder.append("\n");

        System.out.println("Please input your Billing City: ");
        inputScanner();
        addressBuilder.append(", ");

        System.out.println("Please input your Billing State: ");
        inputScanner();
        addressBuilder.append(" ");

        System.out.println("Please input your Billing Zip Code: ");
        inputScanner();
        addressBuilder.append("\n\nShipping Address: \n");

        System.out.println("Please input your Shipping Street: ");
        inputScanner();
        addressBuilder.append("\n");

        System.out.println("Please input your Shipping City: ");
        inputScanner();
        addressBuilder.append(", ");

        System.out.println("Please input your Shipping State: ");
        inputScanner();
        addressBuilder.append(" ");

        System.out.println("Please input your Shipping Zip Code: ");
        inputScanner();

        addressBuilder.toString();

        System.out.println(addressBuilder);

    }
    public static void inputScanner() {
        String input = myScanner.nextLine();
        addressBuilder.append(input.trim());
    }
}
