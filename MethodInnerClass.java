package com.company;

public class MethodInnerClass {
    static int fee = 1000;
    String name = "Akshay";
    public static void main(String[] args) {
        MethodInnerClass principal = new MethodInnerClass();
        principal.creatingDept();
    }
    // Creating inner class inside Non static function
    public void creatingDept(){
        class Dept{
            public void inaugrate(){
                System.out.println("Dept Started");
                System.out.println(fee);
                System.out.println(name);
            }
        }
        Dept hod = new Dept();
        hod.inaugrate();
    }
    // Creating inner class inside static function but it could only access static fields
//    public static void creatingDept(){
//        class Dept{
//            public void inaugrate(){
//                System.out.println("Dept Started");
//                System.out.println(fee);
//                System.out.println(name); // non static methods cannot be used
//            }
//        }
//        Dept hod = new Dept();
//        hod.inaugrate();
//    }
}
