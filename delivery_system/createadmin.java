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
public class createadmin extends javax.swing.JFrame {

    /**
     * Creates new form createadmin
     */
    public createadmin() {
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
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create admin");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/Admin-icon.png"))); // NOI18N
        jButton1.setText("Create admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 275, 210, 40);

        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(82, 74, 110, 16);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(82, 151, 120, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(223, 71, 123, 22);

        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(82, 231, 104, 16);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(223, 148, 123, 22);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(223, 231, 123, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/blue-background-152655.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -10, 600, 400);

        setSize(new java.awt.Dimension(590, 416));
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
                String q="insert into admintable(username,password)value(?,?)";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ms.setString(1, jTextField1.getText());
                ms.setString(2, jPasswordField1.getText());
                if( jPasswordField1.getText().equals( jPasswordField2.getText())){
                if(ms.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"Admin created successfully ");
                    parentframe_admin obj=new parentframe_admin();
                    obj.setVisible(true);}
            this.dispose();}
            else{
                    JOptionPane.showMessageDialog(null,"Check passwords ");
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

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

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
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
