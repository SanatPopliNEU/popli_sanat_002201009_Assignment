/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class AddUserHistory {
    private ArrayList<AddUser> adduserhistory;
    
    public AddUserHistory(){
        this.adduserhistory = new ArrayList<AddUser>();
    }
    
    public ArrayList<AddUser> getAdduser() {
        return adduserhistory;
    }

    public void setAdduser(ArrayList<AddUser> adduserhistory) {
        this.adduserhistory = adduserhistory;
    }
    
    public AddUser addNewUsers(){
        AddUser addusers = new AddUser();
        adduserhistory.add(addusers);
        return addusers;
    }
    
}
