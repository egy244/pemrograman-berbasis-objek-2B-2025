package Buku;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
         System.out.println("Data Buku Fiksi");
         for (int i = 0; i< 3; i++){
             System.out.println("Buku Fiksi ke-" + (i+1));
             System.out.print("Judul  : ");
             String judul = input.nextLine();
             System.out.print("Penulis: ");
             String penulis = input.nextLine();
             System.out.print("genre  : ");
             String genre = input.nextLine();
             
             BukuFiksi bukufiksi = new BukuFiksi (judul, penulis, genre);
             perpustakaan.tambahbukufiksi(bukufiksi);
             
         }
         
         System.out.println("Daftar Buku NonFiksi");
         for (int i = 0; i<3; i++){
             System.out.println("Buku NonFiksi ke-" + (i+1));
             System.out.print("Judul  : ");
             String judul = input.nextLine();
             System.out.print("Penulis: ");
             String penulis = input.nextLine();
             System.out.print("Topik  : ");
             String topik = input.nextLine();
             
             BukuNonFiksi bukunonfiksi = new BukuNonFiksi (judul, penulis, topik);
             perpustakaan.tambahbukunonfiksi(bukunonfiksi);
         }
   
        
        perpustakaan.tampilkankoleksi();
    }

}
