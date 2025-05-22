
package InternalPage;

import config.connectdb;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Guest extends javax.swing.JInternalFrame {

    public Guest() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
        
    public void displayData(){
        
        connectdb dbc = new connectdb();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM guest");         
           DefaultTableModel model = (DefaultTableModel)guest_tbl.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4),
                   rs.getString(5)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        guest_tbl = new javax.swing.JTable();
        editPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        refreshPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        search_bar = new javax.swing.JTextField();
        add_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ea = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        guest.setBackground(new java.awt.Color(255, 255, 255));
        guest.setPreferredSize(new java.awt.Dimension(724, 447));
        guest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guest_tbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        guest_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Guest ID", "Full Name", "Contact Number", "Email", "Address"
            }
        ));
        guest_tbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        guest_tbl.setRowHeight(25);
        guest_tbl.setSelectionBackground(new java.awt.Color(255, 0, 0));
        guest_tbl.setShowVerticalLines(false);
        guest_tbl.getTableHeader().setResizingAllowed(false);
        guest_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(guest_tbl);

        jScrollPane1.setViewportView(jScrollPane2);

        guest.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 570, 240));

        editPanel.setBackground(new java.awt.Color(51, 51, 51));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPanelMouseExited(evt);
            }
        });
        editPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edit");
        editPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, -1, -1));

        guest.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 100, 30));

        refreshPanel.setBackground(new java.awt.Color(51, 51, 51));
        refreshPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshPanelMouseExited(evt);
            }
        });
        refreshPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Refresh");
        refreshPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 8, -1, -1));

        guest.add(refreshPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 100, 30));

        deletePanel.setBackground(new java.awt.Color(51, 51, 51));
        deletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletePanelMouseExited(evt);
            }
        });
        deletePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Delete");
        deletePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 8, -1, -1));

        guest.add(deletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 100, 30));

        addPanel.setBackground(new java.awt.Color(51, 51, 51));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanelMouseExited(evt);
            }
        });
        addPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Guest");
        addPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        guest.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 365, 100, 30));

        search_bar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        search_bar.setForeground(new java.awt.Color(153, 153, 153));
        search_bar.setText(" search...");
        search_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_bar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_barFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_barFocusLost(evt);
            }
        });
        search_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_barActionPerformed(evt);
            }
        });
        search_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_barKeyReleased(evt);
            }
        });
        guest.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 13, 170, 25));

        add_panel.setBackground(new java.awt.Color(153, 153, 153));
        add_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Number");
        add_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, 30));

        cn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_panel.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 190, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Address");
        add_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 60, 30));

        a.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_panel.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 190, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        add_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 30));

        fn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_panel.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 190, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        add_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 30));

        ea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_panel.add(ea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 190, 30));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Guest Form");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -3, -1, 30));

        add_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        guest.add(add_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 570, 130));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 20, 20));

        guest.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(guest, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseEntered
        editPanel.setBackground(bodycolor);
    }//GEN-LAST:event_editPanelMouseEntered

    private void editPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseExited
        editPanel.setBackground(navcolor);
    }//GEN-LAST:event_editPanelMouseExited

    private void refreshPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseClicked
        
    }//GEN-LAST:event_refreshPanelMouseClicked

    private void refreshPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseEntered
        refreshPanel.setBackground(bodycolor);
    }//GEN-LAST:event_refreshPanelMouseEntered

    private void refreshPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseExited
        refreshPanel.setBackground(navcolor);
    }//GEN-LAST:event_refreshPanelMouseExited

    private void deletePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseEntered
        deletePanel.setBackground(bodycolor);
    }//GEN-LAST:event_deletePanelMouseEntered

    private void deletePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseExited
        deletePanel.setBackground(navcolor);
    }//GEN-LAST:event_deletePanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        if (fn.getText().isEmpty()
            || cn.getText().isEmpty()
            || ea.getText().isEmpty()
            || a.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Email
        String email = ea.getText();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Contact Number (Must start with 09 and be 11 digits long)
        String contactNumber = cn.getText();
        if (!contactNumber.matches("^09\\d{9}$")) {
            JOptionPane.showMessageDialog(null, "Invalid contact number! It must start with '09' and be 11 digits long.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            connectdb con = new connectdb();
            String query = "INSERT INTO guest (full_name, contact_number, email, address) VALUES (?, ?, ?, ?)";

            PreparedStatement pstmt = con.getConnection().prepareStatement(query);
            pstmt.setString(1, fn.getText());
            pstmt.setString(2, contactNumber);
            pstmt.setString(3, email);
            pstmt.setString(4, a.getText());

            int result = pstmt.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                
                fn.setText("");
                cn.setText("");
                ea.setText("");
                a.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        addPanel.setBackground(bodycolor);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
        addPanel.setBackground(navcolor);
    }//GEN-LAST:event_addPanelMouseExited

    private void search_barFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusGained
       
    }//GEN-LAST:event_search_barFocusGained

    private void search_barFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusLost

    }//GEN-LAST:event_search_barFocusLost

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_barKeyReleased
        DefaultTableModel model = (DefaultTableModel)guest_tbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) guest_tbl.getModel());
        guest_tbl.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
    }//GEN-LAST:event_search_barKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel add_panel;
    private javax.swing.JTextField cn;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTextField ea;
    private javax.swing.JPanel editPanel;
    private javax.swing.JTextField fn;
    private javax.swing.JPanel guest;
    private javax.swing.JTable guest_tbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel refreshPanel;
    private javax.swing.JTextField search_bar;
    // End of variables declaration//GEN-END:variables
}
