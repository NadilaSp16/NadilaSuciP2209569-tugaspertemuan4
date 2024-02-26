/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no2;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();

        System.out.print("Masukkan operator aritmatika: ");
        char operator = scanner.next().charAt(0);

        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                break;
            case '*':
                hasil = bil1 * bil2;
                System.out.println("Hasil perkalian " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                break;
            case '/':
                if (bil2 != 0) {
                    hasil = bil1 / bil2;
                    System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                } else {
                    System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                }
                break;
            case '%':
                if (bil2 != 0) {
                    hasil = bil1 % bil2;
                    System.out.println("Hasil modulus " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                } else {
                    System.out.println("Modulus dengan nol tidak dapat dilakukan.");
                }
                break;
            default:
                System.out.println("Operator aritmatika tidak valid.");
        }

        scanner.close();
    }
}