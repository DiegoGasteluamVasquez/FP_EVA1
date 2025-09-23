/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_28_MONEDA {
    final static String LADO1 = "aguila";
    final static String LADO2 = "sello";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String lado;
        System.out.println("Escoge un lado:");
        lado = captu.nextLine();
        if (Math.random()<0.5){
            if(lado.equals(LADO1)){
            System.out.println(LADO1 + " GANASTE");
            }else{
            System.out.println(LADO1 + (" PERDISTE"));
            }
        }else if (Math.random()>0.5){
            if(lado.equals(LADO2)){
            System.out.println(LADO2 + " GANASTE");
            }else{
            System.out.println(LADO2 + " PERDISTE");
            }
        }
    }
    
}
