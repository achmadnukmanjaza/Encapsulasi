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
public class PraktikumNo1 {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double average;
    private double password;
    private double berat;
    
    public void addpenumpang(int penumpang){
        int temp;
        temp = (int) (this.penumpang+penumpang);
        if(temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else
        {
            this.penumpang = temp;
        }
    }

    public double getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public double getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setMaxPenumpang(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public double getPenumpangBaru() {
        
        return penumpangBaru;
    }

    public void setPenumpangBaru(double penumpangBaru) {
        this.penumpang += penumpangBaru;
    }

    public double getAverage() {
        average=berat/penumpang;
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public boolean getPassword() {
        boolean bener=false;
        if(this.password==24){
            bener=true;
        }return bener;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    
}