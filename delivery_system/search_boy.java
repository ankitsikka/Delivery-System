/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystem;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class search_boy extends javax.swing.JInternalFrame {

    /**
     
     */
    public search_boy() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_image = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Search Delivery Boy");

        jPanel4.setLayout(null);

        jLabel1.setText("Name");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(30, 110, 121, 44);

        jLabel2.setText("Employee_ID");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 30, 121, 44);

        jLabel3.setText("Age");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(440, 550, 121, 44);

        jLabel5.setText("Address");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(30, 330, 121, 44);

        jLabel6.setText("Father's Name");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(30, 170, 121, 44);

        jLabel7.setText("Blood Group");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(500, 320, 121, 44);

        jLabel9.setText("Date Of Birth");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 550, 121, 44);

        jLabel_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel_image);
        jLabel_image.setBounds(660, 30, 200, 150);

        jLabel4.setText("Gender");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(30, 500, 121, 44);

        jLabel8.setText("Phone No.");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 250, 121, 44);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/Button-Forward-icon.png"))); // NOI18N
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(820, 540, 180, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/search-icon.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(450, 25, 130, 50);
        jPanel4.add(jLabel25);
        jLabel25.setBounds(180, 110, 230, 40);
        jPanel4.add(jLabel27);
        jLabel27.setBounds(180, 170, 190, 40);
        jPanel4.add(jLabel28);
        jLabel28.setBounds(180, 256, 170, 30);
        jPanel4.add(jLabel29);
        jLabel29.setBounds(180, 340, 180, 140);
        jPanel4.add(jLabel30);
        jLabel30.setBounds(620, 326, 200, 30);
        jPanel4.add(jLabel31);
        jLabel31.setBounds(500, 556, 160, 30);
        jPanel4.add(jLabel32);
        jLabel32.setBounds(180, 500, 150, 40);
        jPanel4.add(jLabel33);
        jLabel33.setBounds(180, 560, 160, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel4.add(jTextField2);
        jTextField2.setBounds(180, 30, 232, 44);

        jLabel47.setText("Qualification");
        jPanel4.add(jLabel47);
        jLabel47.setBounds(500, 410, 110, 20);
        jPanel4.add(jLabel48);
        jLabel48.setBounds(650, 406, 150, 20);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/print-icon - Copy.png"))); // NOI18N
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(470, 112, 100, 33);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Personal_Details", jPanel1);

        jPanel5.setLayout(null);

        jLabel12.setText("Name of Instituition");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(700, 180, 121, 44);

        jLabel13.setText("12th Percentage");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 110, 121, 44);

        jLabel15.setText("Graduation Percentage");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(10, 190, 140, 44);

        jLabel14.setText("10th Percentage");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(10, 30, 121, 44);

        jLabel16.setText(" ");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(340, 30, 121, 44);

        jLabel17.setText("Year of passing");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(340, 110, 121, 44);

        jLabel18.setText("Year of passing");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(340, 190, 121, 44);

        jLabel19.setText("Year of passing");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(340, 30, 121, 44);

        jLabel20.setText("Name of Instituition");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(700, 30, 121, 44);

        jLabel21.setText("Name of Instituition");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(700, 110, 121, 44);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/back-icon (1).png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(210, 350, 140, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/Actions-arrow-right-double-icon.png"))); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(470, 350, 140, 50);
        jPanel5.add(jLabel26);
        jLabel26.setBounds(860, 40, 290, 40);
        jPanel5.add(jLabel34);
        jLabel34.setBounds(860, 116, 310, 40);
        jPanel5.add(jLabel35);
        jLabel35.setBounds(860, 176, 300, 40);
        jPanel5.add(jLabel36);
        jLabel36.setBounds(450, 36, 120, 40);
        jPanel5.add(jLabel37);
        jLabel37.setBounds(450, 116, 140, 40);
        jPanel5.add(jLabel38);
        jLabel38.setBounds(450, 186, 130, 40);
        jPanel5.add(jLabel39);
        jLabel39.setBounds(170, 40, 120, 30);
        jPanel5.add(jLabel40);
        jLabel40.setBounds(170, 110, 120, 30);
        jPanel5.add(jLabel41);
        jLabel41.setBounds(170, 196, 110, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Educational_Details", jPanel2);

        jLabel10.setText("Year of Experience");

        jLabel11.setText("Salary(per month)");

        jLabel22.setText("Experience");

        jLabel23.setText("Company's Name");

        jLabel24.setText("Date of Joining");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deliverysystem/images/back-icon.png"))); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Professional_Details", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            {   //String q="insert into boypersonal(empid,name,fathername,phone,address,gender,dob,age,bgroup)value(?,?,?,?,?,?,?,?,?)";
                String q="select* from boypersonal where empid=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ms.setString(1, jTextField2.getText());
                ResultSet myresult=ms.executeQuery();
                if(myresult.next())
                {   Image simg=ImageIO.read(new File(myresult.getString("photo"))).getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_DEFAULT);
                jLabel_image.setIcon(new ImageIcon(simg));
                    jLabel25.setText(myresult.getString("name"));
                     jLabel48.setText(myresult.getString("qualification"));
                    jLabel27.setText(myresult.getString("fathername"));
                    jLabel28.setText(myresult.getString("phone"));
                    jLabel29.setText(myresult.getString("address"));
                    jLabel31.setText(myresult.getString("age"));
                    if(myresult.getString("gender").equals("Male"))
                    {
                        jLabel32.setText("Male");
                    }
                    else if(myresult.getString("gender").equals("Female"))
                    {
                        jLabel32.setText("Female");
                    }
                    jLabel30.setText(myresult.getString("bgroup"));
//                    DateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd");
//                    String ff=dateFormat.format(myresult.getDate("dob"));
//                    jLabel33.setText(ff);

                        jLabel33.setText(myresult.getString("dob"));

                }

                //String q1="insert into boyeducation(empid,tenmarks,twelvemarks,gradmarks,tenyear,twelveyear,gradyear,teninst,twelveinst,gradinst)value(?,?,?,?,?,?,?,?,?,?)";
                String q1="select* from boyeducation where empid=?";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);
                ms1.setString(1, jTextField2.getText());
                ResultSet myresult1=ms1.executeQuery();
                if(myresult1.next())
                {
                    jLabel39.setText(myresult1.getString("tenmarks"));
                    jLabel40.setText(myresult1.getString("twelvemarks"));
                    jLabel41.setText(myresult1.getString("gradmarks"));
                    jLabel36.setText(myresult1.getString("tenyear"));
                    jLabel37.setText(myresult1.getString("twelveyear"));
                    jLabel38.setText(myresult1.getString("gradyear"));
                  jLabel26.setText(myresult1.getString("teninst"));
                    jLabel34.setText(myresult1.getString("twelveinst"));
                    jLabel35.setText(myresult1.getString("gradinst"));

                }

                // q2="insert into boyprof(empid,doj,salary,exp,cname,yexp)value(?,?,?,?,?,?)";
                String q2="select* from boyprof where empid=?";
                PreparedStatement ms2 =myconnection.prepareStatement(q2);
                ms2.setString(1, jTextField2.getText());
                ResultSet myresult2=ms2.executeQuery();

                if(myresult2.next())
                {
                    jLabel46.setText(myresult2.getString("doj"));
                    jLabel45.setText(myresult2.getString("salary"));
                    jLabel43.setText(myresult2.getString("cname"));
                    jLabel42.setText(myresult2.getString("yexp"));

                    if(myresult2.getString("exp").equals("Yes"))
                    {
                        jLabel44.setText("Yes");
                    }
                    else if(myresult2.getString("exp").equals("No"))
                    {
                        jLabel44.setText("No");

                    }

                    JOptionPane.showMessageDialog(rootPane,"Record showed successfully ");

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"No Record Found ");
                    jTextField2.setText("");
                    jLabel39.setText("");
                    jLabel40.setText("");
                    jLabel41.setText("");
                    jLabel36.setText("");
                    jLabel37.setText("");
                    jLabel38.setText("");
                  jLabel26.setText("");
                    jLabel34.setText("");
                    jLabel35.setText("");
                    jLabel46.setText("");
                    jLabel45.setText("");
                    jLabel43.setText("");
                    jLabel42.setText("");
                    jLabel25.setText("");
                    jLabel27.setText("");
                    jLabel28.setText("");
                    jLabel29.setText("");
                    jLabel31.setText("");
                    jLabel32.setText("");
                    jLabel30.setText("");
                    jLabel33.setText("");
                    jLabel44.setText("");
                              
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
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
          
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
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
            {   //String q="insert into boypersonal(empid,name,fathername,phone,address,gender,dob,age,bgroup)value(?,?,?,?,?,?,?,?,?)";
                String q="select* from boypersonal where empid=?";
                PreparedStatement ms =myconnection.prepareStatement(q);

                ms.setString(1, jTextField2.getText());
                ResultSet myresult=ms.executeQuery();
                if(myresult.next())
                {   Image simg=ImageIO.read(new File(myresult.getString("photo"))).getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_DEFAULT);
                jLabel_image.setIcon(new ImageIcon(simg));
                    jLabel25.setText(myresult.getString("name"));
                     jLabel48.setText(myresult.getString("qualification"));
                    jLabel27.setText(myresult.getString("fathername"));
                    jLabel28.setText(myresult.getString("phone"));
                    jLabel29.setText(myresult.getString("address"));
                    jLabel31.setText(myresult.getString("age"));
                    if(myresult.getString("gender").equals("Male"))
                    {
                        jLabel32.setText("Male");
                    }
                    else if(myresult.getString("gender").equals("Female"))
                    {
                        jLabel32.setText("Female");
                    }
                    jLabel30.setText(myresult.getString("bgroup"));
//                    DateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd");
//                    String ff=dateFormat.format(myresult.getDate("dob"));
//                    jLabel33.setText(ff);

                        jLabel33.setText(myresult.getString("dob"));

                }

                //String q1="insert into boyeducation(empid,tenmarks,twelvemarks,gradmarks,tenyear,twelveyear,gradyear,teninst,twelveinst,gradinst)value(?,?,?,?,?,?,?,?,?,?)";
                String q1="select* from boyeducation where empid=?";
                PreparedStatement ms1 =myconnection.prepareStatement(q1);
                ms1.setString(1, jTextField2.getText());
                ResultSet myresult1=ms1.executeQuery();
                if(myresult1.next())
                {
                    jLabel39.setText(myresult1.getString("tenmarks"));
                    jLabel40.setText(myresult1.getString("twelvemarks"));
                    jLabel41.setText(myresult1.getString("gradmarks"));
                    jLabel36.setText(myresult1.getString("tenyear"));
                    jLabel37.setText(myresult1.getString("twelveyear"));
                    jLabel38.setText(myresult1.getString("gradyear"));
                  jLabel26.setText(myresult1.getString("teninst"));
                    jLabel34.setText(myresult1.getString("twelveinst"));
                    jLabel35.setText(myresult1.getString("gradinst"));

                }

                // q2="insert into boyprof(empid,doj,salary,exp,cname,yexp)value(?,?,?,?,?,?)";
                String q2="select* from boyprof where empid=?";
                PreparedStatement ms2 =myconnection.prepareStatement(q2);
                ms2.setString(1, jTextField2.getText());
                ResultSet myresult2=ms2.executeQuery();

                if(myresult2.next())
                {
                    jLabel46.setText(myresult2.getString("doj"));
                    jLabel45.setText(myresult2.getString("salary"));
                    jLabel43.setText(myresult2.getString("cname"));
                    jLabel42.setText(myresult2.getString("yexp"));

                    if(myresult2.getString("exp").equals("Yes"))
                    {
                        jLabel44.setText("Yes");
                    }
                    else if(myresult2.getString("exp").equals("No"))
                    {
                        jLabel44.setText("No");

                    }

                    JOptionPane.showMessageDialog(rootPane,"Record showed successfully ");

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
        
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Print Java Component");
 
    job.setPrintable (new Printable() {    
        public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
            if (pageIndex > 0) {
                return(NO_SUCH_PAGE);
            } else {
                Graphics2D g2d = (Graphics2D)g;
                g2d.translate(pageFormat.getImageableX(), 
                pageFormat.getImageableY());
 
                jPanel1.paint(g2d);
                jPanel2.paint(g2d);
                jPanel3.paint(g2d);
 
                return(PAGE_EXISTS); 
            }
        }
    });
         
    if (job.printDialog()) {
        try {
            job.print();
        } catch (PrinterException e) {
            System.err.println(e.getMessage()); 
        }
    } 
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}