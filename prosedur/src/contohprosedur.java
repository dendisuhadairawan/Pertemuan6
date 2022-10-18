/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class contohprosedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia budi = new manusia();
        budi.nama = "budi";
        budi.jeniskelamin="";
        budi.alamat="";
        
        manusia andi = new manusia();
        andi.nama = "budi";
        andi.jeniskelamin="";
        andi.alamat="";
        
        System.out.println("nama:"+budi.nama);
        System.out.println("jeniskelamin :"+budi.jeniskelamin);
        System.out.println("alamat:"+budi.alamat);
        
        System.out.println("nama:"+andi.nama);
        System.out.println("jeniskelamin :"+andi.jeniskelamin);
        System.out.println("alamat:"+andi.alamat);
    }
    
}
