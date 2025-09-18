/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_23_COMPRAS {
    final static String ACCESO = "si";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String credito, efectivo;
        System.out.println("Caja de tienda:");
        System.out.println("Cuenta con credito? si/no");
        credito = captu.nextLine();
        System.out.println("Cuenta con efectivo? si/no");
        efectivo = captu.nextLine();
        if (credito.equalsIgnoreCase("si") || efectivo.equalsIgnoreCase("si")){
            System.out.println("SI PUEDE COMPRAR");
        }else{
            System.out.println("NO PUEDE COMPRAR");
        }
        
    }
    
}
