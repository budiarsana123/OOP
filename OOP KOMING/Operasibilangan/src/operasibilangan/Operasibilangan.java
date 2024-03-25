/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasibilangan;

/**
 *
 * @author INSTIKI
 */
public class Operasibilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float b1, b2, jml, krg, bg;
        b1 = 5;
        b2 = 7;
        jml = b1 + b2;
        krg = b1 - b2;
        bg = b1 / b2;
        System.out.println(b1 +" + "+b2 +" = "+ jml);
        System.out.println(b1 +" - "+b2 +" = "+ krg);
        System.out.println(b1 +" %"+ b2 +" = "+ String.format("%.2f", bg));  
    }
}
    
