    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author fmc
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance
        HewanKakiEmpat hw =new HewanKakiEmpat();
        System.out.println(hw.nama());
        System.out.println("jmlkaki="+ hw.jmlkaki(4));
        System.out.println(hw.Makanan());
      
    }
    
}
class HewanKakiEmpat{
    public String nama (){
        return"sapi";
    }
    public int jmlkaki(int jmlkaki){
        return jmlkaki;
    }
    public String Makanan (){
        return"rumput";}
}
    