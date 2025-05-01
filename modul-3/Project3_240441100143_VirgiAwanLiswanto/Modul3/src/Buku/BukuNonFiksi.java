
package Buku;

public class BukuNonFiksi extends Buku {
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik){
    super(judul, penulis);
    this.topik = topik;
    }
    
    public void infoNonFiksi(){
    super.info();
        System.out.println("Topik   :"+ topik);
    }
}
