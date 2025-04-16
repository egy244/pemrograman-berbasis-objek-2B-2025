
package karnivora;
public class Karnivora {
    String namahewan;
    String makanan;
    String tempattinggal;
    
    public Karnivora (String n, String m, String t){
        namahewan = n;
        makanan = m;
        tempattinggal= t;
    }
    
    void memakan(){
        System.out.println(namahewan+" mereka memakan daging");
    }
    void tampilkaninfo (){
        System.out.println(namahewan+" mereka memakan"+ makanan +" dan tinggal di "+ tempattinggal);
    
    }
    public static void main(String[] args) {
        String[] namahewan1 = {"singa", "buaya", "harimau"};
        String[] namahewan2 = {"jerapah", "sapi", "kambing"};
        String[] namahewan3 = {"lele", "kura-kura", "monyet"};
        String[] makananhewan1 = {"daging", "daging", "daging"};
        String[] makananhewan2 = {"tumbuhan", "biji-bijian", "rumput"};
        String[] makananhewan3 = {"daging dan tumbuhan", "daging dan tumbuhan", "daging dan tumbuhan"};
        String[] tempattinggal1 = {"darat", "air", "darat"};
        String[] tempattinggal2 = {"darat", "darat", "darat"};
        String[] tempattinggal3 = {"air", "air dan darat", "darat"};
        
        Karnivora[] daftarKarnivora = new Karnivora[3];
        Herbivora[] daftarHerbivora = new Herbivora[3];
        Omnivora[] daftarOmnivora = new Omnivora[3];

        
        for (int i = 0; i < daftarKarnivora.length; i++) {
            daftarKarnivora[i] = new Karnivora(namahewan1[i], makananhewan1[i], tempattinggal1[i]);
        }
        for (int i = 0; i < daftarHerbivora.length; i++) {
            daftarHerbivora[i] = new Herbivora(namahewan2[i], makananhewan2[i], tempattinggal2[i]);
        }
        for (int i = 0; i < daftarOmnivora.length; i++) {
            daftarOmnivora[i] = new Omnivora(namahewan3[i], makananhewan3[i], tempattinggal3[i]);
        }

        for (Karnivora k : daftarKarnivora) {
            k.tampilkaninfo();
            k.memakan();
            System.out.println(); 
        }
        for (Herbivora h : daftarHerbivora) {
            h.tampilkaninfo2();
            h.memakan2();
            System.out.println(); 
        }
        for (Omnivora o : daftarOmnivora) {
            o.tampilkaninfo3();
            o.memakan3();
            System.out.println(); 
        }
    }
             
    
    
}
    
    

