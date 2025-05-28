
package InternalPage;

import config.connectdb;
import floatedPage.Adduser;
import floatedPage.Edituser;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Staff extends javax.swing.JInternalFrame {

    public Staff() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    public void displayData(){
        try{
            connectdb dbc = new connectdb();          
            ResultSet rs = dbc.getData("SELECT * FROM staff");
            users_tbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        users = new javax.swing.JScrollPane();
        users_tbl = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        jPanel1.setMinimumSize(new java.awt.Dimension(540, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 447));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        users.setViewportView(users_tbl);

        jPanel1.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 360));

        addButton.setText("Add User");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, 30));

        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));

        deleteButton.setText("Delete User");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, 30));

        editButton.setText("Edit User");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        JDialog dialog = new JDialog(); // Create a floating window
        Adduser newPanel = new Adduser();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.setSize(325, 500); // Set the size of the window
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    }//GEN-LAST:event_addButtonActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
       displayData();
    }//GEN-LAST:event_RefreshActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        JDialog dialog = new JDialog(); // Create a floating window
        Edituser newPanel = new Edituser();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.setSize(325, 500); // Set the size of the window
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
                                                       
     int selectedRow = users_tbl.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) users_tbl.getModel();
                model.removeRow(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected!");
        }


    }//GEN-LAST:event_deleteButtonMouseClicked

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshMouseClicked
        displayData();
    }//GEN-LAST:event_RefreshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane users;
    private javax.swing.JTable users_tbl;
    // End of variables declaration//GEN-END:variables
}
