
package Banking_Info;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener{
    
    JPasswordField t1,t2;
    JButton b1,b2;                               
    JLabel l1,l2,l3;
    String pinnumber;
    Pin(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 900, 900);
        add(l4);
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setForeground(Color.WHITE);
        
        l2 = new JLabel("New PIN:");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);
        
        l3 = new JLabel("Re-Enter New PIN:");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);
        
        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 15));
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 15));
        
        b1 = new JButton("CHANGE");
        b2 = new JButton("BACK");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(null);
        
        l1.setBounds(250,280,500,35);
        l4.add(l1);
        
        l2.setBounds(165,320,180,25);
        l4.add(l2);
        
        l3.setBounds(165,360,180,25);
        l4.add(l3);
        
        t1.setBounds(330,320,180,25);
        l4.add(t1);
        
        t2.setBounds(330,360,180,25);
        l4.add(t2);
        
        b1.setBounds(355,485,150,30);
        l4.add(b1);
        
        b2.setBounds(355,520,150,30);
        l4.add(b2);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String npin = t1.getText();
            String rpin = t2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(ae.getSource()==b1){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String q3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";

                c1.st.executeUpdate(q1);
                c1.st.executeUpdate(q2);
                c1.st.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==b2){
                new Transactions(pinnumber).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Pin("").setVisible(true);
    }
}
