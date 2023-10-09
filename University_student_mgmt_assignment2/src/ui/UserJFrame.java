/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.*;
/**
 *
 * @author Sanat Popli
 */
public class UserJFrame extends javax.swing.JFrame {

    User user;
    UserList userList;
    /**
     * Creates new form UserJFrame
     */
    public UserJFrame() {
        initComponents();
        btnCreateUser.setVisible(false);
        btnSearch.setVisible(false);
        btnViewUsers.setVisible(false);
        btnSearch.setVisible(false);
        btnManage.setVisible(false);
        userList= new UserList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workjpanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnViewUsers = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnCreateUser = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        headinglabel = new javax.swing.JLabel();
        actionjpanel = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerSize(4);

        workjpanel.setBackground(new java.awt.Color(255, 255, 204));

        btnLogin.setText("Log In");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnViewUsers.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnViewUsers.setText("View Users");
        btnViewUsers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUsersActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnSearch.setText("Search User");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCreateUser.setText("Create User");
        btnCreateUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnManage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnManage.setText("Manage User");
        btnManage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        headinglabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        headinglabel.setText("NEU");

        javax.swing.GroupLayout workjpanelLayout = new javax.swing.GroupLayout(workjpanel);
        workjpanel.setLayout(workjpanelLayout);
        workjpanelLayout.setHorizontalGroup(
            workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workjpanelLayout.createSequentialGroup()
                .addGroup(workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workjpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(workjpanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(headinglabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        workjpanelLayout.setVerticalGroup(
            workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workjpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(headinglabel)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnCreateUser)
                .addGap(61, 61, 61)
                .addComponent(btnViewUsers)
                .addGap(45, 45, 45)
                .addComponent(btnSearch)
                .addGap(41, 41, 41)
                .addComponent(btnManage)
                .addGap(28, 28, 28))
        );

        jSplitPane1.setLeftComponent(workjpanel);

        actionjpanel.setBackground(new java.awt.Color(255, 204, 204));

        heading.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        heading.setText("Welcome to the world of Huskies");

        javax.swing.GroupLayout actionjpanelLayout = new javax.swing.GroupLayout(actionjpanel);
        actionjpanel.setLayout(actionjpanelLayout);
        actionjpanelLayout.setHorizontalGroup(
            actionjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionjpanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(heading)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        actionjpanelLayout.setVerticalGroup(
            actionjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionjpanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(heading)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(actionjpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        btnCreateUser.setVisible(false);
        btnSearch.setVisible(false);
        btnViewUsers.setVisible(false);
        btnSearch.setVisible(false);
        btnManage.setVisible(false);
        LoginJPanel loginJPanel = new LoginJPanel(userList,this,jSplitPane1,workjpanel,actionjpanel,btnSearch,btnViewUsers,btnCreateUser,btnManage);
        jSplitPane1.setRightComponent(loginJPanel);
      //  btnSearch.setVisible(true);
       // btnViewUsers.setVisible(true);
       // btnSearch.setVisible(true);
        //btnCreateUser.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        ManageJPanel manageJPanel = new ManageJPanel(userList);
        jSplitPane1.setRightComponent(manageJPanel);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        CreateUserJPanel createUserJPanel = new CreateUserJPanel(userList);
        jSplitPane1.setRightComponent(createUserJPanel);
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnViewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUsersActionPerformed
        // TODO add your handling code here:
        ViewUserJPanel userViewJPanel = new ViewUserJPanel(userList);
         jSplitPane1.setRightComponent(userViewJPanel);
    }//GEN-LAST:event_btnViewUsersActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         SearchUserJPanel searchUserJPanel = new SearchUserJPanel(userList);
         jSplitPane1.setRightComponent(searchUserJPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJFrame().setVisible(true);
            }
        });
    }

    public void logIn(){
    
    this.removeAll();
    this.add(jSplitPane1);
    jSplitPane1.setLeftComponent(actionjpanel);
    jSplitPane1.setRightComponent(actionjpanel);
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionjpanel;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewUsers;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel headinglabel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workjpanel;
    // End of variables declaration//GEN-END:variables
}
