package com.novakivska.app.homework.homework13;

/**
 * Created by Tas_ka on 4/24/2017.
 */
public class WhiteCollar extends Human {

    private String company;

    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int newAge) {
        super.setAge(newAge);
    }

    public String getCompany() {
        return company;
    }

    public char [] validCompanyName = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
            't','u','v','w','x','y','z',' ','-', ','};


    public void setCompany(String newCompany) {
        String oldName = getCompany();
        char [] letters = newCompany.toLowerCase().toCharArray();
        int matches = 0;
        for (char character: letters) {
            for (char symbol:validCompanyName) {
                if(character == symbol){
                    matches = matches + 1;
                }
            }
        }
        if (matches == newCompany.length()){
            company = newCompany;
            System.out.println("Company name setted");
        }else {
            company = oldName;
            System.out.println("Company name is invalid");
        }
    }

//    public void setCompany(String newCompany){
//        for(int i=0; i<=validCompanyName.length; i++){
//        if(validCompanyName.equals(newCompany)){
//            newCompany.toString();
//            System.out.println("Company name setted");
//        } else{
//            System.out.println("Company name is invalid");
//        }
//        }
//    }

    public void printCompanyInfo(){
        System.out.println("This human is " + getName() + " of " + getAge() + " years old, who works in " + getCompany());
    }
}
