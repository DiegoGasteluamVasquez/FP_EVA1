/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_27_conversiones;

/**
 *
 * @author DiegogvTEC ll
 */
public class EVA1_27_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        double tempDec = 25.7;
        temp = (int)tempDec;//CASTING
        System.out.println(temp);
        
        double tempDec2;
        tempDec2 = temp;
        System.out.println(tempDec2);
        
        String cade, mensaje;
        cade = "LA TEMPERATURA ES";
        mensaje = cade + temp;//CONCATENACION
        System.out.println(mensaje);
        
    }
    
}
