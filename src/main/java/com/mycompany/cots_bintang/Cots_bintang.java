package com.mycompany.cots_bintang;

import java.util.Scanner;

public class Cots_bintang {
    // Constants for menu choices
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu(); // Displaying menu
        int choice = getUserChoice(scanner);

        double result = performOperation(choice, scanner); // Getting the result

        displayResult(result); // Displaying the result

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
    }

    private static int getUserChoice(Scanner scanner) {
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        return scanner.nextInt();
    }

    private static double performOperation(int choice, Scanner scanner) {
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case ADDITION:
                return num1 + num2;
            case SUBTRACTION:
                return num1 - num2;
            case MULTIPLICATION:
                return num1 * num2;
            case DIVISION:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new IllegalArgumentException("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                }
            default:
                throw new IllegalArgumentException("Pilihan tidak valid.");
        }
    }

    private static void displayResult(double result) {
        System.out.println("Hasil: " + result);
    }
}
