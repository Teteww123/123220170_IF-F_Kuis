/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220170_kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class halamanutama extends JFrame implements ActionListener {
    JLabel t1 = new JLabel ();
    JLabel welcome = new JLabel ("Silahkan pilih menu di bawah untuk membeli majalah");
    
    JButton b1 = new JButton ("Majalah Anak");
    JButton b2 = new JButton ("Majalah Remaja");
    JButton b3 = new JButton ("Majalah Dewasa");
    
    halamanutama(String nama){
         setVisible(true);
         setSize(480, 720);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("MENU");
         setLayout(null);
         
        t1.setText("Selamat datang, " + nama);
        add (t1);
        t1.setBounds(50, 20, 180, 20);
        add (welcome);
        welcome.setBounds(50, 40, 480, 20);
        
        add (b1);
         b1.setBounds(50, 80, 180, 20);
         b1.addActionListener(this);
         add (b2);
         b2.setBounds(50, 110, 180, 20);
         b2.addActionListener(this);
         add (b3);
         b3.setBounds(50, 140, 180, 20);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
