
package bookingsProcess;

import config.bookingSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class BookingDate extends javax.swing.JInternalFrame {

    public BookingDate() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Proceed = new javax.swing.JButton();
        out = new javax.swing.JTextField();
        in = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(510, 364));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });
        jPanel1.add(Proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));
        jPanel1.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 240, 40));
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 40));

        jLabel1.setText("Check out ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel2.setText("Check in ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setText("yyyy-mm-dd");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

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
          String ins = in.getText().trim();
    String outs = out.getText().trim();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    sdf.setLenient(false); // Strict validation
    
    try {
        Date checkInDate = sdf.parse(ins);
        Date checkOutDate = sdf.parse(outs);
        
        if (checkInDate.after(checkOutDate)) {
            JOptionPane.showMessageDialog(this, "Check-out date must be after check-in date.");
            return;
        }
        bookingSession book = bookingSession.getInstance();
        // Store in session-like object
        book.setCheckIn(sdf.format(checkInDate));
        book.setCheckOut(sdf.format(checkOutDate));
        // Continue to next step
        JOptionPane.showMessageDialog(this, "Dates stored successfully!");
        
        JDesktopPane desktop = this.getDesktopPane();
    reviewPage books = new reviewPage();
    desktop.add(books);
    books.setVisible(true);
    
        System.out.println(""+book.getCheckIn());
        System.out.println(""+book.getCheckOut());
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid dates in YYYY-MM-DD format.");
    }
          
    }//GEN-LAST:event_ProceedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JTextField in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField out;
    // End of variables declaration//GEN-END:variables
}
