
package Banking_Info;

import javax.swing.*;

import java.awt.*;




import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{

      // define globally JtextFields below here;
    
    
      
      JTextField nameTextField,fnameTextField
                ,adharTextField
                ,panTextField;

      JButton next;
      
      JRadioButton yes,no,eyes,eno;
      
      String  formno;
      
      JComboBox religion,category,income,education,occupation;
    
      SignUpTwo(String formno) {
         this.formno = formno;
         
        // it is used to fix the loction of frame;
        setLayout(null);
         
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       

        // aditionalInfo label
         
        JLabel aditionalInfo = new JLabel("Page 2 : Additional Details");
        aditionalInfo.setFont(new Font("Raleway",Font.BOLD,22));
        aditionalInfo.setBounds(290,80,400,30);
        add(aditionalInfo);
         
         
        // Religion label
         
        JLabel Religion = new JLabel("Religion :");
        Religion.setFont(new Font("Raleway",Font.BOLD,20));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        String valReligion[] = {"Muslim","Hindu","Sikh","Christain","Other"};
        religion= new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        // TextField of Name;
        nameTextField =new JTextField();
        nameTextField=new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(nameTextField);
         
         
        // Category label
         
        
        JLabel Category = new JLabel(" Category :");
        Category.setFont(new Font("Raleway",Font.BOLD,20));
        Category.setBounds(93,190,200,30);
        add(Category);
         
         
        // TextField of valCategory;
        
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        category= new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        fnameTextField =new JTextField();
        fnameTextField=new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(fnameTextField);
         
        
        
        // Income label
         
        JLabel Income = new JLabel(" Income :");
        Income.setFont(new Font("Raleway",Font.BOLD,20));
        Income.setBounds(93,240,200,30);
        add(Income);
        
        String incomeCategory[] = {"Null"," < 1.5 Lakh"," < 2.5 Lakh"," < 5 Lakh","Upto 10 Lakh"};
        income= new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
       
         
        // Educational label
         
        JLabel educational = new JLabel(" Educational");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(93,290,200,30);
        add(educational);
   
        // Qualification label
         
        JLabel qualification = new JLabel(" Qualification :");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(93,315,200,30);
        add(qualification);
         
        String educationValues[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate ","Other"};
        education= new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
         
       
         
          
        // Occupation label
         
        JLabel Occupation = new JLabel(" Occupation :");
        Occupation.setFont(new Font("Raleway",Font.BOLD,20));
        Occupation.setBounds(93,390,200,30);
        add(Occupation);
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        occupation= new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
         
        
       
        
       
//         
        // PAN Number label
         
        JLabel panNumber = new JLabel(" PAN Number :");
        panNumber.setFont(new Font("Raleway",Font.BOLD,20));
        panNumber.setBounds(93,440,200,30);
        add(panNumber);
         
         
        
           
        panTextField =new JTextField();
        panTextField=new JTextField();
        panTextField.setBounds(300,440,400,30);
        panTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(panTextField);
         
        // Aadhar Number label
         
        JLabel aadharNumber = new JLabel(" Aadhar Number :");
        aadharNumber.setFont(new Font("Raleway",Font.BOLD,20));
        aadharNumber.setBounds(93,490,200,30);
        add(aadharNumber);
         
     
           
        adharTextField =new JTextField();
        adharTextField=new JTextField();
        adharTextField.setBounds(300,490,400,30);
        adharTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(adharTextField);
         
         
         
        // Senior Citizen label
         
        JLabel seniorCitizen = new JLabel(" Senior Citizen :");
        seniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorCitizen.setBounds(93,540,200,30);
        add(seniorCitizen);
         
        //JRadio Button;
        
        yes = new JRadioButton("Yes");
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.WHITE);
        add(yes);
//        
        no = new JRadioButton("No");
        no.setBounds(450,540,100,30);
        no.setBackground(Color.WHITE);
        add(no);
         
        ButtonGroup seniorcitizen= new ButtonGroup();
        seniorcitizen.add(yes);
        seniorcitizen.add(no);
        
//         
          
        // Pincode label
         
        JLabel pinCode = new JLabel(" Exisiting Account :");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(93,590,200,30);
        add(pinCode);
         
         
         
         //JRadio Button;
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
//        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
         
        ButtonGroup exisitingAccount= new ButtonGroup();
        exisitingAccount.add(eyes);
        exisitingAccount.add(eno);
        
         
        
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
        
//        String formno = "" + random; // long value
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome  = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(yes.isSelected()){
            seniorcitizen = "Yes";
            
        }
        else if(no.isSelected()){
            seniorcitizen ="No";
        }
        
       
        String existingaccount = null;
        
        if(eyes.isSelected()){
            existingaccount = "Yes";
            
        }
        else if(eno.isSelected()){
            existingaccount ="No";
        }
       
        
        String span =panTextField.getText();
        String sadhar = adharTextField.getText();
        
        
        try {
            
         
            
                Conn c = new Conn();
                String query = "insert into signuptwo values"
                        + "('"+formno+"','"+sreligion+"','"+scategory+"',"
                        + "'"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"',"
                        + "'"+sadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                
                c.st.executeUpdate(query); // dml command;
                
                //signup3 object ;
                   
                setVisible(false);
                new SignupThree(formno).setVisible(true);
          
            
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        
    }
    
    public static void main(String[] args) {
            // creating the object of signUp class;
                
            new SignUpTwo("");
            
    }
    
}
