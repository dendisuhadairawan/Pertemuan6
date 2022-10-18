/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class contohfungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematika mtk = new matematika();
        mtk.nilai1= 100;
        mtk.nilai2= 10;
        
        int hasil = mtk.tambah();
        System.out.println("hasil tambah = " + hasil);
        
        hasil = mtk.kurang();
        System.out.println("hasil kurang = " + hasil);
        
        hasil = mtk.kali();
        System.out.println("hasil kali = " + hasil);
        
        hasil = mtk.bagi();
        System.out.println("hasil bagi = " + hasil);
        
    }
    
}
