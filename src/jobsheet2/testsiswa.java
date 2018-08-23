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
public class testsiswa {
    public static void main(String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("julian");
        siswa.setAge(23);
        siswa.getAddress("Malang");
        
        System.out.println("\nName : "+ siswa.getName()+
        "\nAbsen   : " + siswa.getAbsen()+
        "\nAddress : " + siswa.getAddress());
    }
    
}
