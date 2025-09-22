package com.example;

import java.time.LocalDate;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name");
        String name = scanner.nextLine();
        System.out.println("Welcome to the Ironhack course, " + name + "!");

        LocalDate date = LocalDate.now();
        System.out.println("Today is: " + date);
    }
}