
package modul3;

public class MahasiswaReguler extends Mahasiswa {
    String Kelas;
    
   public MahasiswaReguler(String Nama, String Nim, String kelas){
       super(Nama, Nim);
       this.Kelas = kelas;
      
   }

    
    public void infoReguler(){
        super.infoMahasiswa();
        System.out.println("Kelas   : "+Kelas);
    }
    
}
