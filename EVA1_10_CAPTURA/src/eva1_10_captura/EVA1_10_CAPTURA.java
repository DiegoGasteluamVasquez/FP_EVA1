/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITAR LA TEMPERATURA EN FARENHEIT
        Scanner input = new Scanner(System.in);
        double F,C;
        //CAPTURA:
        System.out.println("Temperatura en grados Farenheit:");
        F = input.nextDouble();
        C = 5*(F - 32) / 9;
        System.out.println("La temperatura es:");
        System.out.println(C);
        
    }
    
}
