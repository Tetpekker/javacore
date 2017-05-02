package com.novakivska.app.homework.homework13;

/**
 * Created by Tas_ka on 4/24/2017.
 */
public class Human {

    private String name;
    private int age;

   public Human(String name, int age){
       this.name = name;
       this.age = age;
   }

    public void setName(String newName){
        name = newName;
    }

   public void setAge(int newAge){
       if(1 <= newAge && newAge <= 120){
           age = newAge;
           System.out.println("New age setted");
       } else{
           System.out.println("Age invalid");
       }
   }

   public String getName(){
       return name;
   }

   public int getAge(){
       return age;
   }

   public void printHumanInfo(){
       System.out.println("The new human is: " + name + " with age: " + age);
   }

//    public void setCompany() {
//    }

    public void printCompanyInfo() {
    }
}
