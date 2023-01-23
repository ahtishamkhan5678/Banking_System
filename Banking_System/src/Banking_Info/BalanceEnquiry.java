
package Banking_Info;


import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;


class BalanceEnquiry extends JFrame implements ActionListener {

    
    JButton b1;
    JLabel l1;
    String pinnumber;

    BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 900, 900);
        add(l3);

        l1 = new JLabel();
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 15));

        b1 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(170, 300, 400, 30);
        l3.add(l1);

        b1.setBounds(355, 520, 150, 30);
        l3.add(b1);
        int balance = 0;
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.st.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        l1.setText("Your Current Account Balance is Rs " + balance);

        b1.addActionListener(this);

        setSize(900, 900);
        setUndecorated(true);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
