
package deliverysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;


public class Deliverysystem {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error in theme");
        }
        
         Connection myconnection;
        String path="jdbc:mysql://localhost/";
        String place="deliverysystemdb";
        String username="root";
        String password="";
        try
        {
            myconnection =DriverManager.getConnection(path+place,username,password);
            try
            {
                String q="select* from admintable";
                PreparedStatement ms =myconnection.prepareStatement(q);

               
               ResultSet myresult=ms.executeQuery();
                if(myresult.next())
                {
                   loginpage obj=new loginpage();
                   obj.setVisible(true);
                   
                    
                   
                } 
                else
                {
                    JOptionPane.showMessageDialog(null,"Software running for first time, create admin username and password");
                    createadmin obj=new createadmin();
                    obj.setVisible(true);
                }
            } 

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error in query "+e.getMessage());
            }
            finally
            {
                myconnection.close();
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error in query "+e.getMessage());
        }

        
    }
    
    
    
    
    
    
    
    
    

















}







