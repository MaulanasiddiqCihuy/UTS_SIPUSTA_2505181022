/*
 * UTS Praktik Pemrograman Berorientasi Objek II - SIPUSTA
 * Nama  : MAULANA SIDDIQ AL-HUSEIN
 * Kelas : TRPL-1B
 * NIM   : 2505181022
 */
package eksepsi;

/** Induk seluruh kesalahan pada sistem SIPUSTA. */
public class PustakaException extends Exception {

    public PustakaException(String pesan) {
        super(pesan);
    }
}
