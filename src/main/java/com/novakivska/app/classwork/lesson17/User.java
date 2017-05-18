package com.novakivska.app.classwork.lesson17;

/**
 * Created by Tas_ka on 5/16/2017.
 */
public class User {
   private String name, passport;
   private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        return getPassport().equals(user.getPassport());
    }

    @Override
    public int hashCode() {
        int result = getPassport().hashCode();
        result = 31 * result + getAge();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
