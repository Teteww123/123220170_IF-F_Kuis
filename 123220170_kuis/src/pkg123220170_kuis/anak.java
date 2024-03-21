/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220170_kuis;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class anak extends JFrame  {
    JLabel aku = new JLabel ("AKUU");
    
    anak(){
        
        setVisible(true);
         setSize(480, 720);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("MENU");
         setLayout(null);
         
        add (aku);
         aku.setBounds(50, 40, 180, 20);
    }
}
