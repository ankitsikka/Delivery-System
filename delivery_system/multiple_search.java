/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class multiple_search extends javax.swing.JInternalFrame {

    /**
     * Creates new form multiple_search
     */
    public multiple_search() {
        initComponents();
         if(parentframe_admin.usertype==null){jButton6.setVisible(false);
         jButton7.setVisible(false);
        }
        
        
        jScrollPane1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Multiple Searches");
        getContentPane().setLayout(null);

        jLabel1.setText("Gender");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 23, 41, 16);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(79, 19, 55, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(179, 19, 71, 25);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/s2.jpg"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(258, 18, 95, 27);

        jLabel2.setText("Age");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(431, 23, 22, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 20, 29, 22);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/s2.jpg"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 20, 95, 27);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(758, 18, 100, 22);

        jLabel3.setText("Date of Joining");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(662, 23, 84, 16);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/s2.jpg"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(865, 18, 95, 27);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Blood Group", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(526, 93, 230, 50);

        jLabel4.setText("Blood Group");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(393, 93, 87, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/s2.jpg"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(795, 105, 95, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Phone", "Adress", "Gender", "Date Of Birth"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(63, 196, 850, 402);

        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 104, 60, 28);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(95, 107, 81, 22);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/s2.jpg"))); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(201, 105, 95, 27);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/S/software_update.png"))); // NOI18N
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(288, 158, 100, 25);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/V/d2.jpg"))); // NOI18N
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(430, 158, 100, 29);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/printer-icon - Copy.png"))); // NOI18N
        jButton8.setText("Print");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(570, 160, 100, 30);

        setBounds(0, 0, 988, 676);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
                String q="select* from boypersonal where gender=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                if(jRadioButton1.isSelected())
                 {
                     ms.setString(1, "Male");
                 }
                 else if(jRadioButton2.isSelected())
                 {
                     ms.setString(1, "Female");}
                ResultSet myresult=ms.executeQuery();
                
                DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                if(myresult.next())
                {   
                jScrollPane1.setVisible(true);
                    this.revalidate();
                    mymodel.setRowCount(0);
                    do{ 
                        
                        String empid,name,phone,address,gender,dob;
                        empid=myresult.getString("empid");
                        name=myresult.getString("name");
                        phone=myresult.getString("phone");
                        address=myresult.getString("address");
                        gender=myresult.getString("gender");
                        dob=myresult.getString("dob");
                        mymodel.addRow(new Object[]{empid,name,phone,address,gender,dob});
                    }while(myresult.next());
                }
                 else{
                     jScrollPane1.setVisible(false);
                     JOptionPane.showMessageDialog(rootPane,"No record found ");
                     
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
                String q="select* from boypersonal where age=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jTextField1.getText());
                ResultSet myresult=ms.executeQuery();
                
                DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                if(myresult.next())
                {   
                jScrollPane1.setVisible(true);
                    this.revalidate();
                    mymodel.setRowCount(0);
                    do{ 
                        
                        String empid,name,phone,address,gender,dob;
                        empid=myresult.getString("empid");
                        name=myresult.getString("name");
                        phone=myresult.getString("phone");
                        address=myresult.getString("address");
                        gender=myresult.getString("gender");
                        dob=myresult.getString("dob");
                        mymodel.addRow(new Object[]{empid,name,phone,address,gender,dob});
                    }while(myresult.next());
                }
                 else{
                     jScrollPane1.setVisible(false);
                     JOptionPane.showMessageDialog(rootPane,"No record found ");
                     
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
                String q="select* from boypersonal where bgroup=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1, jComboBox1.getSelectedItem().toString());
                ResultSet myresult=ms.executeQuery();
                
                DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                if(myresult.next())
                {   
                jScrollPane1.setVisible(true);
                    this.revalidate();
                    mymodel.setRowCount(0);
                    do{ 
                        
                        String empid,name,phone,address,gender,dob;
                        empid=myresult.getString("empid");
                        name=myresult.getString("name");
                        phone=myresult.getString("phone");
                        address=myresult.getString("address");
                        gender=myresult.getString("gender");
                        dob=myresult.getString("dob");
                        mymodel.addRow(new Object[]{empid,name,phone,address,gender,dob});
                    }while(myresult.next());
                }
                 else{
                     jScrollPane1.setVisible(false);
                     JOptionPane.showMessageDialog(rootPane,"No record found ");
                     
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
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
                String q="select* from boyprof,boypersonal where boypersonal.empid=boyprof.empid and doj=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                 SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
               
                 ms.setString(1, myformat.format(jDateChooser1.getDate()));
                ResultSet myresult=ms.executeQuery();
                DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                if(myresult.next())
                {
                     jScrollPane1.setVisible(true);
                    this.revalidate();
                    mymodel.setRowCount(0);
                    do{ 
                        
                        String empid,name,phone,address,gender,dob;
                        empid=myresult.getString("boypersonal.empid");
                        name=myresult.getString("name");
                        phone=myresult.getString("phone");
                        address=myresult.getString("address");
                        gender=myresult.getString("gender");
                        dob=myresult.getString("dob");
                        mymodel.addRow(new Object[]{empid,name,phone,address,gender,dob});
                    }while(myresult.next());
                }
                 else{
                     jScrollPane1.setVisible(false);
                     JOptionPane.showMessageDialog(rootPane,"No record found ");
                     
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
                String q="select* from boypersonal where name like ?" ;
                PreparedStatement ms =myconnection.prepareStatement(q);
                ms.setString(1,jTextField2.getText()+"%");
                ResultSet myresult=ms.executeQuery();
                
                DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                if(myresult.next())
                {   
                jScrollPane1.setVisible(true);
                    this.revalidate();
                    mymodel.setRowCount(0);
                    do{ 
                        
                        String empid,name,phone,address,gender,dob;
                        empid=myresult.getString("empid");
                        name=myresult.getString("name");
                        phone=myresult.getString("phone");
                        address=myresult.getString("address");
                        gender=myresult.getString("gender");
                        dob=myresult.getString("dob");
                        mymodel.addRow(new Object[]{empid,name,phone,address,gender,dob});
                    }while(myresult.next());
                }
                 else{
                     jScrollPane1.setVisible(false);
                     JOptionPane.showMessageDialog(rootPane,"No record found ");
                     
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        int row=jTable1.getSelectedRow();
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
                String q="update boypersonal set empid=?,phone=?,address=?,gender=?,dob=?"+"where name=?";
                PreparedStatement ms =myconnection.prepareStatement(q);
                 ms.setString(6, jTable1.getValueAt(row, 1).toString());
                 ms.setString(1, jTable1.getValueAt(row, 0).toString());
                 ms.setString(2, jTable1.getValueAt(row, 2).toString());
                 ms.setString(3, jTable1.getValueAt(row, 3).toString());
                 ms.setString(4, jTable1.getValueAt(row, 4).toString());
                 ms.setString(5, jTable1.getValueAt(row, 5).toString());

                if(ms.executeUpdate()>0)
                {
                                    JOptionPane.showMessageDialog(rootPane,"Record updated successfully ");
                            
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
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here
        
        int row=jTable1.getSelectedRow();
        int answer=JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete", "Confirm",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION)
        {
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
                String q="delete from boypersonal where empid=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

               
                ms.setString(1, jTable1.getValueAt(row, 0).toString());

                if(ms.executeUpdate()>0){
                    JOptionPane.showMessageDialog(rootPane,"Record deleted successfully ");
//                    String q1="select* from boypersonal order by name desc";
//                PreparedStatement ms1 =myconnection.prepareStatement(q1);
//                ResultSet myresult1=ms1.executeQuery();
//                
//                DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
//                if(myresult1.next())
//                {
//                    do{
//                        String empid,name,phone,address,gender,dob;
//                        empid=myresult1.getString("empid");
//                        name=myresult1.getString("name");
//                        phone=myresult1.getString("phone");
//                        address=myresult1.getString("address");
//                        gender=myresult1.getString("gender");
//                        dob=myresult1.getString("dob");
//                        mymodel.addRow(new Object[]{empid,name,phone,address,gender,dob});
//                    }while(myresult1.next());}

//                                    jScrollPane1.setVisible(false);
//                    this.revalidate();
//                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
//                    mymodel.setRowCount(0);

                                         DefaultTableModel mymodel1=(DefaultTableModel)jTable1.getModel();
                   mymodel1.removeRow(row);
                   
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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       try
        {
            MessageFormat header=new MessageFormat("List of Delivery Boy");
            MessageFormat footer=new MessageFormat("Page{0}");
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Cannot Print "+e.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
