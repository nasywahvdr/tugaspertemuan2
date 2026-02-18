
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Soal2Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa uang Anda saat ini? ");
        int uang = input.nextInt();

        System.out.print("Apakah sekarang hujan? (true/false): ");
        boolean hujan = input.nextBoolean();

        if (uang > 5000 && !hujan) {
            System.out.println("Hasil: Pergi membeli gorengan.");
        } else {
            System.out.println("Hasil: Tidak membeli gorengan.");
        }
    }
}
