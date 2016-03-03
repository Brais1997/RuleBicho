/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcador;

import javax.swing.JOptionPane;

/**
 *
 * @author balva
 */
public class Marcador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inscripcion ins = new Inscripcion();
         do {
            int t = Integer.parseInt(JOptionPane.showInputDialog("Elixe opción:\n1)Inscribirse \n2)Amosar\n3)Borrar\n4)Vender Libro\n5)Consultar\n6)Sair"));
            switch (t) {
                case 1:
                     ins.engadirXogador(new Xogadores(JOptionPane.showInputDialog("Nome"), JOptionPane.showInputDialog("Apelidos"), JOptionPane.showInputDialog("Alias"), Integer.valueOf(JOptionPane.showInputDialog("Codigo do Xogador")), Integer.valueOf(JOptionPane.showInputDialog("Dorsal"))));
                    break;
                case 2:
                    ins.amosarInscritos(t);
            }

        } while(true);
    }
    
}
