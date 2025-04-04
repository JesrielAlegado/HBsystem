/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatedPage;

import config.connectdb;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Adduser extends javax.swing.JPanel {

    public Adduser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ADD USER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 60));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, 30));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, 30));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, 30));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, 30));

        jLabel2.setText("FirstName:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("LastName:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 20));

        jLabel5.setText("email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel6.setText("password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel7.setText("contaact:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        save.setText("Save User");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         String firstname = fname.getText();
            String lastname = lname.getText();
            String username = uname.getText();
            String u_email = email.getText();
            String con = contact.getText();
            String pass = password.getText();

        JComponent[] fields = {fname, lname,uname, email, contact, password};
        for(JComponent field : fields){
            field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));            
        }

            boolean Error = false;
            StringBuilder eMsg = new StringBuilder();
            
            if(firstname.isEmpty()){
                eMsg.append("- First name field cannot be empty!\n");
                fname.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(lastname.isEmpty()){
                eMsg.append("- Last name field cannot be empty!\n");
                lname.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(username.isEmpty()){
                eMsg.append("- Username field cannot be empty!\n");
                uname.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(u_email.isEmpty()){
                eMsg.append("- Username field cannot be empty!\n");
                email.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(con.isEmpty()){
                eMsg.append("- Email field cannot be empty!\n");
                contact.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(pass.isEmpty()){
                eMsg.append("- Create password field cannot be empty!\n");
                password.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
        
            if (Error) {
            JOptionPane.showMessageDialog(null, eMsg.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }  
            
            
            // Validate email format
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                
            if (!u_email.matches(emailRegex)) {
               JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
               email.setBorder(new LineBorder(Color.RED, 1));
               return;
               } 
              
                // Validate password strength
          
                pass = password.getText();
                String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

            if (!pass.matches(passwordRegex)) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:\n- One uppercase letter\n- One lowercase letter\n- One number\n- One special character (@#$%^&+=!)", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
                password.setBorder(new LineBorder(Color.RED, 1));
                return;
               } 
                // Insert into database
                connectdb cn = new connectdb();

                int result = cn.InsertData("INSERT INTO staff (first_name, last_name, username, email, contact , role, password) "
                       + "VALUES('"+fname.getText()+"',"
                               + "'"+lname.getText()+"',"
                               + "'"+uname.getText()+"',"
                               + "'"+email.getText()+"',"
                               + "'"+contact.getText()+"',"
                               + "'"+role.getSelectedItem()+"',"
                               + "'"+password.getText()+"')");
                   if (result == 1) {
                       JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                                       JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                        if (parentDialog != null) {
                            parentDialog.dispose();  // Closes the JDialog
                        }
                   } 
                   else {
                       JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                   }
    }//GEN-LAST:event_saveActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JButton save;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
