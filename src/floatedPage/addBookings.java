
package floatedPage;

import bookingsProcess.selectGuest;

public class addBookings extends javax.swing.JPanel {

    public addBookings() {
        initComponents();
        DefaultPage(); 
    }
    
     private void DefaultPage() {
        selectGuest dp = new selectGuest();
        desktopBookings.add(dp);
        dp.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        desktopBookings = new javax.swing.JDesktopPane();

        setPreferredSize(new java.awt.Dimension(510, 370));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout desktopBookingsLayout = new javax.swing.GroupLayout(desktopBookings);
        desktopBookings.setLayout(desktopBookingsLayout);
        desktopBookingsLayout.setHorizontalGroup(
            desktopBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        desktopBookingsLayout.setVerticalGroup(
            desktopBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel1.add(desktopBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopBookings;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
