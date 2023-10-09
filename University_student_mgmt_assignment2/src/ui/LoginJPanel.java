/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import model.*;
/**
 *
 * @author Sanat Popli
 */
public class LoginJPanel extends javax.swing.JPanel {

    MainJFrame userJFrame; 
    JSplitPane jSplitPane;
    JPanel panel1;
    JPanel panel2;
    JButton btnSearch;
    JButton btnViewUsers;
    JButton btnCreateUser;
    JButton btnManage;
    UserList userList;
    /**
     * Creates new form UserJPanel
     */
    public LoginJPanel(UserList userList,MainJFrame userJFrame, JSplitPane jSplitPane,JPanel panel1, JPanel panel2,JButton btnSearch,JButton btnViewUsers,JButton btnCreateUser,JButton btnManage) {
        initComponents();
        this.userJFrame = userJFrame;
        this.jSplitPane = jSplitPane;
        this.panel1 = panel1;
        this.panel2 = panel2;
        this.btnSearch = btnSearch;
        this.btnViewUsers = btnViewUsers;
        this.btnCreateUser = btnCreateUser;
        this.btnManage = btnManage;
        this.userList = userList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserId = new javax.swing.JTextField();
        useridlabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        useridlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        useridlabel.setText("User Id");

        passwordlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        passwordlabel.setText("Password");

        CheckBox.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        CheckBox.setText("SHOW PWD");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel1.setText("Login to Proceed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(useridlabel)
                                .addGap(66, 66, 66)
                                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwordlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnLogin)
                                        .addComponent(CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(useridlabel)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(passwordlabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBox)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
       
       //userJFrame.logIn();
   
       //   userJFrame.removeAll();
       User user1  = new User();
       String userId = txtUserId.getText();
       String password=new String(txtPassword.getPassword());
        ArrayList<User> users = userList.getUser();
        System.out.println(users.size());
        if(!users.isEmpty()){
            
         User user= userList.searchUserByUserId(userId);
         
         if(user.getEnabled().equalsIgnoreCase("YES")){
         if(userId.equalsIgnoreCase("ADMIN") && password.equalsIgnoreCase("ADMIN")&& userId.equalsIgnoreCase(user.getUserId()) && password.equalsIgnoreCase(user.getPassword())){
         jSplitPane.remove(panel2);
         btnSearch.setVisible(true);
         btnViewUsers.setVisible(true);
         btnCreateUser.setVisible(true);
         btnManage.setVisible(true);
         jSplitPane.setRightComponent(panel2);
             
         }
         else if( user.getUserId().equalsIgnoreCase(userId) && password.equalsIgnoreCase(user.getPassword())){
         
             User u = userList.searchUser(user.getNuId());
             StudentUpdateJPanel userUpdateJPanel = new StudentUpdateJPanel(userList,u);
             jSplitPane.setRightComponent(userUpdateJPanel);
         }
         else if( !user.getUserId().equalsIgnoreCase(userId) && password.equalsIgnoreCase(user.getPassword())){
            JOptionPane.showMessageDialog(this, "User Id is Incorrect");
         }
         
        }else{
          JOptionPane.showMessageDialog(this, "User is Disabled. Contact System Admin");
         }
        
        }
  
    
       
        
    

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        // TODO add your handling code here:
        
      if(CheckBox.isSelected()){
            txtPassword.setEchoChar((char)0);
        }
        else{
            txtPassword.setEchoChar('*');
        }  
    }//GEN-LAST:event_CheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JLabel useridlabel;
    // End of variables declaration//GEN-END:variables
}
