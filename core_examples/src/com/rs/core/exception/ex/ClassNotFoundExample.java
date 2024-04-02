package com.rs.core.exception.ex;
public class ClassNotFoundExample 
{ 
    public static void main(String[] args) { 
        try{ 
            Class.forName("Class1");   // Class1 is not defined 
        } 
        catch(ClassNotFoundException e){ 
            System.out.println(e); 
            System.out.println("Class Not Found..."); 
        } 
    } 
}