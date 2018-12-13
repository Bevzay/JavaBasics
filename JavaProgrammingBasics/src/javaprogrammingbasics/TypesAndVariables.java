/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrammingbasics;

/**
 *
 * @author bever
 */
public class TypesAndVariables {
    
    public static void main(String[] args) {
        int myVariable;
        // declaring a variable called myVariable that stores the type int
        
        myVariable = 5;
        // initialising myVariabe to the value 5
        
        System.out.println(myVariable);
        
        myVariable = 10;
        System.out.println(myVariable);
        
        myVariable = myVariable + 1;
        System.out.println(myVariable);
        
        int myVar2 = 7;
        // declaring and initialising in one step
        
        System.out.println(myVariable + myVar2);
        
        //---
        
        double x = 2.5;
        System.out.println(x);
        
        //---
        
        String hello = "Hello, ";
        String name = "Charlie";
        System.out.println(hello + name);
        // String concatenation
    }
}
