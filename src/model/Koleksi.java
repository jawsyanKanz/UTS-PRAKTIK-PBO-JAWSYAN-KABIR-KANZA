package model;

/**
 * Kelas induk (abstract) untuk seluruh jenis koleksi perpustakaan.
 */
public abstract class Koleksi {
    private final String kodeKoleksi;
    private final String judul;
    private final int tahunTerbit;

    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getKodeKoleksi() {
        return kodeKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    /** Aturan kelayakan pinjam, wajib ditentukan oleh setiap turunan. */
    public abstract boolean layakDipinjam();

    /** Deskripsi dasar, diperluas oleh setiap turunan memakai super. */
    public String deskripsi() {
        return kodeKoleksi + " | " + judul + " | " + tahunTerbit;
    }
}
