package com.mycompany.cots_bintang;

import java.util.Scanner;

public class Cots_bintang {
    static double hasil; // Menjadikan variabel hasil sebagai variabel global

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih op erasi yang diinginkan:");
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

        performOperation(pilihan, angka1, angka2); // Memanggil metode tanpa mengembalikan hasil

        displayResult(pilihan); // Menampilkan hasil dari variabel global

        scanner.close();
    }

    public static void performOperation(int pilihan, double angka1, double angka2) {
        switch (pilihan) {
            case 1:
                hasil = angka1 +  angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    hasil = Double.NaN; // Menggunakan NaN untuk menandakan kesalahan
                }
                break;
            default:
                hasil = Double.NaN; // Menggunakan NaN untuk menandakan pilihan tidak valid
                break;
        }
    }

    public static void displayResult(int pilihan) {
        if (pilihan == 4 && hasil == Double.NaN) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
        } else if (hasil != Double.NaN) {
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
