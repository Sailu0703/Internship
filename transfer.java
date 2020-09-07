/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class transfer extends javax.swing.JFrame {

    /**
     * Creates new form transfer
     */
    public transfer() {
        initComponents();
    }
    public String uname;
    public transfer(String n)
    {
        initComponents();
        jLabel1.setText(n.toUpperCase());
        uname= n;
        String em,c,p;
        int cc;
   
        try{
            Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/internship","sailesh","sailesh007");
            Statement stmt1=(Statement)con1.createStatement();
            String query1="select emailid,ccredit,bank,phno from sailesh.CREDIT where name = '"+n+"' ";
            ResultSet rs1=stmt1.executeQuery(query1);
            
            while(rs1.next())
            {
                em = rs1.getString("emailid");
                cc = rs1.getInt("ccredit");
                c = rs1.getString("bank");
                p = rs1.getString("phno");
                String cc1 = Integer.toString(cc);
                jLabel3.setText("EMAIL:"+em);
                jLabel4.setText("PHONE NO:"+ p);
                jLabel5.setText("BANK:"+c);
                jLabel6.setText("Current Credit:"+cc1);
           
            }
            rs1.close();
            stmt1.close();
            con1.close();
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jTextField1.setVisible(false);
            jComboBox1.setVisible(false);
            jButton2.setVisible(false);
            
        }
            catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 17, 120, 45));

        jLabel2.setText("Details:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 90, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 124, 200, 29));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 179, 170, 26));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 223, 220, 28));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 257, 226, 34));

        jButton1.setText("TRANSFER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 297, -1, -1));

        jLabel7.setText("Recipient User*:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 358, 116, 38));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 365, 110, -1));

        jLabel8.setText("Credit(s)*: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 426, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 420, 120, -1));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 483, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryuk\\Desktop\\Hari png\\TF.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jTextField1.setVisible(true);
        jComboBox1.setVisible(true);
        jButton2.setVisible(true);
        
       
        String n1;
        try{
            Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/internship","sailesh","sailesh007");
            Statement stmt1=(Statement)con1.createStatement();
            String query1="select name from sailesh.CREDIT ";
            ResultSet rs1=stmt1.executeQuery(query1);
            
            while(rs1.next())
            {
                n1 = rs1.getString("name");
                jComboBox1.addItem(n1);

            }
            rs1.close();
            stmt1.close();
            con1.close();
        }
            catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String n= (String) jComboBox1.getSelectedItem();
        String c1=jTextField1.getText();
        try{
            int c= Integer.parseInt(c1);
            Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/internship","sailesh","sailesh007");
            Statement stmt1=(Statement)con1.createStatement();
            String query1="update sailesh.CREDIT set ccredit = ccredit + '"+c+"' where name ='"+n+"'";
            stmt1.executeUpdate(query1);
            stmt1.close();
            con1.close();
        }
            catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try{
            int c= Integer.parseInt(c1);
            Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/internship","sailesh","sailesh007");
            Statement stmt1=(Statement)con1.createStatement();
            String query1="update sailesh.CREDIT set ccredit = ccredit - '"+c+"' where name ='"+uname+"'";
            stmt1.executeUpdate(query1);
            stmt1.close();
            con1.close();
        }
            catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(this,"TRANSACTION SUCCESSFULL");
        this.dispose();
        new home().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
