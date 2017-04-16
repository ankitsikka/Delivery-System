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
public class Update_order extends javax.swing.JInternalFrame {

    /**
     * Creates new form Update_order
     */
    public Update_order() {
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
                    jComboBox1.addItem("Choose country");
                    do{
                        jComboBox1.addItem(myresult.getString("countryname"));
                    }
                    while(myresult.next());

                }
                
                
                String q1="select* from categorytable";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);

                ResultSet myresult1=ms1.executeQuery();

                if(myresult1.next()){
                    jComboBox5.addItem("Choose category");
                    do{
                        jComboBox5.addItem(myresult1.getString("categoryname"));
                    }
                    while(myresult1.next());

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

        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Order");
        getContentPane().setLayout(null);

        jLabel5.setText("State");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 158, 97, 28);

        jLabel10.setText("Price");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(51, 434, 86, 31);

        jLabel6.setText("City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(381, 158, 100, 28);

        jLabel7.setText("Area");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(488, 158, 110, 28);

        jLabel12.setText("Status");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(51, 508, 86, 28);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(155, 212, 98, 26);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Status", "Pending", "Completed", "Cancelled" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(155, 505, 128, 35);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(271, 214, 96, 22);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/Starcraft-2-Editor-2-icon.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(605, 444, 144, 51);

        jLabel1.setText("Order No.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(51, 23, 97, 27);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(381, 214, 92, 22);

        jButton2.setText("Get Price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(295, 434, 90, 36);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(155, 34, 125, 22);

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(485, 214, 96, 22);

        jLabel2.setText("Order Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(51, 79, 97, 24);

        jLabel8.setText("Category");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(51, 292, 70, 29);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(149, 434, 93, 45);

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(155, 288, 107, 37);

        jLabel3.setText("Location");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(51, 209, 97, 36);

        jLabel9.setText("Ordered Goods");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(51, 362, 86, 31);

        jLabel4.setText("Country");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(155, 158, 108, 28);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(155, 360, 128, 35);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/App-xmag-search-icon.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(381, 25, 109, 41);

        jLabel13.setText("House No.");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(610, 164, 58, 16);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(610, 214, 137, 22);

        jLabel14.setText("Phone No.");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(308, 288, 112, 37);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(425, 295, 156, 22);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(155, 79, 125, 32);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(155, 129, 125, 27);

        jLabel16.setText("Customer Name");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(51, 129, 92, 26);

        jLabel17.setText("Weight(in Kg)");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(319, 363, 78, 16);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(402, 360, 196, 22);

        setBounds(0, 0, 973, 593);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
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
            {   if(jComboBox1.getSelectedIndex()>0){
                String q="select* from statetable where countryname=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jComboBox1.getSelectedItem().toString());

                ResultSet myresult=ms.executeQuery();

                jComboBox2.removeAllItems();
                if(myresult.next()){

                    jComboBox2.addItem("Choose state");
                    do{
                        jComboBox2.addItem(myresult.getString("statename"));
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
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
                String q="select* from citytable where statename=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jComboBox2.getSelectedItem().toString());

                ResultSet myresult=ms.executeQuery();

                jComboBox3.removeAllItems();
                if(myresult.next()){

                    jComboBox3.addItem("Choose city");
                    do{
                        jComboBox3.addItem(myresult.getString("cityname"));
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
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
                String q="update ordertable set countryname=?,statename=?,cityname=?,areaname=?,categoryname=?,goodsname=?,price=?,status=?,houseno=?,phone=?,cname=?,weight=?"+"where orderno=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

                
               
                 ms.setString(1, jComboBox1.getSelectedItem().toString());
                ms.setString(2, jComboBox2.getSelectedItem().toString());
                ms.setString(3, jComboBox3.getSelectedItem().toString());
                ms.setString(4, jComboBox4.getSelectedItem().toString());
                ms.setString(5, jComboBox5.getSelectedItem().toString());
                 ms.setString(6, jTextField3.getText());
                 ms.setString(7,jLabel11.getText());
                 ms.setString(8, jComboBox6.getSelectedItem().toString());
                ms.setString(13, jTextField1.getText());
                   ms.setString(9, jTextField4.getText());
                ms.setString(10, jFormattedTextField1.getText());
                ms.setString(11, jTextField5.getText());
                 ms.setString(12, jTextField6.getText());

               

                if(ms.executeUpdate()>0)
                {

                  
                  JOptionPane.showMessageDialog(rootPane,"Record Updated successfully ");
                  
                  jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jComboBox3.setSelectedIndex(0);
                    jComboBox4.setSelectedIndex(0);
                    jComboBox5.setSelectedIndex(0);
                    jComboBox6.setSelectedIndex(0);
                    jTextField1.setText("");
                    jLabel15.setText("");
                    jTextField3.setText("");
                    jTextField5.setText("");
                    jLabel11.setText("");
                    jFormattedTextField1.setText("");
                      
                    jTextField4.setText("");
                    jTextField6.setText("");
                        
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
            {   if(jComboBox3.getSelectedIndex()>0){
                String q="select* from areatable where cityname=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jComboBox3.getSelectedItem().toString());

                ResultSet myresult=ms.executeQuery();

                jComboBox4.removeAllItems();
                if(myresult.next()){

                    jComboBox4.addItem("Choose area");
                    do{
                        jComboBox4.addItem(myresult.getString("area"));
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
            {   if(jComboBox4.getSelectedIndex()>0){
                String q="select* from areatable where area=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                
                ms.setString(1, jComboBox4.getSelectedItem().toString());

                ResultSet myresult=ms.executeQuery();

                //jTextField4.setText("");
                jLabel11.setText("");
                if(myresult.next()){

                     
                        double wt=Double.parseDouble(jTextField6.getText());
                    int ch=Integer.parseInt(myresult.getString("shipcharges"));
                    int min=Integer.parseInt(myresult.getString("mincharges"));
                    if(wt<0.5)
                    {
                         jLabel11.setText(myresult.getString("mincharges"));
                    }
                    else
                    {
                        int net= (int)(((wt-0.5)*ch)+min);
                         jLabel11.setText(String.valueOf(net));
                        
                    }

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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:

        //        Connection myconnection;
        //        String path="jdbc:mysql://localhost/";
        //        String place="deliverysystemdb";
        //        String username="root";
        //        String password="";
        //        try
        //        {
            //            myconnection =DriverManager.getConnection(path+place,username,password);
            //            try
            //            {   if(jComboBox4.getSelectedIndex()>0){
                //                String q="select* from areatable where area=?";
                //                PreparedStatement ms =myconnection.prepareStatement(q);
                //              // ms.setString(2, jComboBox5.getSelectedItem().toString());
                //                ms.setString(1, jComboBox4.getSelectedItem().toString());
                //
                //                ResultSet myresult=ms.executeQuery();
                //
                //                jLabel11.setText("");
                //                if(myresult.next()){
                    //
                    //
                    //
                    //
                    //                        jLabel11.setText(myresult.getString("shipcharges"));
                    //
                    //
                    //
                    //                }}
            //
            //
            //            }
        //
        //            catch(Exception e)
        //            {
            //                //JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
            //            }
        //            finally
        //            {
            //                myconnection.close();
            //            }
        //
        //        }
        //        catch(Exception e)
        //        {
            //            JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
            //        }

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:

        //        Connection myconnection;
        //        String path="jdbc:mysql://localhost/";
        //        String place="deliverysystemdb";
        //        String username="root";
        //        String password="";
        //        try
        //        {
            //            myconnection =DriverManager.getConnection(path+place,username,password);
            //            try
            //            {   if(jComboBox4.getSelectedIndex()>0){
                //                String q="select* from areatable where area=? and categoryname=?";
                //                PreparedStatement ms =myconnection.prepareStatement(q);
                //               ms.setString(2, jComboBox5.getSelectedItem().toString());
                //                ms.setString(1, jComboBox4.getSelectedItem().toString());
                //
                //                ResultSet myresult=ms.executeQuery();
                //
                //                jLabel11.setText("");
                //                if(myresult.next()){
                    //
                    //
                    //
                    //
                    //                        jLabel11.setText(myresult.getString("shipcharges"));
                    //
                    //
                    //
                    //                }}
            //
            //
            //            }
        //
        //            catch(Exception e)
        //            {
            //                //JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
            //            }
        //            finally
        //            {
            //                myconnection.close();
            //            }
        //
        //        }
        //        catch(Exception e)
        //        {
            //            JOptionPane.showMessageDialog(rootPane,"Error in query "+e.getMessage());
            //        }

    }//GEN-LAST:event_jComboBox5ActionPerformed

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
                String q="select* from ordertable where orderno=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                
                 ms.setString(1, jTextField1.getText());
                 ResultSet myresult=ms.executeQuery();
                 if(myresult.next())
                 {
                     jLabel15.setText(myresult.getString("orderdate"));
                     jTextField3.setText(myresult.getString("goodsname"));
                     jLabel11.setText(myresult.getString("price"));
                     jComboBox5.setSelectedItem(myresult.getString("categoryname"));
                     jComboBox1.setSelectedItem(myresult.getString("countryname"));
                     jTextField5.setText(myresult.getString("cname"));
                     jTextField6.setText(myresult.getString("weight"));
                    
                     
                     if(jComboBox1.getSelectedIndex()>0){
                     String q1="select* from statetable where countryname=?";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);
                ms1.setString(1, jComboBox1.getSelectedItem().toString());

                ResultSet myresult1=ms1.executeQuery();
                jComboBox2.removeAllItems();
                if(myresult1.next()){
                    
                    jComboBox2.addItem("Choose state");
                    do{
                        jComboBox2.addItem(myresult1.getString("statename"));
                    }
                    while(myresult1.next());

                }}
                     jComboBox2.setSelectedItem(myresult.getString("statename"));
                     
                     
                     if(jComboBox2.getSelectedIndex()>0){
                     String q2="select* from citytable where statename=?";
                PreparedStatement ms2 =myconnection.prepareStatement(q2);
                ms2.setString(1, jComboBox2.getSelectedItem().toString());

                ResultSet myresult2=ms2.executeQuery();
                    jComboBox3.removeAllItems();
                if(myresult2.next()){
                    
                    jComboBox3.addItem("Choose city");
                    do{
                        jComboBox3.addItem(myresult2.getString("cityname"));
                    }
                    while(myresult2.next());

                }}
                     
                     
                     jComboBox3.setSelectedItem(myresult.getString("cityname"));
                     
                      
                     if(jComboBox3.getSelectedIndex()>0){
                     String q3="select* from areatable where cityname=?";
                PreparedStatement ms3 =myconnection.prepareStatement(q3);
                ms3.setString(1, jComboBox3.getSelectedItem().toString());

                ResultSet myresult3=ms3.executeQuery();
                    jComboBox4.removeAllItems();
                if(myresult3.next()){
                    
                    jComboBox4.addItem("Choose area");
                    do{
                        jComboBox4.addItem(myresult3.getString("area"));
                    }
                    while(myresult3.next());

                }}
                     
                     
                     jComboBox4.setSelectedItem(myresult.getString("areaname"));
                     jComboBox6.setSelectedItem(myresult.getString("status"));
                     
                     
                     
                     JOptionPane.showMessageDialog(rootPane,"Record showed successfully ");
                 }
                 
                    
                     else
                            {
                             JOptionPane.showMessageDialog(rootPane,"No Record Found ");
                              jComboBox1.setSelectedIndex(0);
                              jComboBox2.removeAllItems();
                              jComboBox3.removeAllItems();
                              jComboBox4.removeAllItems();
                    
                    jComboBox5.setSelectedIndex(0);
                    jComboBox6.setSelectedIndex(0);
                    jTextField1.setText("");
                    jLabel15.setText("");
                    jTextField3.setText("");
                    jTextField5.setText("");
                    jLabel11.setText("");
                    jFormattedTextField1.setText("");
                      
                    jTextField4.setText("");
                    jTextField6.setText("");
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

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
