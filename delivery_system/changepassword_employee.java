/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class changepassword_employee extends javax.swing.JInternalFrame {

    /**
     * Creates new form changepassword
     */
    public changepassword_employee() {
        initComponents();
        jButton1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Change Password");
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 42, 173, 0);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 131, 100, 15);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/Other-Update-Metro-icon.png"))); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 265, 230, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Old Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 55, 104, 15);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(319, 51, 165, 22);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(210, 127, 150, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(378, 131, 111, 15);
        getContentPane().add(jPasswordField3);
        jPasswordField3.setBounds(494, 127, 165, 22);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/App-xmag-search-icon.png"))); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(539, 49, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/change.JPG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -34, 950, 640);

        setBounds(0, 0, 910, 594);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         Connection myconnection;
        String path="jdbc:mysql://localhost/";
        String place="deliverysystemdb";
        String username="root";
        String password="";
        try
        {
            myconnection =DriverManager.getConnection(path+place,username,password);
            try
            {   String q="select* from emplogin where username=? and password=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                 ms.setString(1,parentframe_employee.username);
                ms.setString(2,jPasswordField1.getText());
                
                ResultSet myresult=ms.executeQuery();
                
                 if(myresult.next())
                 {
                     if(myresult.getString("password").equals(jPasswordField1.getText()))
                     {
                         String q1="update emplogin set password=?"+"where username=? ";
                         PreparedStatement ms1 =myconnection.prepareStatement(q1);
                         ms1.setString(2,parentframe_employee.username);
                         ms1.setString(1,jPasswordField2.getText());
                         
                         if(jPasswordField2.getText().equals(jPasswordField3.getText()))
                         {
                          if(ms1.executeUpdate()>0)
                {

                  
                  JOptionPane.showMessageDialog(rootPane,"Password changed successfully ");
                 
                   jPasswordField1.setText("");
                   jPasswordField2.setText("");
                   jPasswordField3.setText("");
                   jButton1.setVisible(false);
                }}else{
                         JOptionPane.showMessageDialog(rootPane,"Wrong confirm password entered ");
                     }}
                     else{
                         JOptionPane.showMessageDialog(rootPane,"Wrong  password entered ");
                     }
                 }
                 else{
                         JOptionPane.showMessageDialog(rootPane,"Wrong password entered  ");
                     }
       
                
                    }

                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        Connection myconnection;
        String path="jdbc:mysql://localhost/";
        String place="deliverysystemdb";
        String username="root";
        String password="";
        try
        {
            myconnection =DriverManager.getConnection(path+place,username,password);
            try
            {   String q="select* from emplogin where username=? and password=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1,parentframe_employee.username);
                ms.setString(2,jPasswordField1.getText());

                ResultSet myresult=ms.executeQuery();

                if(myresult.next())
                {
                    if(myresult.getString("password").equals(jPasswordField1.getText()))
                    {
                        jButton1.setVisible(true);
//                        jPasswordField1.setText("");
                    }
                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane,"Wrong password entered  ");
                            jButton1.setVisible(false);
                        }

                    }

                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
                    }
                    finally
                    {
                        myconnection.close();
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
                }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}