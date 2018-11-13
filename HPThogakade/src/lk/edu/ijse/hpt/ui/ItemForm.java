/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.ui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.edu.ijse.hpt.controller.ItemController;
import lk.edu.ijse.hpt.controllerImpl.ItemControllerImpl;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.service.ItemService;
import lk.edu.ijse.hpt.serviceImpl.ItemServiceImpl;

/**
 *
 * @author Thilini Hansika
 */
public class ItemForm extends javax.swing.JFrame {

    /**
     * Creates new form ItemForm
     */
    public ItemForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQtyOnHand = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        btnSAve2 = new javax.swing.JButton();
        btnSAve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Add Item");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Qty On Hand");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Description");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));
        jPanel1.add(txtQtyOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 30));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, 30));
        jPanel1.add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 180, 30));

        btnSAve2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSAve2.setText("Back");
        btnSAve2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSAve2MouseClicked(evt);
            }
        });
        btnSAve2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAve2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSAve2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 100, 30));

        btnSAve.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSAve.setText("Save");
        btnSAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAve2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAve2ActionPerformed
        Main m = new Main();
        m.setVisible(true);
        m.revalidate();
        m.repaint();
        this.dispose();
    }//GEN-LAST:event_btnSAve2ActionPerformed

    private void btnSAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAveActionPerformed
       ItemController cotroller = new ItemControllerImpl();

        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setDescription(txtDes.getText());
        itemDTO.setQtyOnHand(Integer.parseInt(txtQtyOnHand.getText()));
        itemDTO.setUnitPrice(Double.parseDouble(txtPrice.getText()));

        try {
            boolean isAdded = cotroller.addItem(itemDTO);
            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Added");
            } else {
                JOptionPane.showMessageDialog(this, "try Again");
            }
        } catch (Exception ex) {
            Logger.getLogger(ItemForm.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_btnSAveActionPerformed

    private void btnSAve2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSAve2MouseClicked
        
    }//GEN-LAST:event_btnSAve2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSAve;
    private javax.swing.JButton btnSAve2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQtyOnHand;
    // End of variables declaration//GEN-END:variables
}
