/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukllive1;

/**
 *
 * @author LENOVO
 */
public class Anak extends Bunda{
    
    
    String nama2 = "Budi";
    int umur2 = 10;
    
    public void cetak(){
        System.out.println("Anak ini namanya : "+nama2);
        System.out.println("Anak ini berumur : "+umur2);
        System.out.println("Anak ini mempunyai ibu bernama : "+super.nama);
        System.out.print("Anak ini memiliki sikap : ");
        super.sikap();
    
}
    
}
