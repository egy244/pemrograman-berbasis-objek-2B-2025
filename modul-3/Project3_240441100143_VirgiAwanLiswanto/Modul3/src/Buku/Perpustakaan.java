
package Buku;
import java.util.ArrayList;
public class Perpustakaan {
    ArrayList<BukuFiksi> koleksifiksi = new ArrayList<>();
    ArrayList<BukuNonFiksi> koleksinonfiksi = new ArrayList<>();
    
    public void tambahbukufiksi (BukuFiksi Buku){
        koleksifiksi.add(Buku);
    }
    
    public void tambahbukunonfiksi (BukuNonFiksi Buku){
        koleksinonfiksi.add(Buku);
    }
    
    public void tampilkankoleksi(){
        System.out.println("Daftar Buku Fiksi");
        for (BukuFiksi Buku : koleksifiksi){
            Buku.infofiksi();
        }
        
        System.out.println("Daftar Buku Non Fiksi");
        for (BukuNonFiksi Buku : koleksinonfiksi){
            Buku.infoNonFiksi();
        }
    }
}
