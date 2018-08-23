/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author Amalia Yuna
 */
public class buss {
    private int penumpang;
    private int maxPenumpang;
    
    public buss(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(int penumpang) {
        int temp ;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }

    void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
