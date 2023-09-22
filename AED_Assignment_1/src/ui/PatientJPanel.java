/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.People;

/**
 *
 * @author sanatpopli
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    People people;
    public PatientJPanel(People people) {
        initComponents();
        this.people=people;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientjLabel = new javax.swing.JLabel();
        pidjLabel = new javax.swing.JLabel();
        docjLabel = new javax.swing.JLabel();
        allergyjLabel = new javax.swing.JLabel();
        wardjLabel = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        txtDOC = new javax.swing.JTextField();
        txtAllergy = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        btnSave4 = new javax.swing.JButton();
        yesBox = new javax.swing.JCheckBox();
        Nobox = new javax.swing.JCheckBox();

        patientjLabel.setText("Patient Detail");

        pidjLabel.setText("Patient ID");

        docjLabel.setText("Doctor");

        allergyjLabel.setText("Allergy");

        wardjLabel.setText("ward No");

        btnSave4.setText("Save");
        btnSave4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave4ActionPerformed(evt);
            }
        });

        yesBox.setText("y");
        yesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBoxActionPerformed(evt);
            }
        });

        Nobox.setText("N");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pidjLabel)
                                    .addComponent(docjLabel)
                                    .addComponent(allergyjLabel))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAllergy)
                                    .addComponent(txtPid)
                                    .addComponent(txtDOC, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wardjLabel)
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yesBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Nobox))
                                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave4)
                            .addComponent(patientjLabel))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientjLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pidjLabel)
                    .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docjLabel)
                    .addComponent(txtDOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesBox)
                    .addComponent(Nobox))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergyjLabel)
                    .addComponent(txtAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wardjLabel)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave4)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave4ActionPerformed
        // TODO add your handling code here:
        people.setPatientId(txtPid.getText());
        people.setDoc(txtDOC.getText());
        people.setAllergy(txtAllergy.getText());
        people.setWard(txtWard.getText());
        
        JOptionPane.showMessageDialog(this, "Good to go next");
    }//GEN-LAST:event_btnSave4ActionPerformed

    private void yesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Nobox;
    private javax.swing.JLabel allergyjLabel;
    private javax.swing.JButton btnSave4;
    private javax.swing.JLabel docjLabel;
    private javax.swing.JLabel patientjLabel;
    private javax.swing.JLabel pidjLabel;
    private javax.swing.JTextField txtAllergy;
    private javax.swing.JTextField txtDOC;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtWard;
    private javax.swing.JLabel wardjLabel;
    private javax.swing.JCheckBox yesBox;
    // End of variables declaration//GEN-END:variables
}
