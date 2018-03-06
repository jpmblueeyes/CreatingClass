/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author 18231
 */
public class Student {
    
private String Name;
    private int Id;
    private int ClassGrade;
    
    public Student (String name, int Id, int Class ){
        Name = name;
        Id = Id;
        ClassGrade = Class; 
    }
    
    
    public String getName(){
        return Name;
    }
    
    public int getId(){
        return Id;
    }
    
    public int getClassGrade(){
        return ClassGrade; 
    }

    public void setName(String pName){
        Name = pName; 
    }
    
    public void setId(int pId){
        Id= pId;
    }
    
    public void setClassGrade(int pClassGrade){
        ClassGrade = pClassGrade;
    }

}

