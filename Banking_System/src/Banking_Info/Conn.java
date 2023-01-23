
package Banking_Info;

import java.sql.*;

public class Conn {

            Connection c;
            Statement st;
    
        public Conn(){  
           
            // Exception Handling below here!
          
            try{
                
//                Class.forName(com.mysql.cj.jdbc.Driver);// no need to register driver;
                
                // creating connection ;
                c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
                //create statement
                st = c.createStatement();
                
                
                
            }
            catch( Exception e){
                
                System.out.println(e);
                
            }
            
        }

   
    
}
