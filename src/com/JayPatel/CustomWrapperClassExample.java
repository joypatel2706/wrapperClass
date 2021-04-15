package com.JayPatel;

import com.sun.jdi.IntegerValue;

class MyInteger{
    private int i;
    //Constructor
    MyInteger(int j){
        i= j;
    }
    //Public API
    public int intValue(){
        return i;
    }
}

public class CustomWrapperClassExample {
    public static void main(String[] args) {
        int x =10;

        Integer y = x;
        System.out.println(y.intValue());

        MyInteger z = new MyInteger(x);
        System.out.println(z.intValue());
    }
}
