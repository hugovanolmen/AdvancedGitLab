package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
    }
}