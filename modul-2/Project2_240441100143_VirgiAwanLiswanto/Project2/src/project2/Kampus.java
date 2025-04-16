package project2;

public class Kampus {
    String nama;
    String alamat;

    public Kampus(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama kampus tidak valid karena terdapat angka");
    }
        

    public static void tampilkanInfoKampus(Kampus kampus) {
        System.out.println("Nama Kampus : " + kampus.nama);
        System.out.println("Alamat      : " + kampus.alamat);
    }

    public static boolean validasiNamaKampus(String nama) {
        return !nama.matches(".*\\d.*");
            
        
        
    }
}
