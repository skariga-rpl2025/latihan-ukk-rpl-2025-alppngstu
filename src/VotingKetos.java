
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Studio
 */
public class VotingKetos {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println("=== PROGRAM QUICK COUNT KETUA OSIS ===");
        System.out.println("Ketik 'selesai' untuk mengakhiri penghitungan.\n");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine().trim().toLowerCase();

            if (pilihan.equals("selesai")) {
                break; // keluar dari perulangan
            } else if (pilihan.equals("a")) {
                suaraA++;
            } else if (pilihan.equals("b")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Masukkan hanya A, B, atau 'selesai'.");
            }
        }

        System.out.println("\n=== HASIL AKHIR QUICK COUNT ===");
        System.out.println("Total suara untuk Kandidat A: " + suaraA);
        System.out.println("Total suara untuk Kandidat B: " + suaraB);
    }
}


