/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ristorante;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author jmbar
 */
public class Admin extends JFrame{   
    
    
    Admin(){
     JPanel panel = new JPanel ();
     panel.setBackground(new Color(0,153,0));
     panel.setBounds(0, 0, 800, 450);  
        
      JLabel ad = new JLabel("ADMIN");
            ad .setBounds(10, 30, 300, 30);
            ad .setFont(new Font("Arial", Font.BOLD, 30));
            ad .setForeground(Color.WHITE);  
        
     JLabel label1 = new JLabel("Cashier 1: ");
            label1.setBounds(10, 70, 100, 30);
            label1.setForeground(Color.WHITE);          
            label1.setFont(new Font("Arial", Font.BOLD, 17));
            
     JLabel  user= new JLabel("UserID: User1 & Password: 12345");
            user.setBounds(100, 70, 300, 30);
            user.setForeground(Color.YELLOW);
            user.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
            
    JLabel label2 = new JLabel("Cashier 2: ");
            label2.setBounds(10, 120, 100, 30);
            label2.setForeground(Color.WHITE);
            label2.setFont(new Font("Arial", Font.BOLD, 17));
            
     JLabel  user2= new JLabel("UserID: User2 & Password: 67891");
            user2.setBounds(100, 120, 300, 30);
            user2.setForeground(Color.YELLOW);
            user2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
     
    JButton logOut = new JButton("LOG OUT");
            logOut.setBounds(400, 250, 100, 30);
            logOut.setFont(new Font("Arial", Font.BOLD, 14));
            logOut.setForeground(Color.GREEN.darker());
            logOut.setBackground(new Color(255, 255, 0));
            logOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                new Ristorante();
                dispose();
            }} ); 
            
    add(logOut);  
    add(ad);
    add(user);
    add(label1);
    add(user2);
    add(label2);
     add(panel);
    setSize(550,350);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);    }
    
    public static void main(String []args){
        new Admin();
    }
}   

