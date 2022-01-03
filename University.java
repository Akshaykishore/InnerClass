package com.company;

public class University {

    public static void main(String[] args) {
        System.out.println("Calling inner class from another class");
        CollegeA principalA = new CollegeA();
        principalA.meetHOD();

        College principal =  new College();
        College.Dept hod = principal.new Dept();
        hod.conductFunction();
    }
}
