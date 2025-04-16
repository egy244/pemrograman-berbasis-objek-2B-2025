package manusia;

public class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public Manusia(String n,int u,String a){
            nama = n;
            alamat = a;
            umur = u;
        }
    void berjalan(){
        System.out.println(nama + " sedang berjalan");
    }
    
    void berlari(){
        System.out.println(nama + " sedang berlari");
    }
    
    
    void tampilkanInfo(){
        System.out.println("nama :" +nama);
        System.out.println("umur :" +umur);
        System.out.println("alamat :" +alamat);
    }
    
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia ("adi", 18, "surabaya");
        Manusia manusia2 = new Manusia ("edi", 19, "gresik");
        Manusia manusia3 = new Manusia ("egy", 19, "madura");
        Manusia manusia4 = new Manusia ("ali", 20, "lamongan");
        Manusia manusia5 = new Manusia ("ari", 19, "surabaya");
        
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia1.berlari();
        System.out.println();
        manusia2.tampilkanInfo();
        manusia2.berlari();
        manusia2.berjalan();
        System.out.println();
        manusia3.tampilkanInfo();
        manusia3.berjalan();
        manusia3.berlari();
        System.out.println();
        manusia4.tampilkanInfo();
        manusia4.berlari();
        manusia4.berjalan();
        System.out.println();
        manusia5.tampilkanInfo();
        manusia5.berlari();
        manusia5.berjalan();
    }
    
}
