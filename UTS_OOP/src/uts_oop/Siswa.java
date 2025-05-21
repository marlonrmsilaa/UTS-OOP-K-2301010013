/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop;

/**
 *
 * @author INSTIKI
 */
public class Siswa {
    private String nama;
    private int usia;
    private String kelas;

    // Constructor
    public Siswa(String nama, int usia, String kelas) {
        this.nama = nama;
        this.usia = usia;
        this.kelas = kelas;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    // Menampilkan data siswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Kelas: " + kelas);
    }
}
