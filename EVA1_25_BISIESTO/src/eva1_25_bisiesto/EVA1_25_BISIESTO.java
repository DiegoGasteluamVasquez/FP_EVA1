/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int año, resi4, resi100, resi400;
        System.out.print("CAPTURA EL AÑO:");
        año = captu.nextInt();
        resi4 = año % 4;
        resi100 = año % 100;
        resi400 = año % 400;
        
        
        //CONDICIONES PARA QUE SEA BISIESTO
        //DIVISIBLE ENTRE 4
        if(resi4 == 0){
        // DIVISIBLE ENTRE 100(NO ES BISIESTO)
            if(resi100 == 0){
                //DIVISIBLE ENTRE 400
                if(resi400 == 0){
                    System.out.print("El año");
                    System.out.print(año);
                    System.out.println("ES BISIESTO");
                }else{
                System.out.print("El año");
                System.out.print(año);
                System.out.println("NO ES BISIESTO");
                }
            }else{
            System.out.print("El año");
            System.out.print(año);
            System.out.println("ES BISIESTO");
            }
        }else{
        System.out.print("El año");
        System.out.print(año);
        System.out.println("NO ES BISIESTO");
        }
    }
    
}
