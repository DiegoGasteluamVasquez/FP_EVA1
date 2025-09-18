/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_errores_comunes;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_21_ERRORES_COMUNES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = num2 = 2;
        
        if (num1 > num2)
            if (num1 > num2)//error termina en if;
            System.out.println("Ups, fuera del if");
        
        else//parece que pertenece al primer if, pero es del segundo
                
           if (num1 > num2){
               if(num1 > num2)
                System.out.println("Num1 es mayor");
           }else{//PERTENECE AL PRIMER IF
           }
    }
    
}
