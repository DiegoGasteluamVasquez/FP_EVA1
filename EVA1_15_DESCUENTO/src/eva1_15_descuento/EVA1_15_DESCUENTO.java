/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        double venta;
        double montoPagar;
        System.out.println("INGRESE EL MONTO DE LA VENTA:");
        venta = captu.nextDouble();
        if (venta > 1000){
        montoPagar = venta * 0.85;
        System.out.println("EL MONTO A PAGAR ES:");
        System.out.println(montoPagar);
        }
                    
        
    }
    
}
