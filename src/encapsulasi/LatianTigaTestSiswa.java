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
public class LatianTigaTestSiswa {
    public static void main(String[] args){
        LatianTigaEncapSiswa siswa = new LatianTigaEncapSiswa();
        siswa.setName("Nukman");
        siswa.setAddress("Malang");
        siswa.setAbsen(03);
        System.out.println("Nama : " + siswa.getName() + "Absen : " + siswa.getAbsen() + "Address : " + siswa.getAddress());
    }
    
}
