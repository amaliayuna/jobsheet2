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
public class ujibuss {
    
    private int penumpang;
    private int maxPenumpang;
    
    public ujibuss(int maxPenumpang){
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
    public void cetak(){
        System.out.println("penumpang bus sekarang adalah"+penumpang);
        System.out.println("penumpang bus sekarang adalah"+maxPenumpang);
    }

    public static void main(String[] arg){
        
        ujibuss busBesar = new ujibuss(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
      
    }   
}
