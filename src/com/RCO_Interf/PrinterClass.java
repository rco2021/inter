package com.RCO_Interf;

public class PrinterClass {
    private String msg;

    public PrinterClass (){
        this.msg = "";
    }
    public PrinterClass(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void printMessage(){
        System.out.println(msg);
    }

    public void  printHelloWorld() { System.out.println("Hi World"); }
}
