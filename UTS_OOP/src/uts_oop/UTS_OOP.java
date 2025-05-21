/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_oop;
import java.util.Scanner;

public class UTS_OOP {
    private static Siswa[] daftarSiswa = new Siswa[10]; // Array untuk menyimpan data siswa
    private static int jumlahSiswa = 0; // Jumlah siswa yang sudah dimasukkan
    private static Scanner scanner = new Scanner(System.in);

    // Menampilkan menu
    private static void tampilkanMenu() {
        System.out.println("\nMenu Aplikasi Siswa:");
        System.out.println("1. Pencatatan Data Siswa");
        System.out.println("2. Menampilkan Data Siswa");
        System.out.println("3. Mengubah Data Siswa");
        System.out.println("4. Menghapus Data Siswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    // Pencatatan Data Siswa
    private static void catatDataSiswa() {
        if (jumlahSiswa < daftarSiswa.length) {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // Untuk membersihkan newline
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();

            Siswa siswaBaru = new Siswa(nama, usia, kelas);
            daftarSiswa[jumlahSiswa] = siswaBaru;
            jumlahSiswa++;
            System.out.println("Data siswa berhasil dicatat.");
        } else {
            System.out.println("Data siswa sudah penuh.");
        }
    }

    // Menampilkan Data Siswa
    private static void tampilkanDataSiswa() {
        if (jumlahSiswa == 0) {
            System.out.println("Belum ada data siswa.");
        } else {
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println("\nData Siswa " + (i + 1) + ":");
                daftarSiswa[i].tampilkanData();
            }
        }
    }

    // Mengubah Data Siswa
    private static void ubahDataSiswa() {
        System.out.print("Masukkan nomor siswa yang ingin diubah (1 - " + jumlahSiswa + "): ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Untuk membersihkan newline

        if (nomor >= 1 && nomor <= jumlahSiswa) {
            Siswa siswa = daftarSiswa[nomor - 1];

            System.out.print("Nama baru: ");
            String nama = scanner.nextLine();
            System.out.print("Usia baru: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // Untuk membersihkan newline
            System.out.print("Kelas baru: ");
            String kelas = scanner.nextLine();

           

            System.out.println("Data siswa berhasil diubah.");
        } else {
            System.out.println("Nomor siswa tidak valid.");
        }
    }

    // Menghapus Data Siswa
    private static void hapusDataSiswa() {
        System.out.print("Masukkan nomor siswa yang ingin dihapus (1 - " + jumlahSiswa + "): ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Untuk membersihkan newline

        if (nomor >= 1 && nomor <= jumlahSiswa) {
            for (int i = nomor - 1; i < jumlahSiswa - 1; i++) {
                daftarSiswa[i] = daftarSiswa[i + 1];
            }
            daftarSiswa[jumlahSiswa - 1] = null; // Menghapus referensi siswa terakhir
            jumlahSiswa--;
            System.out.println("Data siswa berhasil dihapus.");
        } else {
            System.out.println("Nomor siswa tidak valid.");
        }
    }

    // Program utama
    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Untuk membersihkan newline

            switch (pilihan) {
                case 1:
                    catatDataSiswa();
                    break;
                case 2:
                    tampilkanDataSiswa();
                    break;
                case 3:
                    ubahDataSiswa();
                    break;
                case 4:
                    hapusDataSiswa();
                    break;
                case 5:
                    System.out.println("Terima kasih! Aplikasi selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}

