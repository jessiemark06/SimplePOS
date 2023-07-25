/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ristorante;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmbar
 */
public class RistoranteMain extends JFrame {
    JTextArea receipt;
    DefaultTableModel model;
    JTable order;
    private int idCounter = 1;
    JTextField price;
    double total;
    JTextField exchange;
     JTextField amount;
    RistoranteMain(){
        
        JPanel bg = new JPanel();
        bg.setBackground(new Color(0, 153, 0));
        bg.setLayout(null); 
        
        JLabel title = new JLabel("Filipino Ristorante");
        title.setBounds(460, 30, 400, 40);
        Font titleFont = new Font("Script MT Bold", Font.BOLD, 40);
        title.setFont(titleFont);
        title.setForeground(Color.YELLOW);

        JPanel panelR = new JPanel();
        panelR.setBounds(880, 100, 300, 350);
        panelR.setBackground(new Color(255, 255, 0));
        panelR.setLayout(new BorderLayout());

        JPanel innerPanel = new JPanel(new GridBagLayout());
        innerPanel.setBackground(new Color(192,192,192));

        receipt = new JTextArea(21, 28);
        innerPanel.add(receipt);
        receipt.setEditable(false);
        panelR.add(innerPanel, BorderLayout.CENTER);
        
        JButton pay = new JButton("Pay");
        pay.setBounds(920,460,100,40);
        pay.setBackground(new Color(135, 206, 250));
        pay.addActionListener(e -> payReceipt());
        
        JButton print = new JButton("Print");
        print.setBounds(1040,460,100,40);
        print.setBackground(new Color(135, 206, 250));
        print .addActionListener(e -> fprint());
        
        String []column ={"id", "Product", "Quantity", "Total"};
        Object[][] rowData = {};
        
        
         model = new DefaultTableModel(column, 0);
         order = new JTable(model);
        
        JScrollPane sp = new JScrollPane(order);
        sp.setBounds(460,100,400,400);
        
        JButton clear = new JButton("Clear");
        clear.setBounds(465,520,100,40);
        clear.setBackground(new Color(135, 206, 250));
        clear.addActionListener(e -> clearTable());

        
        JButton delete = new JButton("Delete");
        delete.setBounds(615,520,100,40);
        delete.setBackground(new Color(135, 206, 250));
        delete.addActionListener(e -> deleteRow());
        
        JButton save = new JButton("Save");
        save.setBounds(755,520,100,40);
        save.setBackground(new Color(135, 206, 250));
        save.addActionListener(e -> save());
        
        
        JLabel f = new JLabel("FOODS ");
        f.setBounds(5,70,100,50);
        f.setFont(new Font("Arial", Font.BOLD, 18));
        f.setForeground(Color.YELLOW);
        
        
        JLabel d = new JLabel("DRINKS ");
        d.setBounds(5,240,100,50);
        d.setFont(new Font("Arial", Font.BOLD, 20));
        d.setForeground(Color.YELLOW);
        
        JLabel ds = new JLabel("DESSERTS ");
        ds.setBounds(5,420,120,50);
        ds.setFont(new Font("Arial", Font.BOLD, 17));
        ds.setForeground(Color.YELLOW);
        
        JLabel summary = new JLabel("Reciept");
        summary.setBounds(980,55,120,50);
        summary.setFont(new Font("Arial", Font.BOLD, 25));
        summary.setForeground(Color.WHITE);
        
        Border lineBorder = new LineBorder(Color.BLACK, 2);
   
        Border defaultButtonBorder = UIManager.getBorder("Button.border");
        
        // Combine the line border and the default button border
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, defaultButtonBorder);
        
            
         JButton f1 = new JButton(); 
         f1.setBorder(compoundBorder);
         f1.setBounds(80,100,100,60);
         f1.setIcon(new ImageIcon(getClass().getResource("/pictures/f1.jpg")));
        
        
         JButton f2 = new JButton();
         f2.setBorder(compoundBorder);
         f2.setBounds(200,100,100,60);
         f2.setIcon(new ImageIcon(getClass().getResource("/pictures/f2.jpg")));
        
         JButton f3 = new JButton();
         f3.setBorder(compoundBorder);
         f3.setBounds(320,100,100,60);
         f3.setIcon(new ImageIcon(getClass().getResource("/pictures/f3.jpg")));
        
         JButton f4 = new JButton();
         f4.setBorder(compoundBorder);
         f4.setBounds(80,190,100,60);
         f4.setIcon(new ImageIcon(getClass().getResource("/pictures/f4.jpg")));
        
         JButton f5 = new JButton();
         f5.setBorder(compoundBorder);
         f5.setBounds(200,190,100,60);
         f5.setIcon(new ImageIcon(getClass().getResource("/pictures/f5.jpg")));
        
         JButton f6 = new JButton();
         f6.setBorder(compoundBorder);
         f6 .setBounds(320,190,100,60);
         f6 .setIcon(new ImageIcon(getClass().getResource("/pictures/f6.jpg")));
         
         //drinks
         
         JButton dr1 = new JButton();
         dr1.setBorder(compoundBorder);
         dr1.setBounds(80,280,100,60);
         dr1.setIcon(new ImageIcon(getClass().getResource("/pictures/dr1.jpg")));
        
         JButton dr2 = new JButton();
         dr2.setBorder(compoundBorder);
         dr2.setBounds(200,280,100,60);
         dr2.setIcon(new ImageIcon(getClass().getResource("/pictures/dr2.jpg")));
        
         JButton dr3 = new JButton();
         dr3.setBorder(compoundBorder);
         dr3.setBounds(320,280,100,60);
         dr3.setIcon(new ImageIcon(getClass().getResource("/pictures/dr3.jpg")));
        
         JButton dr4 = new JButton();
         dr4.setBorder(compoundBorder);
         dr4.setBounds(80,365,100,60);
         dr4.setIcon(new ImageIcon(getClass().getResource("/pictures/dr4.jpg")));
        
         JButton dr5 = new JButton();
         dr5.setBorder(compoundBorder);
         dr5.setBounds(200,365,100,60);
         dr5.setIcon(new ImageIcon(getClass().getResource("/pictures/dr5.jpg")));
        
         JButton dr6 = new JButton();
         dr6.setBorder(compoundBorder);
         dr6.setBounds(320,365,100,60);
         dr6.setIcon(new ImageIcon(getClass().getResource("/pictures/dr6.jpg")));
         
         //drinks
         
        JButton d1 = new JButton();
         d1.setBorder(compoundBorder);
         d1.setBounds(80,460,100,60);
         d1.setIcon(new ImageIcon(getClass().getResource("/pictures/d1.jpg")));
        
         JButton d2 = new JButton();
         d2.setBorder(compoundBorder);
         d2.setBounds(200,460,100,60);
         d2.setIcon(new ImageIcon(getClass().getResource("/pictures/d2.jpg")));
        
         JButton d3 = new JButton();
         d3.setBorder(compoundBorder);
         d3.setBounds(320,460,100,60);
         d3.setIcon(new ImageIcon(getClass().getResource("/pictures/d3.jpg")));
        
         JButton d4 = new JButton();
         d4.setBorder(compoundBorder);
         d4.setBounds(80,550,100,60);
         d4.setIcon(new ImageIcon(getClass().getResource("/pictures/d4.jpg")));
        
         JButton d5 = new JButton();
         d5.setBorder(compoundBorder);
         d5.setBounds(200,550,100,60);
         d5.setIcon(new ImageIcon(getClass().getResource("/pictures/d5.jpg")));
        
         JButton d6 = new JButton();
         d6.setBorder(compoundBorder);
         d6.setBounds(320,550,100,60);
         d6.setIcon(new ImageIcon(getClass().getResource("/pictures/d6.jpg")));
         
   
         
         //JLabel
         JLabel j1 = new JLabel("F1");
         j1.setBounds(115,65,100,50);
         j1.setFont(new Font("Arial", Font.BOLD, 15));
         j1.setForeground(Color.WHITE);
         
         JLabel j2 = new JLabel("F2");
         j2.setBounds(240,65,100,50);
         j2.setFont(new Font("Arial", Font.BOLD, 15));
         j2.setForeground(Color.WHITE);
         
          JLabel j3 = new JLabel("F3");
         j3.setBounds(360,65,100,50);
         j3.setFont(new Font("Arial", Font.BOLD, 15));
         j3.setForeground(Color.WHITE);
         
         JLabel j4 = new JLabel("F4");
         j4.setBounds(115,150,100,50);
         j4.setFont(new Font("Arial", Font.BOLD, 15));
         j4.setForeground(Color.WHITE);
         
         JLabel j5 = new JLabel("F5");
         j5.setBounds(240,150,100,50);
         j5.setFont(new Font("Arial", Font.BOLD, 15));
         j5.setForeground(Color.WHITE);
         
          JLabel j6 = new JLabel("F6");
         j6.setBounds(360,150,100,50);
         j6.setFont(new Font("Arial", Font.BOLD, 15));
         j6.setForeground(Color.WHITE);
         
         //
         JLabel j7 = new JLabel("DR1");
         j7.setBounds(115,245,100,50);
         j7.setFont(new Font("Arial", Font.BOLD, 15));
         j7.setForeground(Color.WHITE);
         
         JLabel j8 = new JLabel("DR2");
         j8.setBounds(240,245,100,50);
         j8.setFont(new Font("Arial", Font.BOLD, 15));
         j8.setForeground(Color.WHITE);
         
          JLabel j9 = new JLabel("DR3");
         j9.setBounds(360,245,100,50);
         j9.setFont(new Font("Arial", Font.BOLD, 15));
         j9.setForeground(Color.WHITE);
         
         JLabel j10 = new JLabel("DR4");
         j10.setBounds(115,330,100,50);
         j10.setFont(new Font("Arial", Font.BOLD, 15));
         j10.setForeground(Color.WHITE);
         
         JLabel j11 = new JLabel("DR5");
         j11.setBounds(240,330,100,50);
         j11.setFont(new Font("Arial", Font.BOLD, 15));
         j11.setForeground(Color.WHITE);
         
          JLabel j12 = new JLabel("DR6");
         j12.setBounds(360,330,100,50);
         j12.setFont(new Font("Arial", Font.BOLD, 15));
         j12.setForeground(Color.WHITE);
         
           //
         JLabel j13 = new JLabel("D1");
         j13.setBounds(115,425,100,50);
         j13.setFont(new Font("Arial", Font.BOLD, 15));
         j13.setForeground(Color.WHITE);
         
         JLabel j14 = new JLabel("D2");
         j14.setBounds(240,425,100,50);
         j14.setFont(new Font("Arial", Font.BOLD, 15));
         j14.setForeground(Color.WHITE);
         
          JLabel j15 = new JLabel("D3");
         j15.setBounds(360,425,100,50);
         j15.setFont(new Font("Arial", Font.BOLD, 15));
         j15.setForeground(Color.WHITE);
         
         JLabel j16 = new JLabel("D4");
         j16.setBounds(115,515,100,50);
         j16.setFont(new Font("Arial", Font.BOLD, 15));
         j16.setForeground(Color.WHITE);
         
         JLabel j17 = new JLabel("D5");
         j17.setBounds(240,515,100,50);
         j17.setFont(new Font("Arial", Font.BOLD, 15));
         j17.setForeground(Color.WHITE);
         
          JLabel j18 = new JLabel("D6");
         j18.setBounds(360,515,100,50);
         j18.setFont(new Font("Arial", Font.BOLD, 15));
         j18.setForeground(Color.WHITE);
     
         
         JButton logOut = new JButton("Log Out");
         logOut.setBounds(1050,600,100,40);
         logOut.setBackground(new Color(135, 206, 250));
         logOut.addActionListener(new ActionListener() {
                    @Override
           public void actionPerformed(ActionEvent e) {
               dispose();
               new Ristorante();
           }});
         
        setLayout(new BorderLayout());
        bg.add(logOut);
        bg.add(j18);
        bg.add(j17);
        bg.add(j16);
        bg.add(j15);
        bg.add(j14);
        bg.add(j13);
        bg.add(j12);
        bg.add(j11);
        bg.add(j10);
        bg.add(j9);
        bg.add(j8);
        bg.add(j7);
        bg.add(j6);
        bg.add(j5);
        bg.add(j4);
        bg.add(j3);
        bg.add(j2);
        bg.add(j1);
        bg.add(f1);
        bg.add(f2);
        bg.add(f3);
        bg.add(f4);
        bg.add(f5);
        bg.add(f6);
        bg.add(dr1);
        bg.add(dr2);
        bg.add(dr3);
        bg.add(dr4);
        bg.add(dr5);
        bg.add(dr6);
        bg.add(d1);
        bg.add(d2);
        bg.add(d3);
        bg.add(d4);
        bg.add(d5);
        bg.add(d6);
        bg.add(f);
        bg.add(d);
        bg.add(ds);
        bg.add(sp);
        bg.add(summary);
        bg.add(clear);
         bg.add(save);
        bg.add(delete);
        bg.add(print);
        bg.add(pay);
        bg.add(title);
        add(panelR);
        
        add(bg);
        setSize(1200, 700);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.addActionListener(e -> addItemToTable("Pasta primavera",priceF1));
        f2.addActionListener(e -> addItemToTable("Italian rice with chicken",priceF2));
        f3.addActionListener(e -> addItemToTable("Italian Pan seared steak",priceF3));
        f4.addActionListener(e -> addItemToTable("Italian Top sirloin steak",priceF4));
        f5.addActionListener(e -> addItemToTable("Easter meat pie",priceF5));
        f6.addActionListener(e -> addItemToTable("Pesce Al forno con patate",priceF6));
        dr1.addActionListener(e -> addItemToTable("Vino",priceDr1));
        dr2.addActionListener(e -> addItemToTable("Che cola",priceDr2));
        dr3.addActionListener(e -> addItemToTable("Piña",priceDr3));
        dr4.addActionListener(e -> addItemToTable("Traditional Italian wine",priceDr4));
        dr5.addActionListener(e -> addItemToTable("Citron",priceDr5));
        dr6.addActionListener(e -> addItemToTable("Italian cream soda",priceDr6));
        d1.addActionListener(e -> addItemToTable("Wafflemisu cake",priceD1));
        d2.addActionListener(e -> addItemToTable("Italian Canolli",priceD2));
        d3.addActionListener(e -> addItemToTable("Italian tiramisu",priceD3));
        d4.addActionListener(e -> addItemToTable("Fresh fruit tarta",priceD4));
        d5.addActionListener(e -> addItemToTable("Italian Strawberry cake",priceD5));
        d6.addActionListener(e -> addItemToTable("Zabaglione",priceD6));
}
            double priceF1 = 150.0;
            double priceF2 = 200.0;
            double priceF3 = 180.0;
            double priceF4 = 250.0;
            double priceF5 = 100.0;
            double priceF6 = 90.0;
            
            double priceDr1 = 150;
            double priceDr2 = 50;
            double priceDr3 = 40;
            double priceDr4 = 80;
            double priceDr5 = 40;
            double priceDr6 = 60;
            
            double priceD1 = 150;
            double priceD2 = 50;
            double priceD3 = 40;
            double priceD4 = 80;
            double priceD5 = 40;
            double priceD6 = 60;
            
          private void addItemToTable(String item, double price) {
          String itemName = item.toString();
          int rowIndex = -1;

          // Find the row index of the item in the table
          for (int i = 0; i < model.getRowCount(); i++) {
              String currentItem = (String) model.getValueAt(i, 1);

              if (currentItem.equals(itemName)) {
                  rowIndex = i;
                  break;
              }
          }

          if (rowIndex != -1) {
              // Item already exists in the table, increment the quantity and update the total price
              int currentQuantity = (int) model.getValueAt(rowIndex, 2);
              double currentPrice = (double) model.getValueAt(rowIndex, 3);
              model.setValueAt(currentQuantity + 1, rowIndex, 2);
              model.setValueAt(currentPrice + price, rowIndex, 3);
              
          } else {
              // Item does not exist in the table, add a new row
              int id = model.getRowCount() + 1;
              Object[] rowData = { id, itemName, 1, price, price }; // Initialize total price with price
              model.addRow(rowData);
          }
      }
          
       private void clearTable() {
            model.setRowCount(0);
            total = 0;
            receipt.setText("");
        }
       
       private void deleteRow() {
            int selectedRow = order.getSelectedRow();

            if (selectedRow != -1) {
                model.removeRow(selectedRow);
                
            }
        }
               
       
            private void save() {
          // Clear the text area before appending new data
          receipt.setText("");

          // Calculate the total
          total = 0; // Reset total to zero before calculating

          int rowCount = order.getRowCount();
          int productColumnIndex = 1; // "Product" column is at index 
          int totalColumnIndex = 3; // "Total" column is at index 3

          receipt.setText("Product\tSubTotal\n");

          for (int i = 0; i < rowCount; i++) {
              String product = (String) order.getValueAt(i, productColumnIndex);
              double subTotal = (double) order.getValueAt(i, totalColumnIndex);
              double Product;
              total += subTotal;
              

              receipt.append(product  + "  - ₱" + subTotal + "\n");
          }

          receipt.append("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
          receipt.append("\nTotal:  ₱" + total );
      }
             
       
             String strtotal;
        
            
                public void payReceipt(){
                   JFrame pay = new JFrame();
                
                   JPanel p1 = new JPanel(null);
                   p1.setBackground(new Color(0,153,0));
                  
                   JLabel l1 = new JLabel("Amount:");
                   l1.setBounds(40,90,100,50);
                   l1.setFont(new Font("Arial", Font.BOLD, 20));
                   l1.setForeground(Color.WHITE);
                   
                   amount = new JTextField();
                   amount.setBounds(130,100,180,30);
                   
                   JLabel l2 = new JLabel("Total: ");
                   l2.setBounds(65,150,100,50);
                   l2.setFont(new Font("Arial", Font.BOLD, 20));
                   l2.setForeground(Color.WHITE);
                   
                   price = new JTextField();
                   price.setBounds(130,160,180,30);
                   price.setEditable(false);
                      
                   JLabel l3 = new JLabel("Exchange:");
                   l3.setBounds(25,252,100,50);
                   l3.setFont(new Font("Arial", Font.BOLD, 20));
                   l3.setForeground(Color.WHITE);
                   
                   exchange = new JTextField();
                   exchange.setBounds(130,260,180,30);
                   exchange.setEditable(false);
                   
                   JButton pay2 = new JButton("Pay");
                    pay2.setBounds(130, 210, 100, 30);
                    pay2.setFont(new Font("Arial", Font.BOLD, 14));
                    pay2.setForeground(Color.GREEN.darker());
                    pay2.setBackground(new Color(255, 255, 0));
                    pay2.addActionListener(new ActionListener() {
                    @Override
                    
                    
                        public void actionPerformed(ActionEvent e) {
                            try {
                                double enteredAmount = Double.parseDouble(amount.getText());
                                double change = enteredAmount - total;
                                exchange.setText(String.valueOf(change));
                            } catch (NumberFormatException ex) {
                                // Handle invalid input
                                exchange.setText("Invalid input");
                            }
                        }
                    });

    
                    
                    JButton back = new JButton("Back");
                    back.setBounds(310, 400, 100, 30);
                    back.setFont(new Font("Arial", Font.BOLD, 14));
                    back.setForeground(Color.GREEN.darker());
                    back.setBackground(new Color(255, 255, 0));
                    back.addActionListener(new ActionListener() {
                       
                        public void actionPerformed(ActionEvent e) {
                           pay.dispose();
                        }});
                    
                    p1.add(back);
                    p1.add(pay2);
                    p1.add(l3);
                    p1.add(exchange);
                    p1.add(l2);
                    p1.add(price);
                    p1.add(l1);
                    p1.add(amount);
                    pay.add(p1);
                    pay.setSize(440,500);
                    pay.setVisible(true);
                    pay.setLocationRelativeTo(null);
                    
                    strtotal = String.valueOf(total);
                    price.setText(strtotal);
                 
                    
                }
                 public void fprint(){
                     JOptionPane.showMessageDialog(this, "Print Successfully");
                      receipt.setText("");
                      model.setRowCount(0);
                 }
                 
                
                
           
    
    
       public static void main(String[]args){
        new RistoranteMain();
}
}