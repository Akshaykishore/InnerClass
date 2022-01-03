package com.company;

public class Person {
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.call();
        AnonymousInnerClass smartPhone = new AnonymousInnerClass(){
            public void call(){
                System.out.println("All types of call available");
            }
        };
        smartPhone.call();
    }
}
