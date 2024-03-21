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
public class Login  extends JFrame implements ActionListener{
    JLabel username = new JLabel ("Username :");
    JLabel pass = new JLabel ("Password :");
    JTextField inputnama = new JTextField();
     JTextField inputpass = new JTextField();
     JButton login = new JButton ("Login");
     
     Login(){
         setVisible(true);
         setSize(480, 720);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("LOGIN");
         setLayout(null);
         
         add (username);
         username.setBounds(50, 20, 180, 20);
         add (pass);
         pass.setBounds(50, 40, 180, 20);
         
         add (inputnama);
         inputnama.setBounds(120, 20, 100, 20);
         add (inputpass);
         inputpass.setBounds(120, 40, 100, 20);
         
         add (login);
         login.setBounds(50, 60, 180, 20);
         login.addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String nama = inputnama.getText();
            String pass = inputpass.getText();
            if(!nama.equals("123220170") || !pass.equals("12345")){
                throw new Exception("Username atau Password Salah"); 
            }
            new halamanutama(nama);
            this.dispose();
        } catch (Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
