/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class contohparameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematika mtk = new matematika();
      int a = mtk.tambah(100, 50);
        System.out.println(a);
        
        a = mtk.kurang(100, 50);
        System.out.println(a);
        
        a = mtk.kali(100, 50);
        System.out.println(a);
        
        double b = mtk.bagi(100,110);
        System.out.println(b);
        
        
        
    }
    
}
