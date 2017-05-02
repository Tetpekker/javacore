package com.novakivska.runners.homework13;

import com.novakivska.app.homework.homework13.Human;
import com.novakivska.app.homework.homework13.WhiteCollar;

import java.io.IOException;

/**
 * Created by Tas_ka on 4/24/2017.
 */
public class HumanRunner {

    public static void main (String[] args) {
        String name = "Bob";
        int age = 87;
        String company = "White Collar";

        Human human = new Human(name, age);
        WhiteCollar whiteCollar = new WhiteCollar(name, age, company);

        human.printHumanInfo();
        human.setAge(55);

        whiteCollar.printCompanyInfo();
        whiteCollar.setCompany(company);
    }
}
