/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.util.ArrayList;

/**
 *
 * 
 */
public class SavedPasswordHistoryList {
    
    ArrayList<SavedPasswordHistory> passwordList;

    
    public SavedPasswordHistoryList(){
    
       passwordList = new ArrayList<>();
    }
    
    public ArrayList<SavedPasswordHistory> getPasswordList() {
        return passwordList;
    }

    public void setPasswordList(ArrayList<SavedPasswordHistory> passwordList) {
        this.passwordList = passwordList;
    }
    
     public SavedPasswordHistory addPasswordHistory(SavedPasswordHistory password){
    
       // User user = new User();
        passwordList.add(password);
        return password;
    }
     
      public SavedPasswordHistory searchOldPassword(String neuId){
        String nuId = neuId;
       for(SavedPasswordHistory u: passwordList){
           if(nuId.equalsIgnoreCase(u.getNeuId())){
           return u;
           }
       }
        return null;
   }
}

