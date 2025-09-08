/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULO DE VELOCIDAD:
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        //CALCULAR LA VELOCIDAD (M/S)
        //DECLARAR VARIABLES Y SCANNER
        
        //SOLICITAR DATOS
        
        //REALIZAR CALCULOS
        
        //MOSTRAR RESULTADOS
        Scanner input = new Scanner(System.in); 
        double velocidad,D,T,velocidad2;
        System.out.println("Captura la distancia en (M):");
        D = input.nextDouble();
        System.out.println("Captura el tiempo en (S)");
        T = input.nextDouble();
        velocidad = D/T;
        System.out.println("La velocidad (M/S)es:");
        System.out.println(velocidad);
        velocidad2 = velocidad * 3.6;
        System.out.println("La velocidad en km/hr es:");
        System.out.println(velocidad2);
        
        
        
      
    }
    
}
