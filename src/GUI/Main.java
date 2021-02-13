/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author gusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        
        frame.setResizable(true);
        //Formato Default
        frame.getContentPane().setBackground(Color.pink);
        //Formato RGB
        //frame.getContentPane().setBackground(new Color (255, 87, 51));
        //Formato HEXA
        frame.getContentPane().setBackground(new Color(0xFF5733));
    }
    
}
