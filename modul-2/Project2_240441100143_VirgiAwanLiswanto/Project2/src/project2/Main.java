package project2;

public class Main {
    public static void main(String[] args) {
        MataKuliah[] semuaMatkul = {
            new MataKuliah("MK001", "PBO", 2),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Algoritma", 3),
            new MataKuliah("MK004", "Jaringan", 2),
            new MataKuliah("MK005", "Web", 2),
            new MataKuliah("MK006", "PAI", 3),
            new MataKuliah("MK007", "BHS.Inggris", 2),
            new MataKuliah("MK008", "UI/UX", 3)
        };

        Kampus kampus = new Kampus("Universitas Trunojoyo Madura","Bangkalan");
        Mahasiswa[] mhsList = new Mahasiswa[6];
        mhsList[0] = new Mahasiswa("Andi", "2312345678", "Sistem Informasi");
        mhsList[1] = new Mahasiswa("Budi", "2312345679", "Sistem Informasi");
        mhsList[2] = new Mahasiswa("Citra", "2312345680", "Sistem Informasi");
        mhsList[3] = new Mahasiswa("Dewi", "2312345681", "Sistem Informasi");
        mhsList[4] = new Mahasiswa("Eko", "2312345682", "Sistem Informasi");
        mhsList[5] = new Mahasiswa("Fani", "2312345683", "Sistem Informasi");

        mhsList[0].tambahMataKuliah(semuaMatkul[0]); 
        mhsList[0].tambahMataKuliah(semuaMatkul[1]); 
        mhsList[0].tambahMataKuliah(semuaMatkul[4]); 
        mhsList[0].tambahMataKuliah(semuaMatkul[6]); 

        mhsList[1].tambahMataKuliah(semuaMatkul[2]); 
        mhsList[1].tambahMataKuliah(semuaMatkul[3]); 
        mhsList[1].tambahMataKuliah(semuaMatkul[5]); 
        mhsList[1].tambahMataKuliah(semuaMatkul[7]); 

        mhsList[2].tambahMataKuliah(semuaMatkul[1]);
        mhsList[2].tambahMataKuliah(semuaMatkul[3]);
        mhsList[2].tambahMataKuliah(semuaMatkul[5]);
        mhsList[2].tambahMataKuliah(semuaMatkul[6]);

        mhsList[3].tambahMataKuliah(semuaMatkul[0]);
        mhsList[3].tambahMataKuliah(semuaMatkul[2]);
        mhsList[3].tambahMataKuliah(semuaMatkul[4]);
        mhsList[3].tambahMataKuliah(semuaMatkul[7]);

        mhsList[4].tambahMataKuliah(semuaMatkul[0]);
        mhsList[4].tambahMataKuliah(semuaMatkul[3]);
        mhsList[4].tambahMataKuliah(semuaMatkul[6]);
        mhsList[4].tambahMataKuliah(semuaMatkul[7]);

        mhsList[5].tambahMataKuliah(semuaMatkul[1]);
        mhsList[5].tambahMataKuliah(semuaMatkul[2]);
        mhsList[5].tambahMataKuliah(semuaMatkul[4]);
        mhsList[5].tambahMataKuliah(semuaMatkul[5]);

        System.out.println("        INFO KAMPUS     ");
        Kampus.tampilkanInfoKampus(kampus);
        System.out.println(" " +
            (Kampus.validasiNamaKampus(kampus.nama) ? "" : "Tidak Valid"));
        System.out.println();

        System.out.println("     DATA MAHASISWA     ");
        for (Mahasiswa m : mhsList) {
            m.tampilkanBiodata();
            System.out.println("---------------------------");
        }

        Mahasiswa.tampilkanTotalMahasiswa();
    }
}
