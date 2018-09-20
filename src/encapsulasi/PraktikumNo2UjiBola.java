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
public class PraktikumNo2UjiBola {
    public static void main(String[]args){
        PraktikumNo2Bola Bola = new PraktikumNo2Bola();
        Bola.setJariJari(10);
        Bola.setDiameter(20);
        
        System.out.println(" ----- Menghitung luas permukaan bola dan volume bola ----- ");
        System.out.println("");
        System.out.println("Diameter : 10");
        System.out.println("Jari jari : 5");
        System.out.println("");
        System.out.println("Luas permukaan : " + Bola.getLuasPermukaan());
        System.out.println("");
        System.out.println("Volume : " + Bola.getVolume());
    }
    
}
