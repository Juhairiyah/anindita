/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rofiq;

/**
 *
 * @author ASUS Q
 */
public class Rofiq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instance
        Struktur st=new Struktur ();
               
        System.out.println(st.ketua());
        System.out.println(st.wakil());
        System.out.println(st.sekretaris());
        System.out.println(st.bendahara());
    }
    
}
class Struktur {
    public String ketua (){
        return " ketua = rofiq";
    }
    public String wakil (){
        return " wakil = rafli";
    }
    public String sekretaris (){
        return " sekretaris = andre";
    }
    public String bendahara (){
        return " bedahara = shofi";
        
    }
}
