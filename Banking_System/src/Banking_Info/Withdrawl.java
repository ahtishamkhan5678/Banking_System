
package Banking_Info;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField t1;
    JButton b1,b2;
    JLabel l1;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        
        // image label;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 900, 900);
        add(l3);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAWL");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 15));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 20));
        
        b1 = new JButton("WITHDRAW");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(170,300,400,20);
        l3.add(l1);
        
        t1.setBounds(170,350,320,20);
        l3.add(t1);
        
        b1.setBounds(355,485,150,30);
        l3.add(b1);
        
        b2.setBounds(355,520,150,30);
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(900,900);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource() == b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }else{
                    Conn c1 = new Conn();
                    c1.st.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdraw', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" Withdraw Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
            }else if(ae.getSource() == b2){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }
}
