/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class emplogin extends javax.swing.JInternalFrame {

    /**
     * Creates new form emplogin
     */
    public emplogin() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Create Employee Login");
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/Plus.jpg"))); // NOI18N
        jButton1.setText("Create employee login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(96, 211, 185, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(82, 74, 80, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(82, 151, 90, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(177, 71, 123, 22);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(177, 151, 123, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/1.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-40, -70, 550, 410);

        setBounds(0, 0, 451, 338);
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
                String q="insert into emplogin(username,password)value(?,?)";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ms.setString(1, jTextField1.getText());
                ms.setString(2, jTextField2.getText());

                if(ms.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Employee login created successfully ");
                    jTextField1.setText("");
                    jTextField2.setText("");
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
