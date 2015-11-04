/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_2;

import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
 
public class NumShort {
    
public short setNumero(){
        short numero;
        return(Short.parseShort(JOptionPane.showInputDialog("Teclea primer numero")));
    }
    public short setNumero2(){
        short numero2;
        return(Short.parseShort(JOptionPane.showInputDialog("Teclea segundo numero")));
    }
    public void comprobacion(short numero,short numero2){
    
    if(numero>=numero2)
    
    JOptionPane.showMessageDialog(null,(numero-numero2));
    
    else
    JOptionPane.showMessageDialog(null,(numero+numero2));
    }
}
