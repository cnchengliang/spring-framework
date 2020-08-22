package com.smart.spel;


import java.util.Date;

public class CodeGenerator {

    @SuppressWarnings({"deprecation", "unchecked"})
    public static String getDim1(){
        return String.valueOf(new Date().getYear()+1900);
    }

    @SuppressWarnings({"deprecation", "unchecked"})
    public static String getDim2(){
        return String.valueOf(new Date().getMonth()+1);
    }

    @SuppressWarnings({"deprecation", "unchecked"})
    public static String getDim3(){
        return String.valueOf(new Date().getDay());
    }
}
