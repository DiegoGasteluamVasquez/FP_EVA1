/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_acceso_tablas;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_22_ACCESO_TABLAS {
  //CONSTANTES
   final static String ACCESO_USU = "DIEGO";
   final static String ACCESO_CONTRA = "1234";
   //FINAL STATIC DOUBLE PI = 3.1416
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, contra;
        Scanner captu = new Scanner(System.in);
       
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("Restaurante La Cucaracha Crocante");
        System.out.print("Usuario: ");
        usuario = captu.nextLine();
        System.out.println("Contraseña:");
        contra = captu.nextLine();
        if(usuario.equals(ACCESO_USU) && contra.equals(ACCESO_CONTRA)){
            System.out.println("ACCCESO CONCEDIDO!!");
        }else{
            System.out.println("ACCESO DENEGADO!!");
        }
    }
    
}
