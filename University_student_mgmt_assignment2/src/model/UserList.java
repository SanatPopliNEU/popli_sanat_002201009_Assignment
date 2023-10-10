/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author Sanat Popli
 */
public class UserList {
    
   
    ArrayList<User> userList = null;
    EncryptionDecryption EncryptionDecryption =new EncryptionDecryption();
    
     public UserList(){
    
        this.userList = new ArrayList<User>();
        User user1 = new User();
        user1.setNuId(null);
        user1.setUserId("ADMIN");
        user1.setUserName("admin");
        user1.setPassword(EncryptionDecryption.encrypt("ADMIN","secrete"));
        user1.setEnabled("YES");
        userList.add(user1);
        System.out.print(userList);
    }
    

    public ArrayList<User> getUser() {
        return userList;
    }

    public void setUser(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public User addUser(User user){
    
       // User user = new User();
        userList.add(user);
        return user;
    }
    
    public void deleteUser(User user){    
        userList.remove(user);
    } 
    
    
   public User searchUser(String nueId){
    String nuId = nueId;
       for(User u: userList){
           if(nuId.equalsIgnoreCase(u.getNuId())){
           return u;
           }
       }
   return null;
   }
   
   public User searchUserByUserId(String userId){
    String nuId = userId;
       for(User u: userList){
           if(nuId.equalsIgnoreCase(u.getUserId())){
           return u;
           }
       }
   return null;
   }
    
}
