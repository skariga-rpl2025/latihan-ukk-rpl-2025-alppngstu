
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Studio
 */
public class PendaftaranAnggotaGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String lanjut;

        do {
            System.out.print("Masukkan nama anggota: ");
            String nama = input.nextLine(); // mencatat nama anggota
            totalAnggota++; // menambah jumlah anggota

            System.out.print("Daftar anggota lagi? [ya/tidak]> ");
            lanjut = input.nextLine().trim().toLowerCase(); 

        } while (lanjut.equals("ya"));

        System.out.println("\nTotal anggota yang didaftarkan hari ini: " + totalAnggota);
    }
}


