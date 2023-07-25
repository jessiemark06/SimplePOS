/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Ristorante extends JFrame implements ActionListener{
     JFrame frame;
     JButton reg;
     JButton login;
     JTextField text; 
     JPasswordField pass1;
         
        Ristorante(){
            JPanel panel = new JPanel ();
            panel.setBackground(new Color(0,153,0));
            panel.setBounds(0, 0, 700, 400);
            panel.setLayout(null);
            
           ImageIcon image = new ImageIcon("C:\\Users\\jmbar\\Downloads\\348368937_929887774972674_2614898098720427489_n.jpg");
           Image scaledImage = image.getImage().getScaledInstance(350, 380, Image.SCALE_DEFAULT);         
           
           ImageIcon scaledIcon = new ImageIcon(scaledImage);          
           JLabel label = new JLabel(scaledIcon);
           label.setBounds(10, 15, 300, 330);
            
           
            JLabel log = new JLabel("CASHIER");
            log.setBounds(410, 30, 400, 40);
            log.setFont(new Font("Arial", Font.BOLD, 40));
            log.setForeground(Color.WHITE);
            
            JLabel st = new JLabel("Cavite Branch");
            st.setBounds(445, 70, 400, 40);
            st.setFont(new Font("Arial", Font.BOLD |Font.ITALIC, 15));
            st.setForeground(Color.WHITE);

            JLabel user = new JLabel("User ID: ");
            user.setBounds(340, 125, 100, 30);
            user.setForeground(Color.WHITE);
            user.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));

            JLabel pass = new JLabel("Password: ");
            pass.setBounds(320, 165, 100, 30);
            pass.setForeground(Color.WHITE);
            pass.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));

            text = new JTextField();
            text.setBounds(420, 125, 200, 30);
            text.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));

            pass1 = new JPasswordField();
            pass1.setBounds(420, 165, 200, 30);
            pass1.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));

            login = new JButton("LOG IN");
            login.setBounds(420, 210, 100, 30);
            login.setFont(new Font("Arial", Font.BOLD, 14));
            login.setForeground(Color.GREEN.darker());
            login.setBackground(new Color(255, 255, 0));
            login.addActionListener(this);

            reg = new JButton("ADMIN");
            reg.setBounds(550, 300, 100, 30);
            reg.setFont(new Font("Arial", Font.BOLD, 14));
            reg.setForeground(Color.GREEN.darker());
            reg.setBackground(new Color(255, 255, 0));
            reg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                String User = text.getText();
                String Pass = new String(pass1.getPassword());
               if(e.getSource()==reg){
                     if(User.equals("admin") && (Pass.equals("admin"))){
                         new Admin();
                         dispose();
               }else{
                         JOptionPane.showMessageDialog(reg, "Invalid Admin ID or Password!","Alert",JOptionPane.WARNING_MESSAGE);
                     }
               }
            }} ); 
             
            
            
            
            
            
        
                panel.add(label);
                panel.add(st);
                panel.add(login);
                panel.add(reg);
                panel.add(log);
                panel.add(user);
                panel.add(text);
                panel.add(pass);
                panel.add(pass1);
                    
            
            setContentPane(panel);
            setSize(700,400);
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
        }
         public void actionPerformed(ActionEvent e) {
             String User = text.getText();
             String Pass = new String(pass1.getPassword());
             if(e.getSource()==login){
                 if((User.equals("User1") && (Pass.equals("12345"))) || (User.equals("User2") && (Pass.equals("67891")))){
                     JOptionPane.showMessageDialog(this, "Login successfully!");
                  new RistoranteMain();
                  
                 }else{
                     JOptionPane.showMessageDialog(this, "Invalid User ID or Password!","Alert",JOptionPane.WARNING_MESSAGE);
                 }
         }
         }
    
    public static void main(String[] args) {
      new Ristorante();
    }
    
}
