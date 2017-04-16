/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author HP
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
       
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 58, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(57, 135, 110, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(177, 55, 123, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(177, 132, 123, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/logout-icon.png"))); // NOI18N
        jButton1.setText("Login ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(144, 202, 160, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/login.JPG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-9, -14, 540, 390);

        setSize(new java.awt.Dimension(523, 412));
        setLocationRelativeTo(null);
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
            {
                String q="select* from admintable where username=? and password=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ms.setString(1, jTextField1.getText());
                 ms.setString(2, jPasswordField1.getText());
                 
                 
                ResultSet myresult=ms.executeQuery();
                
                
                String q1="select* from emplogin where username=? and password=?";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);

                ms1.setString(1, jTextField1.getText());
                 ms1.setString(2, jPasswordField1.getText());
                ResultSet myresult1=ms1.executeQuery();
                
                
                if(myresult.next())
                {   parentframe_admin.username=jTextField1.getText();
                    parentframe_admin.usertype="admin";
                    
                   parentframe_admin obj =new parentframe_admin();
                   obj.setVisible(true);
                    
                   this.dispose();
                   
                   
                  
        

                    

                }
                
                
                  
                else if(myresult1.next())
                {   parentframe_employee.username=jTextField1.getText();
                parentframe_employee.usertype="employee";
                    parentframe_employee obj =new parentframe_employee();
                   obj.setVisible(true);
                   this.dispose();
                   
                   
                   

                    

                }
                else{
                JOptionPane.showMessageDialog(null,"Wrong username/password ");
                

            }}

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

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
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
                String q="select* from admintable where username=? and password=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ms.setString(1, jTextField1.getText());
                 ms.setString(2, jPasswordField1.getText());
                 
                 
                ResultSet myresult=ms.executeQuery();
                
                
                String q1="select* from emplogin where username=? and password=?";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);

                ms1.setString(1, jTextField1.getText());
                 ms1.setString(2, jPasswordField1.getText());
                ResultSet myresult1=ms1.executeQuery();
                
                
                if(myresult.next())
                {   parentframe_admin.username=jTextField1.getText();
                    parentframe_admin.usertype="admin";
                    
                   parentframe_admin obj =new parentframe_admin();
                   obj.setVisible(true);
                   this.dispose();

                    

                }
                
                
                  
                else if(myresult1.next())
                {   parentframe_employee.username=jTextField1.getText();
                parentframe_employee.usertype="employee";
                    parentframe_employee obj =new parentframe_employee();
                   obj.setVisible(true);
                   this.dispose();

                    

                }
                else{
                JOptionPane.showMessageDialog(null,"Wrong username/password ");
                

            }}

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
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
