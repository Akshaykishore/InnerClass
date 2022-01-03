package com.company;

public class CollegeA {

    public static void main(String[] args) {
        CollegeA principal = new CollegeA();
        principal.meetHOD();
    }

    public void meetHOD(){
        DeptA hod = new DeptA();
        hod.conductFunction();
    }

    public class DeptA{
        public void conductFunction(){
            System.out.println("Function for CSE calling from nonstatic method");
        }
    }
}
