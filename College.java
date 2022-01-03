package com.company;

public class College {
    //Inner clas can access both static and non static fields
    static String principalName = "Palanivel";
    int fee = 600000;
    // Calling Inner Class method from static method
    public static void main(String[] args) {
	    College m = new College();
        College.Dept hod = m.new Dept();
        hod.conductFunction();
    }
    public class Dept {
        public void conductFunction(){
            System.out.println("Conducting function for CSE calling from static method");
            //Inner class can access both static and non static fields
            System.out.println(principalName);
            System.out.println(fee);
        }
    }
}
