package project2;

public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;

        if (sks < 2 || sks > 3) {
            System.out.println("SKS tidak valid untuk " + nama + ": " + sks + " SKS. Hanya 2 atau 3 yang diperbolehkan.");
            this.sks = -1; 
            System.exit(1);
        } else {
            this.sks = sks;
        }
    }

    public boolean isValid() {
        return sks == 2 || sks == 3;
    }

    public void tampilkanInfo() {
        System.out.println( nama + " (" + kode + "), SKS: " + sks);
    }
}

