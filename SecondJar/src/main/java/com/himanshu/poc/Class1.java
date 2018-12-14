package com.himanshu.poc;


import com.himanshu.poc.second.Class2;

public class Class1 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("com.himanshu.poc.second.Class2");
        Class2 class2 = (Class2) c.newInstance();
        class2.method();
    }
}
