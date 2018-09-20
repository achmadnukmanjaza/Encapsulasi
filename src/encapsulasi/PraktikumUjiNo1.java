/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulasi;

/**
 *
 * @author HP
 */
public class PraktikumUjiNo1 {
    public static void main(String[]args){
        PraktikumNo1 a = new PraktikumNo1();
        a.setPassword(24);
        if(a.getPassword()){
            
        
        a.setPenumpang(8);
        a.setPenumpangBaru(2);
        a.setMaxPenumpang(10);
        a.setBerat(945);
            
            System.out.println(" ----- Perhitungan rata rata berat penumpang ----- ");
            System.out.println("Penumpang awal : 8");
            System.out.println("Penumpang baru : 2");
            System.out.println("Berat total penumpang : 945");
            System.out.println("");
            System.out.println("Rata rata berat : " + a.getAverage());
    }
        }
}
