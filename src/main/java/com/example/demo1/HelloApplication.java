package com.example.demo1;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter fist number: ");
        int numberOne = scanner.nextInt();
        System.out.print("enter Second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("The result of sum is:"+(numberOne + numberTwo));
        double division;
        division = (double) numberOne / numberTwo;
        System.out.println("Result of division is: " + division);
    }
}