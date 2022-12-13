package com.driver;

public class Main {

    public static class A {
        String meth(){
            return "Invoking method from class A";
        }
    }//A

    public static class B extends A{
        String meth(){
            return "Method is overridden in Extendend class B";
        }

    }//B
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
//        String s = obj.meth();
//        System.out.println(s);

    }

}//Main