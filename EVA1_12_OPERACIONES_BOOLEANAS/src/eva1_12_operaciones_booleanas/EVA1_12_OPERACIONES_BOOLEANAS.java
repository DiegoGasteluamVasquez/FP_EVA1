/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones_booleanas;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_12_OPERACIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio = 5; //declaro e inicio
        boolean resu;// true false
        //USO DE OPERADORES BOOLEANOS:
        
        resu = radio < 0;//radio (5) < 0
        System.out.println("Radio (5) < es:");
        System.out.println(resu);
        
        resu = radio > 0;//radio (5) > 0
        System.out.println("Radio (5) > es:");
        System.out.println(resu);
        
        resu = radio == 0;//radio (5) == 0
        System.out.println("Radio (5) = es:");
        System.out.println(resu);
        
        resu = radio  !=0;//radio (5) != 0
        System.out.println("Radio (5) != es:");
        System.out.println(resu);
    }
    
}
