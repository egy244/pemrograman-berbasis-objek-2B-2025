
package karnivora;

public class Herbivora {
    String namahewan;
    String makanan;
    String tempattinggal;
    
    public Herbivora (String n, String m, String t){
        namahewan = n;
        makanan = m;
        tempattinggal= t;
    }
    
    public void memakan2(){
        System.out.println(namahewan+"mereka memakan tumbuhan");
    }
    public void tampilkaninfo2 (){
        System.out.println(namahewan+" mereka memakan"+ makanan +"dan tinggal di"+ tempattinggal);
    
    } 
}
