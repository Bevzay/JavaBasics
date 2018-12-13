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
public class Methods {
    
    public static void main(String[] args) {
        sayHelloWorld();
        
        sayHelloTo("Charilie");
        
        int x = returnFive();
        System.out.println(x);
        
        int result = square(x);
        System.out.println(result);
    }
    
    // this method will say hello to whatever name is passed when called
    static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
    
    // this method simply says "Hello World!"
    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }
    
    // this method returns an int type with the value 5
    static int returnFive() {
        return 5;
    }
    
    static int square(int x) {
        return x * x;
    }
}
