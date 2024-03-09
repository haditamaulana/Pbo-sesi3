/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo;

/**
 *
 * @author ASUS
 */
public class Pbo {
    public static void main(String[] args) {
        // 1. Looping untuk semangat belajar java
        System.out.println("=== Looping untuk semangat belajar java ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Saya semangat belajar java");
        }

        // 2. Looping deret angka: 2 4 6 8 10 10
        System.out.println("\n=== Looping deret angka: 2 4 6 8 10 10 ===");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Looping deret angka: 9 6 3 0 -3 -6
        System.out.println("\n=== Looping deret angka: 9 6 3 0 -3 -6 ===");
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Looping perkalian dengan output tertentu
        System.out.println("\n=== Looping perkalian dengan output tertentu ===");
        System.out.println("Tabel Perkalian 5:");
        int baseNumber = 5;
        for (int i = 6; i <= 10; i++) {
            System.out.println(baseNumber + " x " + i + " = " + (baseNumber * i));
        }

        // 5. Looping deret angka: 1 3 6 10 15 21 28 36
        System.out.println("\n=== Looping deret angka: 1 3 6 10 15 21 28 36 ===");
        int sum = 0;
        for (int i = 1; i <= 8; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
