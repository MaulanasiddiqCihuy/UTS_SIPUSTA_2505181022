/*
 * UTS Praktik Pemrograman Berorientasi Objek II - SIPUSTA
 * Nama  : MAULANA SIDDIQ AL-HUSEIN
 * Kelas : TRPL-1B
 * NIM   : 2505181022
 */
package model;

/**
 * Kemampuan untuk koleksi yang memiliki lokasi fisik di rak.
 * Hanya BukuCetak dan Majalah yang menerapkannya.
 */
public interface Terarsip {

    String nomorRak();

    String lokasiLantai();

    default String ringkasanArsip() {
        return "Rak " + nomorRak() + ", " + lokasiLantai();
    }
}
