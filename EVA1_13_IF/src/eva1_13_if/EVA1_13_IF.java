/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double califa;
        Scanner input = new Scanner(System.in);
        //CAPTURA
        System.out.println("Introduce tu calificación:");
        califa = input.nextDouble();
        if(califa >=70){ //SOLO EVALUA VERDADERO (true) o FALSO (FALSE)
            //AQUI VA LO QUE CORRESPONDE A FALSO
            System.out.println("FELICITACIONES, ACREDITASTE!!");
        }else{ //SECCION FALSO(OPCIONAL)
            System.out.println("AZOTES!!");
        }
        
    }
    
}
