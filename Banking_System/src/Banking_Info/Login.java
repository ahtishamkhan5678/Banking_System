
package Banking_Info;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;

public class Login  extends JFrame implements ActionListener{

    JButton login, signUp,clear;// globally define the button ;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        
        
        setTitle("Banking_System");
        
        setLayout(null);
        ImageIcon il= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 =il.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel label =new JLabel(i3);
        
        // to change the location of image;
        label.setBounds(70,10,100,100);
        add(label);
        
        // to write anything in frame use this
        JLabel text =new JLabel("Welcome To محمد _ Bank");
        // define font style here;
        text.setFont(new Font("Osward",Font.BOLD,38));
        // define the text location below here!
        text.setBounds(200,40,620,40);
        add(text);
        
        // label 1
        
        JLabel cardNo =new JLabel("Card_No");
        cardNo.setFont(new Font("Raleway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        // label 2 
        
        JLabel pin =new JLabel("PIN_No");
        pin.setFont(new Font("Raleway",Font.BOLD,27));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300,350,232,30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);
        add(signUp);
        
        getContentPane().setBackground(Color.white); // change the color of frame ;
        
        
        setSize(800,480);
        
        setVisible(true);
        
        setLocation(350, 200);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        // working of button logic  here!
        
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        
        
        else if(ae.getSource()==login){
            Conn conn = new Conn();
            String cardNo = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            
            String q1 = "select * from login where cardNo = '"+cardNo+"' and pin = '"+pinnumber+"'";
            
            try {
                ResultSet rs =  conn.st.executeQuery(q1);
                
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        else if(ae.getSource()==signUp){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
        
        
    }
   
    public static void main(String[] args) {
       
        new Login();
        
        
    }

   
}
