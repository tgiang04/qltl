package qlgv.view;

import qlgv.controller.MonHocController;

/**
 *
 * @author ASUS
 */
public class MonHocJPanel extends javax.swing.JPanel {

    public MonHocJPanel() {
        initComponents();
        
        MonHocController controllerMH = new MonHocController(jpnViewMH, btnAddMH, jtfSearchMH);
        controllerMH.setDateToTableMH();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRootMH = new javax.swing.JPanel();
        btnAddMH = new javax.swing.JButton();
        jtfSearchMH = new javax.swing.JTextField();
        jpnViewMH = new javax.swing.JPanel();

        jpnRootMH.setBackground(new java.awt.Color(240, 240, 240));

        btnAddMH.setBackground(new java.awt.Color(76, 175, 80));
        btnAddMH.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddMH.setText("+Thêm mới");
        btnAddMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMHActionPerformed(evt);
            }
        });

        jtfSearchMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnViewMHLayout = new javax.swing.GroupLayout(jpnViewMH);
        jpnViewMH.setLayout(jpnViewMHLayout);
        jpnViewMHLayout.setHorizontalGroup(
            jpnViewMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewMHLayout.setVerticalGroup(
            jpnViewMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootMHLayout = new javax.swing.GroupLayout(jpnRootMH);
        jpnRootMH.setLayout(jpnRootMHLayout);
        jpnRootMHLayout.setHorizontalGroup(
            jpnRootMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootMHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfSearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                .addComponent(btnAddMH, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addComponent(jpnViewMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnRootMHLayout.setVerticalGroup(
            jpnRootMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootMHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnViewMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRootMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRootMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSearchMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchMHActionPerformed

    private void btnAddMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMH;
    private javax.swing.JPanel jpnRootMH;
    private javax.swing.JPanel jpnViewMH;
    private javax.swing.JTextField jtfSearchMH;
    // End of variables declaration//GEN-END:variables
}
