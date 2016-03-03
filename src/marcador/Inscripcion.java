/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcador;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author balva
 */
public class Inscripcion {
 ArrayList<Xogadores> inscripcion =new ArrayList<Xogadores>();
    
 public void engadirXogador(Xogadores l){
    inscripcion.add(l);
 }
 public void amosarInscritos(int a){
 for(int i=0;i<inscripcion.size();i++){
     JOptionPane.showMessageDialog(null, inscripcion.get(i));
 }
 }
}