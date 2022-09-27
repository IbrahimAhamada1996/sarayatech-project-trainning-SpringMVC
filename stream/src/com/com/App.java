package com.com;

import com.Implements.MyInterfaceImp;
import com.interfaces.MyInterface1;

public class App {

    public static void main(String[] args) {
        MyInterface1 myInterface1 = new MyInterfaceImp();
        printHello(myInterface1);

    }

    public static void printHello(MyInterface1 myInterface1){
        myInterface1.hello();
    }
}
