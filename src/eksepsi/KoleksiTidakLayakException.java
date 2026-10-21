/*
 * UTS Praktik Pemrograman Berorientasi Objek II - SIPUSTA
 * Nama  : MAULANA SIDDIQ AL-HUSEIN
 * Kelas : TRPL-1B
 * NIM   : 2505181022
 */
package eksepsi;

public class KoleksiTidakLayakException extends PustakaException {

    public KoleksiTidakLayakException(String judul, String alasan) {
        super("Maaf, \"" + judul + "\" belum dapat dipinjam saat ini karena " + alasan + ".");
    }
}
