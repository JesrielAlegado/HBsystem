
package bookingsProcess;

import config.bookingSession;
import config.connectdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class propertiesPage extends javax.swing.JInternalFrame {

    public propertiesPage() {
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
           DefaultTableModel model = (DefaultTableModel)roomTable.getModel();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Proceed = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();

        jPanel1.setPreferredSize(new java.awt.Dimension(510, 364));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        jPanel1.add(Proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jButton2.setText("Select");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        roomTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
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
        roomTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        roomTable.setRowHeight(25);
        roomTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        roomTable.setShowVerticalLines(false);
        roomTable.getTableHeader().setResizingAllowed(false);
        roomTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(roomTable);

        jScrollPane1.setViewportView(jScrollPane2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
       int selectedRow = roomTable.getSelectedRow();

if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Please select a property first.");
    return;
}

// Get current status safely (assuming status is in column 5)
Object statusObj = roomTable.getValueAt(selectedRow, 5);
if (statusObj == null) {
    JOptionPane.showMessageDialog(this, "Selected property status is missing.");
    return;
}

String currentStatus = statusObj.toString();

if ("Booked".equalsIgnoreCase(currentStatus)) {
    JOptionPane.showMessageDialog(this, "This property is already booked. Please choose a different one.");
    return;
}

// Get other room details safely
Object roomIdObj = roomTable.getValueAt(selectedRow, 0);
Object roomNameObj = roomTable.getValueAt(selectedRow, 1);
Object bedcountObj = roomTable.getValueAt(selectedRow, 2);
Object priceObj = roomTable.getValueAt(selectedRow, 3);

if (roomIdObj == null || roomNameObj == null || bedcountObj == null || priceObj == null) {
    JOptionPane.showMessageDialog(this, "Selected property data is incomplete.");
    return;
}

String roomId = roomIdObj.toString().trim();
String roomName = roomNameObj.toString().trim();
String bedcount = bedcountObj.toString().trim();
String price = priceObj.toString().trim();

// Get booking session instance
bookingSession booking = bookingSession.getInstance();
if (booking == null) {
    JOptionPane.showMessageDialog(this, "Booking session is not initialized.");
    return;
}

try {
    booking.setRoomId(Integer.parseInt(roomId));
    booking.setBedCount(Integer.parseInt(bedcount));
    booking.setPricePerNight(Double.parseDouble(price));
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Invalid number format for Room ID, Bed Count or Price.");
    return;
}

booking.setRoomNumber(roomName);

// Debug Output
System.out.println("=== Room Session Debug ===");
System.out.println("Room ID: " + booking.getRoomId());
System.out.println("Room Name: " + booking.getRoomNumber());
System.out.println("Bed Count: " + booking.getBedCount());
System.out.println("Price per Night: " + booking.getPricePerNight());

// Confirm dialog
int option = JOptionPane.showConfirmDialog(
    this,
    "Room \"" + roomName + "\" has been selected.\nDo you want to proceed with this room?",
    "Room Selection Confirmation",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE
);

if (option == JOptionPane.YES_OPTION) {
    // Open next page inside JDesktopPane like your guest code
//    JDesktopPane desktop = this.getDesktopPane();
//    BookingDetailsPage bookingDetails = new BookingDetailsPage(); // replace with your actual next page class
//    desktop.add(bookingDetails);
//    bookingDetails.setVisible(true);

    // Close current window if needed
    this.dispose();
} else {
    System.out.println("User cancelled proceeding to next step.");
}


    }//GEN-LAST:event_ProceedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable roomTable;
    // End of variables declaration//GEN-END:variables
}
