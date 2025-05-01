
package Buku;

public class BukuFiksi extends Buku{
    String genre;
    public BukuFiksi(String judul, String penulis, String genre){
        super(judul, penulis);
        this.genre = genre;
    }
    
    public void infofiksi(){
        super.info();
        System.out.println("Genre   :"+ genre);
    }
    
}
