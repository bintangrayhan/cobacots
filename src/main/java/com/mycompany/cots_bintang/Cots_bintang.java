/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cots_bintang;

import java.util.Scanner;

public class Cots_bintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = performOperation(pilihan, angka1, angka2);

        if (pilihan == 4 && angka2 == 0) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
        } else if (hasil != Double.NaN) {
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    public static double performOperation(int pilihan, double angka1, double angka2) {
        switch (pilihan) {
            case 1:
                return angka1 + angka2;
            case 2:
                return angka1 - angka2;
            case 3:
                return angka1 * angka2;
            case 4:
                if (angka2 != 0) {
                    return angka1 / angka2;
                } else {
                    return Double.NaN; // Menggunakan NaN untuk menandakan kesalahan
                }
            default:
                return Double.NaN; // Menggunakan NaN untuk menandakan pilihan tidak valid
        }
    }
}