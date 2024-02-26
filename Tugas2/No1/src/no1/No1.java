/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package no1;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        double bilangan = scanner.nextDouble();
        int angkaDepanKoma = (int) bilangan;
        double angkaBelakangKoma = bilangan - angkaDepanKoma;

        // Mengubah angka belakang koma menjadi integer
        int angkaBelakangKomaInteger = (int) (angkaBelakangKoma * 100);

        // Memeriksa angka di depan koma dan di belakang koma adalah kelipatan 3
        if (angkaDepanKoma % 3 == 0 && angkaBelakangKomaInteger % 3 == 0) {
            System.out.println("Angka di depan koma dan di belakang koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka di depan koma dan di belakang koma bukan kelipatan 3.");
        }

        scanner.close();
    }
}
    

