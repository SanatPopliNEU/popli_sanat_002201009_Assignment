/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Bhagya
 */
public class StudentProfile extends Profile {
         
    Person person;
    
    public StudentProfile(Person person){
        super(person);
    }
    
    @Override
    public String getRole(){
        return "Student";
    }
    
    public boolean isMatch(String id){
        return person.getPersonId().equals(id);
    }
}
