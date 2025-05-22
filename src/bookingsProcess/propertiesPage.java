
package bookingsProcess;

import config.bookingSession;
import config.connectdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
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
        
        String currentStatus = roomTable.getValueAt(selectedRow, 5).toString(); 

        if ("Booked".equalsIgnoreCase(currentStatus)) {
            JOptionPane.showMessageDialog(this, "This property is already booked. Please choose a different one.");
            return; 
        }

        String roomId = roomTable.getValueAt(selectedRow, 0).toString();
        String roomName = roomTable.getValueAt(selectedRow, 1).toString();
        String roomType = roomTable.getValueAt(selectedRow, 2).toString();
        String bedCount = roomTable.getValueAt(selectedRow, 3).toString();
        String Price = roomTable.getValueAt(selectedRow, 4).toString();
        
        bookingSession book = bookingSession.getInstance();
        book.setRoomId(roomId);
        book.setRoomNumber(roomName);
        book.setRoomType(roomType);
        book.setBedCount(bedCount);
        book.setPricePerNight(Price);
        
        roomTable.setValueAt("Booked", selectedRow, 5);

        JOptionPane.showMessageDialog(this, 
            "Room \"" + roomName + "\" has been successfully booked!", 
            "Booking Confirmed", 
            JOptionPane.INFORMATION_MESSAGE);

    JDesktopPane desktop = this.getDesktopPane();
    BookingDate books = new BookingDate();
    desktop.add(books);
    books.setVisible(true);
    
    // Close current window if needed
    this.dispose();
        // 🔍 Debug output
        System.out.println("=== Property Selection Debug ===");
        System.out.println("Selected Room ID: " + book.getRoomId());
        System.out.println("Selected Room Number: " + book.getRoomNumber());
        System.out.println("Selected Room Type: " + book.getRoomType());
        System.out.println("Selected Bed Count: " + book.getBedCount());
        System.out.println("Selected Room Price: " + book.getPricePerNight());

    }//GEN-LAST:event_ProceedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable roomTable;
    // End of variables declaration//GEN-END:variables
}
