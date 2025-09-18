/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2;
        Scanner captu = new Scanner(System.in);
        System.out.println("INGRESA EL PRIMER NUMERO:");
        numero1 = captu.nextInt();
        System.out.println("INGRESA EL SEGUNDO NUMERO:");
        numero2 = captu.nextInt();
        if (numero1 > numero2){
            System.out.println("El numero mayor es:");
            System.out.println(numero1);
        }else{// NOS QUEDA NUM2 > NUM1 O NUM2 == NUM1
            if (numero2 > numero1){
            System.out.println("El numero mayor es:");
            System.out.println(numero2);
        }else{
                System.out.println("Los numeros son iguales");
        }
    }
    
    
    }}