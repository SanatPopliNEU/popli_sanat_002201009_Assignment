/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.People;

/**
 *
 * @author sanatpopli
 */
public class PersonsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonsJPanel
     */
    People people;
    public PersonsJPanel(People people) {
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

        txtPronoun = new javax.swing.JTextField();
        pnLabel = new javax.swing.JLabel();
        headjLabel = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        lnjLabel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        emLabel = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        agLabel = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        dobjLabel = new javax.swing.JLabel();
        txtDoa = new javax.swing.JTextField();
        doajLabel = new javax.swing.JLabel();
        txtIssue = new javax.swing.JTextField();
        isjLabel = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        btnSave6 = new javax.swing.JButton();
        sxjLabel = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        FnjLabel = new javax.swing.JLabel();
        ssnjLabel = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        imagejLabel = new javax.swing.JLabel();
        browseimagejButton = new javax.swing.JButton();

        pnLabel.setText("PRONOUN");

        headjLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        headjLabel.setText("Enter Details");

        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        lnjLabel.setText("L-NAME");

        emLabel.setText("EMAIL");

        agLabel.setText("AGE");

        dobjLabel.setText("DOB");

        doajLabel.setText("DOA");

        isjLabel.setText("ISSUE");

        btnSave6.setText("Save");
        btnSave6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave6ActionPerformed(evt);
            }
        });

        sxjLabel.setText("SEX");

        FnjLabel.setText("F-NAME");

        ssnjLabel.setText("SSN");

        imagejLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        imagejLabel.setText("Insert Image");

        browseimagejButton.setText("Browse");
        browseimagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseimagejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(headjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(442, Short.MAX_VALUE)
                        .addComponent(browseimagejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnjLabel)
                            .addComponent(emLabel)
                            .addComponent(agLabel)
                            .addComponent(dobjLabel)
                            .addComponent(doajLabel)
                            .addComponent(isjLabel)
                            .addComponent(FnjLabel))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDoa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDob, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssnjLabel)
                            .addComponent(pnLabel)
                            .addComponent(sxjLabel))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSex, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPronoun, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(btnSave6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(imagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(browseimagejButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FnjLabel)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnjLabel)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emLabel)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agLabel)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doajLabel)
                    .addComponent(txtDoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isjLabel)
                    .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sxjLabel)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssnjLabel)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnLabel)
                    .addComponent(txtPronoun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave6))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void btnSave6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave6ActionPerformed
        // TODO add your handling code here:
        people.setFname(txtFname.getText());
        people.setLname(txtLname.getText());
        people.setEmail(txtEmail.getText());
        people.setAge(txtAge.getText());
        people.setDob(txtDob.getText());
        people.setDoa(txtDoa.getText());
        people.setIssue(txtIssue.getText());
        people.setSex(txtSex.getText());
        people.setSsn(txtSSN.getText());
        people.setPronoun(txtPronoun.getText());

        JOptionPane.showMessageDialog(this, "Good to go next");
    }//GEN-LAST:event_btnSave6ActionPerformed

    private void browseimagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseimagejButtonActionPerformed
        // TODO add your handling code here:
        
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef =new FileNameExtensionFilter("Images","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue==JFileChooser.APPROVE_OPTION){
         File selectedImageFile=   browseImageFile.getSelectedFile();
         String selectedImagePath=selectedImageFile.getAbsolutePath();
         JOptionPane.showMessageDialog(null, selectedImagePath);
         //display image on jlabel
         
        ImageIcon II=new ImageIcon(selectedImagePath);
        Image image=II.getImage().getScaledInstance(imagejLabel.getWidth(), imagejLabel.getHeight(), Image.SCALE_SMOOTH);
        
        imagejLabel.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_browseimagejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FnjLabel;
    private javax.swing.JLabel agLabel;
    private javax.swing.JButton browseimagejButton;
    private javax.swing.JButton btnSave6;
    private javax.swing.JLabel doajLabel;
    private javax.swing.JLabel dobjLabel;
    private javax.swing.JLabel emLabel;
    private javax.swing.JLabel headjLabel;
    private javax.swing.JLabel imagejLabel;
    private javax.swing.JLabel isjLabel;
    private javax.swing.JLabel lnjLabel;
    private javax.swing.JLabel pnLabel;
    private javax.swing.JLabel ssnjLabel;
    private javax.swing.JLabel sxjLabel;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDoa;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtIssue;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPronoun;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtSex;
    // End of variables declaration//GEN-END:variables
}