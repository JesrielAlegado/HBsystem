/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalPage;

import config.connectdb;
import floatedPage.EditRoom;
import floatedPage.addRoom;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Rooms extends javax.swing.JInternalFrame {

    /**
     * Creates new form Rooms
     */
    public Rooms() {
        initComponents();
       displayData();
       this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
     public void displayData(){
        
        connectdb dbc = new connectdb();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM rooms");         
           DefaultTableModel model = (DefaultTableModel)room_tbl.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
    
     Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        room_tbl = new javax.swing.JTable();
        editPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        refreshPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        search_bar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        guest.setBackground(new java.awt.Color(255, 255, 255));
        guest.setPreferredSize(new java.awt.Dimension(724, 447));
        guest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        room_tbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        room_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Room Number", "Room Type", "Bed Count", "Price ", "Status"
            }
        ));
        room_tbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        room_tbl.setRowHeight(25);
        room_tbl.setSelectionBackground(new java.awt.Color(255, 0, 0));
        room_tbl.setShowVerticalLines(false);
        room_tbl.getTableHeader().setResizingAllowed(false);
        room_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(room_tbl);

        jScrollPane1.setViewportView(jScrollPane2);

        guest.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 570, 380));

        editPanel.setBackground(new java.awt.Color(51, 51, 51));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePanelMouseClicked(evt);
            }
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
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
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
        jLabel7.setText("Add Room");
        addPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        guest.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 100, 30));

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

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 20, 20));

        guest.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guest, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
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
        JDialog dialog = new JDialog(); // Create a floating window
        addRoom newPanel = new addRoom();

        dialog.add(newPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
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
//        DefaultTableModel model = (DefaultTableModel)guest_tbl.getModel();
//        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) guest_tbl.getModel());
//        guest_tbl.setRowSorter(sorter);
//        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
    }//GEN-LAST:event_search_barKeyReleased

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        int selectedRow = room_tbl.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) room_tbl.getModel();
                model.removeRow(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked
        EditRoom editPanel = new EditRoom(); // Panel for editing room details
        JDialog dialog = new JDialog();

        dialog.setTitle("Edit Room");
        dialog.add(editPanel);
        dialog.setSize(350, 450);
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_editPanelMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel guest;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel refreshPanel;
    private javax.swing.JTable room_tbl;
    private javax.swing.JTextField search_bar;
    // End of variables declaration//GEN-END:variables
}
