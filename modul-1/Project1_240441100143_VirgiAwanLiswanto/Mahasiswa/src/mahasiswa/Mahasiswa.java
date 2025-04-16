package mahasiswa;
import java.util.Scanner;
public class Mahasiswa {
    String nama;
    int nim;
    String prodi;
    String alamat;
    
    public Mahasiswa (String n, int m, String p, String a){
        nama = n;
        nim = m;
        prodi = p;
        alamat = a;   
    }
    
    void tampilkaninfo (){
        System.out.println("DATA MAHASISWA");
        System.out.println("Nama    :" +nama);
        System.out.println("Nim     :" +nim);
        System.out.println("Prodi   :" +prodi);
        System.out.println("Alamat  :" +alamat);
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data mahasiswa pertama");
        System.out.print("Nama       : ");
        String nama1 = input.nextLine();
        
        System.out.print("Nim        : ");
        int nim1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Prodi      : ");
        String prodi1 = input.nextLine();
        
        System.out.print("Alamat     : ");
        String alamat1 = input.nextLine();
        
        Mahasiswa mahasiswa1 = new Mahasiswa (nama1, nim1, prodi1, alamat1);
        System.out.println("");
        System.out.println("Masukkan data mahasiswa kedua");
        System.out.print("Nama       : ");
        String nama2 = input.nextLine();
        
        System.out.print("Nim        : ");
        int nim2 = input.nextInt();
        input.nextLine();
        
        System.out.print("Prodi      : ");
        String prodi2 = input.nextLine();
        
        System.out.print("Alamat     : ");
        String alamat2 = input.nextLine();
        
        Mahasiswa mahasiswa2 = new Mahasiswa (nama2, nim2, prodi2, alamat2);
        System.out.println("");
        System.out.println("Masukkan data mahasiswa ketiga");
        System.out.print("Nama       : ");
        String nama3 = input.nextLine();
        
        System.out.print("Nim        : ");
        int nim3 = input.nextInt();
        input.nextLine();
        
        System.out.print("Prodi      : ");
        String prodi3 = input.nextLine();
        
        System.out.print("Alamat     : ");
        String alamat3 = input.nextLine();
        
        Mahasiswa mahasiswa3 = new Mahasiswa (nama3, nim3, prodi3, alamat3);
        
        mahasiswa1.tampilkaninfo();
        System.out.println("");
        mahasiswa2.tampilkaninfo();
        System.out.println("");
        mahasiswa3.tampilkaninfo();
        
        
        
                
    }
    
}
