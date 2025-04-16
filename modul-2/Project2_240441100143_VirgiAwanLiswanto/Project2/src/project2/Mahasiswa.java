package project2;

public class Mahasiswa {
    String nama, nim, jurusan;
    MataKuliah[] matkulList = new MataKuliah[10];
    int jumlahMatkul = 0;
    static int totalMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String jurusan) {
        if (!validasiNIM(nim)) {
            System.out.println("NIM tidak valid: " + nim + ". Harus diawali '23' dan terdiri dari 10 digit.");
            System.exit(1);
        }
            
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        totalMahasiswa++;
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (mk != null && mk.isValid()) {
            matkulList[jumlahMatkul++] = mk;
        } else {
            System.out.println("Mata kuliah tidak ditambahkan: " + (mk != null ? mk.nama : "null"));
        }
    }

    public void tampilkanBiodata() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Mata Kuliah:");
        for (int i = 0; i < jumlahMatkul; i++) {
            matkulList[i].tampilkanInfo();
        }
    }

    public static void tampilkanTotalMahasiswa() {
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    public static boolean validasiNIM(String nim) {
        return nim.matches("^23\\d{8}$");
        
    }
}
