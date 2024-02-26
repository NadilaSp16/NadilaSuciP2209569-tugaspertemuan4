/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no3;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // untuk menginput jam mulai
        System.out.println("Jam Mulai (Jam, Menit):");
        System.out.print("Jam: ");
        int jamMulai = scanner.nextInt();
        System.out.print("Menit: ");
        int menitMulai = scanner.nextInt();

        //untuk menginput jam selesai
        System.out.println("Jam Selesai (Jam, Menit):");
        System.out.print("Jam: ");
        int jamSelesai = scanner.nextInt();
        System.out.print("Menit: ");
        int menitSelesai = scanner.nextInt();

        // untuk Menghitung total menit
        int totalMenitMulai = jamMulai * 60 + menitMulai;
        int totalMenitSelesai = jamSelesai * 60 + menitSelesai;
        int selisihMenit = totalMenitSelesai - totalMenitMulai;

        // untuk Menghitung jam dan menit dari selisih menit
        int jam = selisihMenit / 60;
        int menit = selisihMenit % 60;

        // Menampilkan hasil
        System.out.println("Lama (menit): " + selisihMenit);
        System.out.println("Lama (Jam, Menit): " + jam + " jam " + menit + " menit");

        scanner.close();
    }
}