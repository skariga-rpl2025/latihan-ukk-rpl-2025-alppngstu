
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Studio
 */
public class KalkulatorSederhana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan Angka 1: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan Angka 2: ");
        double angka2 = input.nextDouble();

        double hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                } else {
                    System.out.println("Error: Tidak dapat melakukan pembagian dengan nol!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}



