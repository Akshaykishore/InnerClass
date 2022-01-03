package com.company;

public class StaticInnerClass {
    public static void main(String[] args) {
        StaticInnerClass.Demo hod = new StaticInnerClass.Demo();
        hod.admit();
    }
    static class Demo{
        public void admit(){
            System.out.println("Static block content access");
        }
    }
}
