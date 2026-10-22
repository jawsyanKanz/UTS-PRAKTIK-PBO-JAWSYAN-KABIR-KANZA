import model.BerkasDigital;
import model.BukuCetak;
import model.Koleksi;
import model.Majalah;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Koleksi> koleksi = new ArrayList<>();
        koleksi.add(new BukuCetak("BK-001", "Java How to Program", 2022, 620, "A-12", 1, false));
        koleksi.add(new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "B-04", 2, true));
        koleksi.add(new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, 88, "Agustus", "C-01", 1, true));
        koleksi.add(new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, 87, "Juli", "C-02", 1, false));
        koleksi.add(new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15, "unduh.polmed.ac.id/bd001"));
        koleksi.add(new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8, "unduh.polmed.ac.id/bd002"));

        System.out.println(" SOAL 1: Hierarki Kelas");
        for (Koleksi k : koleksi) {
            System.out.println(k.deskripsi());
            System.out.println("   Layak dipinjam: " + (k.layakDipinjam() ? "Ya" : "Tidak"));
        }
    }
}
