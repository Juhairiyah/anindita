/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekolah;

/**
 *
 * @author ASUS Q
 */
public class Sekolah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance
        Guru gr =new Guru();
        Siswa sw =new Siswa();
                
        
        System.out.println(gr.nama());
        System.out.println("umur saya = "+ gr.umur(24));
        System.out.println(gr.kelamin());
        System.out.println(gr.status());
        System.out.println(sw.name());
        System.out.println("kelas= "+ sw.kelas(7));  
        System.out.println("NIS = "+ sw.nis(1008));
        System.out.println("Umur = "+ sw.umur(20));
        
    }
    
}
class Guru{
   public String nama (){
       return"nama saya = juhairiyah";
   }
   public int umur (int umur){
       return umur;
   }
   public String kelamin (){
       return"Jenis Kelamin = perempuan";
   }  
   
   public String status (){
       return "Status = menikah";
   }
} 
class Siswa{
    public String name (){
        return"nama saya = fera";
    }
    public int kelas (int kelas){
        return kelas;
    }
    public int nis (int nis){
        return nis;
    }
    public int umur (int umur){
        return umur;

}
    
}
 
