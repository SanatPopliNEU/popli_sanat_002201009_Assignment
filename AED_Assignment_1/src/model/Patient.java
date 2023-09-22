/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sanatpopli
 */
public class Patient {
    private String pid;
    private String ward;
    private String doctorassigned;
    private String allergy;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDoctorassigned() {
        return doctorassigned;
    }

    public void setDoctorassigned(String doctorassigned) {
        this.doctorassigned = doctorassigned;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
    
    
    
}
