package com.himanshu.poc;


public class Class1 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("com.himanshu.poc.Class2");
        Class2 class2 = (Class2) c.newInstance();
        class2.method();
    }
}
