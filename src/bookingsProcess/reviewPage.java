
package bookingsProcess;

import config.bookingSession;
import config.connectdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class reviewPage extends javax.swing.JInternalFrame {

    public reviewPage() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        gd = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        ci = new javax.swing.JLabel();
        co = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ppn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        rn = new javax.swing.JLabel();
        rt = new javax.swing.JLabel();
        bc = new javax.swing.JLabel();
        select = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(510, 364));
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 364));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Receipt NO. :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Date :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Guest Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Full Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Email:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Check In :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Check Out:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nights:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Phone:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel2.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, 20));
        jPanel2.add(gd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 130, 20));
        jPanel2.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 130, 20));
        jPanel2.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 20));
        jPanel2.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, 20));
        jPanel2.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 20));
        jPanel2.add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 130, 20));
        jPanel2.add(co, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 130, 20));
        jPanel2.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, 290));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Room Number:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Room Type:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        ppn.setPreferredSize(new java.awt.Dimension(510, 364));
        jPanel3.add(ppn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 154, 90, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Price Per Night:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Bed Count:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));
        jPanel3.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 130, 20));
        jPanel3.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 100, 20));
        jPanel3.add(rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 20));
        jPanel3.add(rt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 20));
        jPanel3.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 20));

        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmed", "Cancelled", " " }));
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 290));

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

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

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    bookingSession book = bookingSession.getInstance();

fn.setText(valueOrDefault(book.getFullName()));
e.setText(valueOrDefault(book.getEmail()));
p.setText(valueOrDefault(book.getContactNumber()));
a.setText(valueOrDefault(book.getAddress()));

rn.setText(valueOrDefault(book.getRoomNumber()));
ppn.setText(valueOrDefault(book.getPricePerNight()));
rt.setText(valueOrDefault(book.getRoomType()));
bc.setText(valueOrDefault(book.getBedCount()));
d.setText(valueOrDefault(book.getDescription()));

ci.setText(valueOrDefault(book.getCheckIn()));
co.setText(valueOrDefault(book.getCheckOut()));

// ✅ Calculate number of nights and total price
String checkInStr = book.getCheckIn();
String checkOutStr = book.getCheckOut();
String priceStr = book.getPricePerNight();

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try {
    Date checkInDate = sdf.parse(checkInStr);
    Date checkOutDate = sdf.parse(checkOutStr);

    long diffMillis = checkOutDate.getTime() - checkInDate.getTime();
    long diffDays = diffMillis / (1000 * 60 * 60 * 24); // Convert to days

    if (diffDays < 0) {
        n.setText("0");
        t.setText("Invalid dates");
    } else {
        n.setText(String.valueOf(diffDays));

        // Parse price and calculate total
        double pricePerNight = Double.parseDouble(priceStr);
        double total = pricePerNight * diffDays;

        t.setText(String.format("%.2f", total)); // Format to 2 decimal places
    }

} catch (Exception ex) {
    System.out.println("Error calculating nights or price: " + ex.getMessage());
    n.setText("0");
    t.setText("Error");
}

}

// Helper method to avoid nulls
private String valueOrDefault(String value) {
    return (value != null) ? value : "";
        
    }//GEN-LAST:event_formInternalFrameActivated

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       try {
    bookingSession book = bookingSession.getInstance();

    String guestId = book.getGuestId(); // get from session
    String roomId = book.getRoomId();   // get from session
    String checkIn = ci.getText().trim();
    String checkOut = co.getText().trim();
    int nights = Integer.parseInt(n.getText().trim());
    double pricePerNight = Double.parseDouble(ppn.getText().trim());
    double totalPrice = Double.parseDouble(t.getText().trim());
    String status = select.getSelectedItem().toString();


    String sql = "INSERT INTO booking (guest_id, room_id, check_in, check_out, nights, price_per_night, total_price, status) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    connectdb con = new connectdb();
    Connection conn = con.getConnection();  // use your existing method
    PreparedStatement stmt = conn.prepareStatement(sql);

    stmt.setString(1, guestId);
    stmt.setString(2, roomId);
  stmt.setString(3, (checkIn));
stmt.setString(4, (checkOut));

    stmt.setInt(5, nights);
    stmt.setDouble(6, pricePerNight);
    stmt.setDouble(7, totalPrice);
    stmt.setString(8, status);

    int rows = stmt.executeUpdate();

    if (rows > 0) {
        JOptionPane.showMessageDialog(this, "Booking submitted successfully!");
        
         // Close the registration form (JDialog)
                JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                if (parentDialog != null) {
                    parentDialog.dispose();
                }

    } else {
        JOptionPane.showMessageDialog(this, "Booking failed to save.");
    }

    stmt.close();
    conn.close();

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    e.printStackTrace();
}



    }//GEN-LAST:event_submitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel T1;
    public javax.swing.JLabel a;
    public javax.swing.JLabel bc;
    public javax.swing.JLabel ci;
    public javax.swing.JLabel co;
    public javax.swing.JLabel d;
    public javax.swing.JLabel e;
    public javax.swing.JLabel fn;
    public javax.swing.JLabel gd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel n;
    public javax.swing.JLabel p;
    public javax.swing.JLabel ppn;
    public javax.swing.JLabel rn;
    public javax.swing.JLabel rt;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JButton submit;
    public javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables
}
