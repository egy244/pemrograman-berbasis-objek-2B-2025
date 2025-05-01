
package modul3;

public class MahasiswaBeasiswa extends Mahasiswa {
    String jenisbeasiswa;
    
    public MahasiswaBeasiswa(String Nama, String Nim, String jenisbeasiswa){
        super(Nama,Nim);
        this.jenisbeasiswa = jenisbeasiswa;
    }
    
    public void infoBeasiswa(){
        super.infoMahasiswa();
        System.out.println("Jenis Beasiswa " + jenisbeasiswa);
    }
}
