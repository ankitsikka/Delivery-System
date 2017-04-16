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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class update_loc extends javax.swing.JInternalFrame {

    /**
     * Creates new form internalframe11
     */
    public update_loc() {
        initComponents();
        
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
                String q="select* from countrytable";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ResultSet myresult=ms.executeQuery();

                if(myresult.next()){
                    jComboBox2.addItem("Choose country");
                    do{
                        jComboBox2.addItem(myresult.getString("countryname"));
                    }
                    while(myresult.next());

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
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Location");

        jLabel4.setText("Area");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Shipping Charges");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Country");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel2.setText("State");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel3.setText("City");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/si.jpg"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/system-software-update-icon.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Minimum Charges(for 0.5 KG)");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(99, 99, 99)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(171, 195, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(90, 90, 90)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
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
            {   if(jComboBox2.getSelectedIndex()>0){
                String q="select* from citytable where statename=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jComboBox3.getSelectedItem().toString());

                ResultSet myresult=ms.executeQuery();
                
                jComboBox4.removeAllItems();
                if(myresult.next()){
                    
                    
                jComboBox4.addItem("Choose city");
                    do{
                        jComboBox4.addItem(myresult.getString("cityname"));
                    }
                    while(myresult.next());

                }}

            }

            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
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
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            {   
                String q="select* from areatable where area=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                
                 ms.setString(1, jTextField4.getText());
                 ResultSet myresult=ms.executeQuery();
                 if(myresult.next())
                 {
                     jTextField5.setText(myresult.getString("shipcharges"));
                     jTextField1.setText(myresult.getString("mincharges"));
                     
                     jComboBox2.setSelectedItem(myresult.getString("countryname"));
                    if(jComboBox2.getSelectedIndex()>0){
                     String q1="select* from statetable where countryname=?";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);
                ms1.setString(1, jComboBox2.getSelectedItem().toString());

                ResultSet myresult1=ms1.executeQuery();
                jComboBox3.removeAllItems();
                if(myresult1.next()){
                    
                    jComboBox3.addItem("Choose state");
                    do{
                        jComboBox3.addItem(myresult1.getString("statename"));
                    }
                    while(myresult1.next());

                }}
                     jComboBox3.setSelectedItem(myresult.getString("statename"));
                     if(jComboBox3.getSelectedIndex()>0){
                     String q2="select* from citytable where statename=?";
                PreparedStatement ms2 =myconnection.prepareStatement(q2);
                ms2.setString(1, jComboBox3.getSelectedItem().toString());

                ResultSet myresult2=ms2.executeQuery();
                    jComboBox4.removeAllItems();
                if(myresult2.next()){
                    
                    jComboBox4.addItem("Choose city");
                    do{
                        jComboBox4.addItem(myresult2.getString("cityname"));
                    }
                    while(myresult2.next());

                }}
                     
                     
                     jComboBox4.setSelectedItem(myresult.getString("cityname"));
                     
                      JOptionPane.showMessageDialog(rootPane,"Record showed successfully ");
                     
                 }
                 
                    
                    else
                    {
                                                JOptionPane.showMessageDialog(rootPane,"No Record Found ");
                                                jComboBox2.setSelectedIndex(0);
                                                jComboBox3.removeAllItems();
                                                jComboBox4.removeAllItems();
                    
                    jTextField4.setText("");
                    jTextField5.setText("");
                     jTextField1.setText("");

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
                String q="update areatable set countryname=?,statename=?,cityname=?,shipcharges=?,mincharges=?"+"where area=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

                
                
                 ms.setString(1, jComboBox2.getSelectedItem().toString());
                ms.setString(2, jComboBox3.getSelectedItem().toString());
                ms.setString(3, jComboBox4.getSelectedItem().toString());
                ms.setString(6, jTextField4.getText());
                 ms.setString(5, jTextField1.getText());
                
                ms.setString(4, jTextField5.getText());

               

                if(ms.executeUpdate()>0)
                {

                  
                  JOptionPane.showMessageDialog(rootPane,"Record Updated successfully ");
                  
                  
                    jComboBox2.setSelectedIndex(0);
                    jComboBox3.setSelectedIndex(0);
                    jComboBox4.setSelectedIndex(0);
                    jTextField4.setText("");
                    jTextField5.setText("");
                     jTextField1.setText("");
                        
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
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
            {   if(jComboBox2.getSelectedIndex()>0){
                String q="select* from statetable where countryname=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jComboBox2.getSelectedItem().toString());

                ResultSet myresult=ms.executeQuery();
                
                    
                    jComboBox3.removeAllItems();
                if(myresult.next()){
                    
                    
                    jComboBox3.addItem("Choose state");
                    do{
                        jComboBox3.addItem(myresult.getString("statename"));
                    }
                    while(myresult.next());

                }}

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
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}