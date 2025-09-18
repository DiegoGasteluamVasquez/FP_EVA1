/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;
/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_20_ANTRO {
    final static String ACCESO_CRE = "SI";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String credencial;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("ANTRO");
        System.out.print("EDAD:");
        edad = Integer.parseInt(captu.nextLine());
        System.out.print("CREDENCIAL:");
        credencial = captu.nextLine();
        if(edad >=18){
            if(credencial.equals(ACCESO_CRE)){
                System.out.println("ACCESO CONCEDIDO!!");
        }else{
                System.out.println("ACCESO DENEGADO!!");
                }
        }else{
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}
