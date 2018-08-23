/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author SMK TELKOM
 */
public class Bus {
    public double Penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }
    //method mutator
    public void addpenumpang(double Penumpang){
        double temp;
        temp = this.Penumpang+Penumpang;
        if (temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.Penumpang = temp;
            counter++;
        }
    }
    public void getpenumpang(double password){
        if(password==24){
            System.out.println("Password benar");
        }
        else{
            System.out.println("Password salah");
        }
    }
    public double getAverage(){
        return Penumpang/counter;
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus sekarang = "+Penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxPenumpang);
    }
}
