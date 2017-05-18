package com.novakivska.runners.lesson17;

import com.novakivska.app.classwork.lesson17.Company;

/**
 * Created by Tas_ka on 5/16/2017.
 */
public class CompanyRunner {
    public static void main(String[] args){


        for(Company cName: Company.values()){
            System.out.println("Company Age: " + cName.getAge()+ " - Company Name: " + cName);
        }
    }
}
