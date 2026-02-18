
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Soal1Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka ke-1: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka ke-2: ");
        int b = input.nextInt();

        System.out.print("Masukkan angka ke-3: ");
        int c = input.nextInt();

        System.out.println("Hasil Penjumlahan: " + (a + b + c));
        System.out.println("Hasil Pengurangan: " + (a - b - c));
        System.out.println("Hasil Perkalian: " + (a * b * c));
        System.out.println("Hasil Pembagian: " + ((double)a / b / c));
    }
}
