/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprobacion;
import Menu.*;
import javax.swing.JOptionPane;
/**
 *
 * @author balva
 */
public class NumeroAleatorio {
    private int numeroAleatorio;
    public void generarNum(){
    numeroAleatorio = (int) (Math.random()*36+1); 
    }
     
     
     menuApuestas menu=new menuApuestas();
     public void compara(){
   if(numeroAleatorio==menu.getPosicion()){
       JOptionPane.showMessageDialog(null,"Saiu o numero"+numeroAleatorio);
       JOptionPane.showMessageDialog(null, "Gañache");
   }else{
       JOptionPane.showMessageDialog(null,"Saiu o numero"+numeroAleatorio);
       JOptionPane.showMessageDialog(null,"Intentao de novo");
   }
     }
}
