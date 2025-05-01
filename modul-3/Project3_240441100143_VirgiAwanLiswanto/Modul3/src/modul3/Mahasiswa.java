
package modul3;

public class Mahasiswa {
    String Nama;
    String Nim;
    
    public Mahasiswa (String nama, String nim){
        this.Nama = nama;
        this.Nim = nim;
          
    }
    
    public void infoMahasiswa(){
        System.out.println("=====Data Mahasiswa=====");
        System.out.println("Nama    : " + Nama);
        System.out.println("Nim     : " + Nim);
    }
}

    