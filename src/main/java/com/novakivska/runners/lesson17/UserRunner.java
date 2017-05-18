package com.novakivska.runners.lesson17;

import com.novakivska.app.classwork.lesson17.User;

/**
 * Created by Tas_ka on 5/16/2017.
 */
public class UserRunner {

    public static void main(String[] args){
         User user = new User();
         user.setAge(10);
         user.setName("Kit");
         user.setPassport("Ukr");

         User user2 = new User();
         user2.setAge(10);
         user2.setName("Kit2");
         user2.setPassport("Ukr");

        System.out.println(user.equals(user2));
    }
}
