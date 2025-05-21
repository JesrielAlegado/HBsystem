/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatedPage;

import config.connectdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class addRoom extends javax.swing.JPanel {

    /**
     * Creates new form addRoom
     */
    public addRoom() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pp = new javax.swing.JTextField();
        rn = new javax.swing.JTextField();
        rt = new javax.swing.JTextField();
        bn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, -1, 40));

        pp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppActionPerformed(evt);
            }
        });
        add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 30));

        rn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });
        add(rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        rt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtActionPerformed(evt);
            }
        });
        add(rt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 30));

        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });
        add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 30));

        des.setColumns(20);
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 240, 190));

        jLabel1.setText("Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel2.setText("Room Number");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Room Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setText("Bed Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setText("Price");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void ppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppActionPerformed

    private void rnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnActionPerformed

    private void rtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String rnumber = rn.getText().trim();
    String rType = rt.getText().trim();
    String bNumber = bn.getText().trim();
    String price = pp.getText().trim();
    String description = des.getText().trim();
    String status = "Available";  // Default room status

    try {
        connectdb con = new connectdb();
        Connection conn = con.getConnection();

        // Prepare the SQL insert query
        String query = "INSERT INTO rooms (room_number, room_type, bed_count, price_per_night, description, availability_status) " +
                       "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);

        // Set the parameters
        pstmt.setString(1, rnumber);
        pstmt.setString(2, rType);
        pstmt.setInt(3, Integer.parseInt(bNumber));
        pstmt.setDouble(4, Double.parseDouble(price));
        pstmt.setString(5, description);
        pstmt.setString(6, status);  // "Available"

        // Execute the insert
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Room inserted successfully!");
            
            // Close the registration form (JDialog)
                                    JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                                    if (parentDialog != null) {
                                        parentDialog.dispose();  // Closes the JDialog
                                    }
        }

        // Close statement (optional: close conn if you're not using pooling)
        pstmt.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for bed count and price.");
    }
    }//GEN-LAST:event_SubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JTextField bn;
    private javax.swing.JTextArea des;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pp;
    private javax.swing.JTextField rn;
    private javax.swing.JTextField rt;
    // End of variables declaration//GEN-END:variables
}
