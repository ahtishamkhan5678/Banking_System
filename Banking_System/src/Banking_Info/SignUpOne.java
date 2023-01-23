
package Banking_Info;

import javax.swing.*;

import java.awt.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;

import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{

      // define globally JtextFields below here;
    
      long random;
      
      JTextField nameTextField,fnameTextField
                ,emailTextField,addressTextField
                ,cityTextField,stateTextField
                ,pinCodeTextField;

      JButton next;
      
      JRadioButton male,female,
                   other,married,
                   unmarried;
      
      JDateChooser dateChoose;
    
     SignUpOne() {
         
        // it is used to fix the loction of frame;
        setLayout(null);
         
        // generate the random num for application form;
        Random ran = new Random();
         
        // reducing the size the of random number; 
        random = (Math.abs(ran.nextLong() % 9000L) + 1000L);
         
        // Application No Label
         
        JLabel formNo = new JLabel("Application From No. " + random);
        formNo.setFont(new Font("Raleway",Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
         
        // personInfo label
         
        JLabel personInfo = new JLabel("Page 1 : Personal Details");
        personInfo.setFont(new Font("Raleway",Font.BOLD,22));
        personInfo.setBounds(290,80,400,30);
        add(personInfo);
         
         
        // name label
         
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
         
        // TextField of Name;
        nameTextField =new JTextField();
        nameTextField=new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(nameTextField);
         
         
        // fname label
         
        JLabel Fname = new JLabel(" Father's Name :");
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(93,190,200,30);
        add(Fname);
         
         
        // TextField of FName;
        
        fnameTextField =new JTextField();
        fnameTextField=new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(fnameTextField);
         
        
        
        // Dob label
         
        JLabel Dob = new JLabel(" Date Of Birth :");
        Dob.setFont(new Font("Raleway",Font.BOLD,20));
        Dob.setBounds(93,240,200,30);
        add(Dob);
        
        // JDateChooser ;
        
        dateChoose = new JDateChooser();
        dateChoose.setBounds(300,240,400,30);
        dateChoose.setForeground(new Color(105,105,105));
        add(dateChoose); 
         
        // gender label
         
        JLabel gender = new JLabel(" Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(93,290,200,30);
        add(gender);
         
        
        //JRadio Button;
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
  
        
        ButtonGroup gendergroup= new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
       
        
        

         
        // Email label
         
        JLabel Email = new JLabel(" Email Address :");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(93,340,200,30);
        add(Email);
         
         
        // emailTextField  of email;
           
        emailTextField =new JTextField();
        emailTextField=new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(emailTextField);
         
         
          
        // Marital label
         
        JLabel marital = new JLabel(" Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(93,390,200,30);
        add(marital);
         
        
         //JRadio Button;
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
//        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
//        
        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
//        
        ButtonGroup maritalgroup= new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
//         
        // address label
         
        JLabel address = new JLabel(" Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(93,440,200,30);
        add(address);
         
         
        // addressTextField of email;
           
        addressTextField =new JTextField();
        addressTextField=new JTextField();
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(addressTextField);
         
        // City label
         
        JLabel city = new JLabel(" City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(93,490,200,30);
        add(city);
         
        // cityTextField of city;
           
        cityTextField =new JTextField();
        cityTextField=new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cityTextField);
         
         
         
        // State label
         
        JLabel state = new JLabel(" State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(93,540,200,30);
        add(state);
         
        // stateTextField of city;
         
        stateTextField =new JTextField();
        stateTextField=new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(stateTextField);
         
          
        // Pincode label
         
        JLabel pinCode = new JLabel(" Pin Code :");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(93,590,200,30);
        add(pinCode);
         
         
         
        // pinCodeTextField of city;
         
        pinCodeTextField =new JTextField();
        pinCodeTextField=new JTextField();
        pinCodeTextField.setBounds(300,590,400,30);
        pinCodeTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinCodeTextField);
         
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font ("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);// background of layout frame;
         
        
        
        //given style to frame;
         
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
         
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        // working of button logic  here!
        
        String formno = "" + random; // long value
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String Dob  = ((JTextField)dateChoose.getDateEditor()
                      .getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
            
        }
        else if(female.isSelected()){
            gender ="Female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        
        if(married.isSelected()){
            marital = "Married";
            
        }
        else if(unmarried.isSelected()){
            marital ="Unmarried";
        }
        else if(other.isSelected()){
            marital ="Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pinCode = pinCodeTextField.getText();
        
        try {
            
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values"
                        + "('"+formno+"','"+name+"','"+fname+"',"
                        + "'"+Dob+"','"+gender+"','"+email+"',"
                        + "'"+marital+"','"+address+"','"+city+"',"
                        + "'"+pinCode+"','"+state+"')";
                
                c.st.executeUpdate(query); // dml command;
                       
                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        
    }
    
    public static void main(String[] args) {
            // creating the object of signUp class;
                
            new SignUpOne();
            
    }
    
}
