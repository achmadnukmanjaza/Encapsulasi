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
public class LatianEmpatUjiBus {
    public static void main(String[]abc){
    LatianEmpatBus Bus = new LatianEmpatBus(5);
    Bus.getpenumpang(17);
    Bus.getpenumpang(24);
    Bus.cetakpenumpang();
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
    Bus.addpenumpang(1);
    Bus.cetakpenumpang();
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
}
}