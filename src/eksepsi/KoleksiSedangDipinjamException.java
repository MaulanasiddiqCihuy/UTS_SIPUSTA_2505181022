/*
 * UTS Praktik Pemrograman Berorientasi Objek II - SIPUSTA
 * Nama  : MAULANA SIDDIQ AL-HUSEIN
 * Kelas : TRPL-1B
 * NIM   : 2505181022
 */
package eksepsi;

public class KoleksiSedangDipinjamException extends PustakaException {

    public KoleksiSedangDipinjamException(String judul) {
        super("Maaf, \"" + judul + "\" sedang dipinjam oleh pengguna lain. "
                + "Silakan coba lagi setelah koleksi dikembalikan.");
    }
}
