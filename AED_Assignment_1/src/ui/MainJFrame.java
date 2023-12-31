/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Car;
import model.Hospital;
import model.People;

/**
 *
 * @author sanatpopli
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    People people;
    Car car;
    Hospital hospital;
    private PersonsJPanel personspanel;
    private PatientJPanel patientpanel;
    private VehicleJPanel vehiclepanel;
    private InsuranceJPanel insurancepanel;
    private DriverJPanel driverpanel;
    private DoctorJPanel doctorpanel;
    private AdressJPanel adresspanel;
    private DisplayJReportPanel displaypanel;
    
    public MainJFrame() {
        initComponents();
        people = new People();
        car = new Car();
        hospital = new Hospital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        ControljPanel = new javax.swing.JPanel();
        btnPerson = new javax.swing.JButton();
        btnAdress = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        btnVehicle = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnInsurance = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        WorkJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnAdress.setText("Adress");
        btnAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdressActionPerformed(evt);
            }
        });

        btnDriver.setText("Driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        btnVehicle.setText("Vehicle");
        btnVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnInsurance.setText("Insurance");
        btnInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsuranceActionPerformed(evt);
            }
        });

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        jLabel1.setText("Max Hospital");

        javax.swing.GroupLayout ControljPanelLayout = new javax.swing.GroupLayout(ControljPanel);
        ControljPanel.setLayout(ControljPanelLayout);
        ControljPanelLayout.setHorizontalGroup(
            ControljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControljPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
            .addGroup(ControljPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ControljPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdress, btnDisplay, btnDoctor, btnDriver, btnInsurance, btnPerson, btnVehicle});

        ControljPanelLayout.setVerticalGroup(
            ControljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControljPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(btnPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdress)
                .addGap(39, 39, 39)
                .addComponent(btnDriver)
                .addGap(29, 29, 29)
                .addComponent(btnVehicle)
                .addGap(27, 27, 27)
                .addComponent(btnPatient)
                .addGap(30, 30, 30)
                .addComponent(btnDoctor)
                .addGap(37, 37, 37)
                .addComponent(btnInsurance)
                .addGap(36, 36, 36)
                .addComponent(btnDisplay)
                .addGap(56, 56, 56))
        );

        jSplitPane2.setLeftComponent(ControljPanel);

        javax.swing.GroupLayout WorkJPanelLayout = new javax.swing.GroupLayout(WorkJPanel);
        WorkJPanel.setLayout(WorkJPanelLayout);
        WorkJPanelLayout.setHorizontalGroup(
            WorkJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        WorkJPanelLayout.setVerticalGroup(
            WorkJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(WorkJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdressActionPerformed
        // TODO add your handling code here:
        AdressJPanel adresspanel=new AdressJPanel(people);
        jSplitPane2.setRightComponent(adresspanel);
    }//GEN-LAST:event_btnAdressActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        DriverJPanel driverpanel=new DriverJPanel(car);
        jSplitPane2.setRightComponent(driverpanel);
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsuranceActionPerformed
        // TODO add your handling code here:
        InsuranceJPanel insurancepanel=new InsuranceJPanel(hospital);
        jSplitPane2.setRightComponent(insurancepanel);
    }//GEN-LAST:event_btnInsuranceActionPerformed

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonsJPanel personspanel=new PersonsJPanel(people);
        jSplitPane2.setRightComponent(personspanel);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleActionPerformed
        // TODO add your handling code here:
        VehicleJPanel vehiclepanel=new VehicleJPanel(car);
        jSplitPane2.setRightComponent(vehiclepanel);
    }//GEN-LAST:event_btnVehicleActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        DoctorJPanel doctorpanel=new DoctorJPanel(hospital);
        jSplitPane2.setRightComponent(doctorpanel);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
       // DisplayJPanel displaypanel=new DisplayJPanel(people);
        //jSplitPane2.setRightComponent(adresspanel);
        DisplayJReportPanel displaypanel=new DisplayJReportPanel(hospital,car,people);
        jSplitPane2.setRightComponent(displaypanel);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        PatientJPanel patientpanel=new PatientJPanel(people);
        jSplitPane2.setRightComponent(patientpanel);
    }//GEN-LAST:event_btnPatientActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControljPanel;
    private javax.swing.JPanel WorkJPanel;
    private javax.swing.JButton btnAdress;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnInsurance;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnVehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
