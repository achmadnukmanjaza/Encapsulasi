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
public class PraktikumNo2Bola {
    private double jariJari,diameter,luasPermukaan,volume;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLuasPermukaan() {
        luasPermukaan = 4*Math.PI*jariJari*jariJari;
        return luasPermukaan;
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    public double getVolume() {
        volume = 4*Math.PI*jariJari*jariJari*jariJari/3; 
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
   
    
}
