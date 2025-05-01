
package modul3;

public class MainMahasiswa {

    public static void main(String[] args) {
        MahasiswaReguler reguler1 = new MahasiswaReguler ("ferdi sambo", "24044110001", "2D");
        MahasiswaReguler reguler2 = new MahasiswaReguler ("Delia putri manjah", "24044110101", "1D");
        MahasiswaReguler reguler3 = new MahasiswaReguler ("Edi ajah", "24044110111", "3D");
        System.out.println("Data Mahasiswa Reguler");
        reguler1.infoReguler();
        reguler2.infoReguler();
        reguler3.infoReguler();
        System.out.println(" ");
        MahasiswaBeasiswa beasiswa1 = new MahasiswaBeasiswa ("Mukhlis kece", "240441100123", "Bidik Misi");
        MahasiswaBeasiswa beasiswa2 = new MahasiswaBeasiswa ("edy kece", "240441100124", "KIP");
        MahasiswaBeasiswa beasiswa3 = new MahasiswaBeasiswa ("Nurman kece", "240441100123", "LPDP");
        System.out.println("Data Mahasiswa Beasiswa");
        beasiswa1.infoBeasiswa();
        beasiswa2.infoBeasiswa();
        beasiswa3.infoBeasiswa();
    }
    
}
