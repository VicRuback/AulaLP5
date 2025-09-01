/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;


/**
 *
 * @author u86117213573
 */
public class Util {
    public static void habilitar (JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(true);
        }
    }

    public static void desabilitar (JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(false);
        }
    }
}
