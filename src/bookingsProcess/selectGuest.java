
package bookingsProcess;

import config.bookingSession;
import config.connectdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class selectGuest extends javax.swing.JInternalFrame {

    public selectGuest() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        guest_tbl = new javax.swing.JTable();
        Proceed = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(510, 364));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 300));

        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        jPanel1.add(Proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

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

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
    JDesktopPane desktop = this.getDesktopPane();
    propertiesPage properties = new propertiesPage();
    desktop.add(properties);
    properties.setVisible(true);

    }//GEN-LAST:event_ProceedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int selectedRow = guest_tbl.getSelectedRow();

if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Please select a guest.");
    return;
}

// Get guest details from table safely
Object guestIdObj = guest_tbl.getValueAt(selectedRow, 0);
Object fullNameObj = guest_tbl.getValueAt(selectedRow, 1);
Object contactNumberObj = guest_tbl.getValueAt(selectedRow, 2);
Object emailObj = guest_tbl.getValueAt(selectedRow, 3);
Object addressObj = guest_tbl.getValueAt(selectedRow, 4);

// Check if any is null before calling toString()
if (guestIdObj == null || fullNameObj == null || contactNumberObj == null || emailObj == null || addressObj == null) {
    JOptionPane.showMessageDialog(this, "Selected guest data is incomplete.");
    return;
}

String guestId = guestIdObj.toString();
String fullName = fullNameObj.toString();
String contactNumber = contactNumberObj.toString();
String email = emailObj.toString();
String address = addressObj.toString();

// Get singleton instance of BookingSession (make sure this is correctly implemented)
bookingSession booking = bookingSession.getInstance();
if (booking == null) {
    JOptionPane.showMessageDialog(this, "Booking session is not initialized.");
    return;
}

try {
    booking.setGuestId(Integer.parseInt(guestId));
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid Guest ID format.");
    return;
}
booking.setFullName(fullName);
booking.setContactNumber(contactNumber);
booking.setEmail(email);
booking.setAddress(address);

// Debug Output
System.out.println("=== Booking Session Debug ===");
System.out.println("Guest ID: " + booking.getGuestId());
System.out.println("Full Name: " + booking.getFullName());
System.out.println("Contact Number: " + booking.getContactNumber());
System.out.println("Email: " + booking.getEmail());
System.out.println("Address: " + booking.getAddress());

// Show confirmation dialog with Yes/No options
int option = JOptionPane.showConfirmDialog(
    this,
    "Guest \"" + fullName + "\" has been selected for booking.\nDo you want to proceed to room selection?",
    "Booking Confirmation",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE
);

if (option == JOptionPane.YES_OPTION) {
    // Proceed to next step: open propertiesPage or room selection page
    JDesktopPane desktop = this.getDesktopPane();
    propertiesPage properties = new propertiesPage();
    desktop.add(properties);
    properties.setVisible(true);
    
    // Close current window if needed
    this.dispose();
} else {
    System.out.println("User cancelled proceeding to next step.");
}

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JTable guest_tbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
