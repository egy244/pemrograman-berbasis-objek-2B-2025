
package karnivora;

public class Omnivora {
    String namahewan;
    String makanan;
    String tempattinggal;
    
    public Omnivora (String n, String m, String t){
        namahewan = n;
        makanan = m;
        tempattinggal= t;
    }
    
    public void memakan3(){
        System.out.println(namahewan+"mereka memakan keduanya daging dan tumbuhan");
    }
    public void tampilkaninfo3 (){
        System.out.println(namahewan+" mereka memakan"+ makanan +"dan tinggal di"+ tempattinggal);
    
    } 
}

