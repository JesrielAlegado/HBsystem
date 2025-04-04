
package hotelbook;

import config.connectdb;
import java.awt.Color;
import java.awt.PopupMenu;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class register extends javax.swing.JFrame {

    private PopupMenu nameField;
    private String userName;

   
    public register() {
        initComponents();
        System.out.println("Register instance created");
    }

     public register(String username) {
         System.out.println("Register instance created for: " + userName);
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        uname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirm_pass = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        role = new javax.swing.JComboBox<>();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        uname.setBackground(new java.awt.Color(153, 255, 255));
        uname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unameMouseEntered(evt);
            }
        });
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname);
        uname.setBounds(120, 140, 130, 30);

        email.setBackground(new java.awt.Color(153, 255, 255));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(120, 180, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 150, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 190, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 270, 70, 13);

        confirm_pass.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.add(confirm_pass);
        confirm_pass.setBounds(120, 300, 130, 30);

        password.setBackground(new java.awt.Color(153, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(120, 260, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmpassword:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 310, 100, 20);

        confirm.setBackground(new java.awt.Color(0, 153, 0));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        jPanel1.add(confirm);
        confirm.setBounds(30, 370, 90, 23);

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WELCOME !!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 0, 170, 50);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 430, 73, 23);

        role.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        role.setForeground(new java.awt.Color(0, 153, 0));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel1.add(role);
        role.setBounds(140, 370, 90, 20);

        lname.setBackground(new java.awt.Color(153, 255, 255));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname);
        lname.setBounds(120, 100, 130, 30);

        fname.setBackground(new java.awt.Color(153, 255, 255));
        fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnameMouseClicked(evt);
            }
        });
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(120, 60, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FirstName:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 70, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LastName:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 100, 60, 30);

        contact.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.add(contact);
        contact.setBounds(120, 220, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 230, 60, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backg/ww.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameMouseEntered

    }//GEN-LAST:event_unameMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new login().setVisible(true); 
    this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
            String firstname = fname.getText();
            String lastname = lname.getText();
            String username = uname.getText();
            String u_email = email.getText();
            String con = contact.getText();
            String pass = password.getText();
            String cpass = confirm_pass.getText();
        
        
        JComponent[] fields = {fname, lname,uname, email, contact, password, confirm_pass};
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
            
            if(cpass.isEmpty()){
                eMsg.append("- Confirm password field cannot be empty!\n");
                confirm_pass.setBorder(new LineBorder(Color.RED, 1));
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
               
            // Validate password match
           if (!password.getText().equals(confirm_pass.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                password.setBorder(new LineBorder(Color.RED, 1));
                confirm_pass.setBorder(new LineBorder(Color.RED, 1));
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
                       new login().setVisible(true);
                       this.dispose();
                   } 
                   else {
                       JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                   }
    }//GEN-LAST:event_confirmMouseClicked

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
    uname.setText("");
    email.setText("");
    lname.setText("");
    }//GEN-LAST:event_fnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
        float num1, num2, result;
        num1 = Float.parseFloat(uname.getText());
        num2 = Float.parseFloat(email.getText());
    }//GEN-LAST:event_emailActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
            float num1, num2, result;
        num1 = Float.parseFloat(uname.getText());
        num2 = Float.parseFloat(email.getText());
        result = num1+num2;
        
    }//GEN-LAST:event_unameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
         float num1, num2, result;
        num1 = Float.parseFloat(uname.getText());
        num2 = Float.parseFloat(email.getText());
        result = num1+num2;
    }//GEN-LAST:event_passwordActionPerformed

    private void fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameMouseClicked

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField confirm_pass;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
        
    

