/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasenskapsulasi;

/**
 *
 * @author Amalia Yuna
 */
public class AmaliaYuna {
    public static void main(String args[]){
        encapamalia amel = new encapamalia();
        amel.setNamaAyah("Yunaedi");
        amel.setNamaIbu("Lina Yuliati");
        amel.setNamaSendiri("Amalia Yuna Puspita");
        amel.setNamaSaudara("Chelsea Yuna Imani");
        amel.setAlamat("Ds.Sumbermanjingkulon,Pagak,Malang");
        amel.setHobi("membaca buku, menyanyi, berenang");
        amel.setCitacita("web programer handal,aaamiiinnn");
        amel.setUmur(15);
        
        
        System.out.println("Nama Ayah : "+ amel.getNamaAyah()+
                "\nNama Ibu : "+amel.getNamaIbu()+
                "\nNama Sediri : "+ amel.getNamaSendiri()+
                "\nNama Saudara : "+amel.getNamaSaudara()+
                "\nUmur : " + amel.getUmur()+
                "\nAlamat : "+amel.getAlamat()+
                "\nHobi : "+ amel.getHobi()+
                "\nCita-Cita :" + amel.getCitacita());
    }
    
}
