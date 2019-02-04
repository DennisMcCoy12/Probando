/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enero_31;

import javax.swing.JOptionPane;

/**
 *
 * @author Dennis McCoy
 */
public class Enero_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad,horas, pago;
        
        nombre=JOptionPane.showInputDialog("Ingrese nombre del trabajador: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del trabajador: "));
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas por el trabajador: "));
        
        
        
        if(horas>=40)
        {
            
            horas=horas-40;
            pago=(40*16)+(horas*20);
            
        }
        else
        {
            pago=horas*16;
            horas=0;
        }
        
        JOptionPane.showMessageDialog(null,"NOMBRE: "+nombre+"\n"+"EDAD: "+edad+"\n"+
                "HORAS EXTRAS: "+horas+"\n"+"PAGO SEMANAL: "+pago+"\n");
        /*solo escribi esto we, ahora esto*/
    }
    
}
