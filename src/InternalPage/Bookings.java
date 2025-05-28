
package InternalPage;

import ReceiptPrinting.IndividualPrinting;
import config.connectdb;
import floatedPage.addBookings;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Bookings extends javax.swing.JInternalFrame {

    public Bookings() {
        initComponents();
        displayData();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
  public void displayData() {
    connectdb dbc = new connectdb();
    try {
        String sql = "SELECT b.booking_id, " +
                     "g.full_name AS guest_name, " +
                     "r.room_number, r.room_type, " +
                     "b.check_in, b.check_out, " +
                     "b.total_price, b.status " +
                     "FROM booking b " +
                     "JOIN guest g ON b.guest_id = g.guest_id " +
                     "JOIN rooms r ON b.room_id = r.room_id";

        ResultSet rs = dbc.getData(sql);
        DefaultTableModel model = (DefaultTableModel) book_tbl.getModel();
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            String bookingId = rs.getString("booking_id");
            String guestName = rs.getString("guest_name");
            String roomNumber = rs.getString("room_number");
            String roomType = rs.getString("room_type");
            String checkIn = rs.getString("check_in");
            String checkOut = rs.getString("check_out");
            String totalPrice = rs.getString("total_price");
            String status = rs.getString("status");

            model.addRow(new String[]{
                bookingId,
                guestName,
                roomNumber + " - " + roomType,
                checkIn + " to " + checkOut,
                totalPrice,
                status
            });
        }
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
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
        book_tbl = new javax.swing.JTable();
        refreshPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        search_bar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        guest.setBackground(new java.awt.Color(255, 255, 255));
        guest.setPreferredSize(new java.awt.Dimension(724, 447));
        guest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_tbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        book_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Guest Name", "Room Info", "Check In/Out", "Total Price ", "Status"
            }
        ));
        book_tbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        book_tbl.setRowHeight(25);
        book_tbl.setSelectionBackground(new java.awt.Color(255, 0, 0));
        book_tbl.setShowVerticalLines(false);
        book_tbl.getTableHeader().setResizingAllowed(false);
        book_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(book_tbl);

        jScrollPane1.setViewportView(jScrollPane2);

        guest.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 570, 380));

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

        guest.add(refreshPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 100, 30));

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
        jLabel7.setText("Add Booking");
        addPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        guest.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 100, 30));

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

        jButton1.setText("print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        guest.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(guest, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseClicked
    displayData();
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
        addBookings newPanel = new addBookings();

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowIndex = book_tbl.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select an item!");
} else {
    try {
        connectdb dbc = new connectdb();
        TableModel tbl = book_tbl.getModel();
        String bookingId = tbl.getValueAt(rowIndex, 0).toString();

        String query = "SELECT b.*, " +
                       "g.full_name, g.contact_number, g.email, " +
                       "r.room_number, r.room_type, r.bed_count, r.price_per_night AS room_price " +
                       "FROM booking b " +
                       "JOIN guest g ON b.guest_id = g.guest_id " +
                       "JOIN rooms r ON b.room_id = r.room_id " +
                       "WHERE b.booking_id = '" + bookingId + "'";

        ResultSet rs = dbc.getData(query);

        if (rs.next()) {
            String status = rs.getString("status");
            if ("Pending".equalsIgnoreCase(status) || "Rejected".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(null, "Cannot print receipt for a booking with status: " + status);
                return;
            }

            JDialog dialog = new JDialog();
            IndividualPrinting pr = new IndividualPrinting();

            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Guest info
            pr.fn.setText(rs.getString("full_name"));
            pr.p.setText(rs.getString("contact_number"));
            pr.e.setText(rs.getString("email"));

            // Booking info
            pr.ci.setText(rs.getString("check_in"));
            pr.co.setText(rs.getString("check_out"));
            pr.n.setText(rs.getString("nights"));

            // Room info
            pr.rn.setText((rs.getString("room_number")));
            pr.rt.setText((rs.getString("room_type")));
            pr.bc.setText((rs.getString("bed_count"))); // renamed bed_count to bedType label
            pr.ppn.setText((rs.getString("room_price")));

            // Booking summary
            pr.t.setText(rs.getString("total_price"));
            pr.r.setText(rs.getString("booking_id"));
            pr.date.setText(currentDate.format(formatter));

            dialog.add(pr);
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setModal(true);
            dialog.setVisible(true);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
       int selectedRow = book_tbl.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) book_tbl.getModel();
                model.removeRow(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No row selected!");
        }         
    }//GEN-LAST:event_deletePanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JTable book_tbl;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel guest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel refreshPanel;
    private javax.swing.JTextField search_bar;
    // End of variables declaration//GEN-END:variables
}
