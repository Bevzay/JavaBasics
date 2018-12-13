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
public class Conditionals {
    
     public static void main(String[] args) {
         
         boolean sayHello = false;
         boolean sayHey = false;
         
         if(sayHello) {
            System.out.println("Hello");
         } else if(sayHey) {
             System.out.println("Hey");
         } else {
             System.out.println("Goodbye");
         }
         
         // x = 5 sssign 5 to x
         // x == 5 test wehther x has the value 5 (either true or false)
         
         if(true && true) {
             System.out.println("AND executed");
         }
         
         if(true || false) {
             System.out.println("OR executed");
         }
         
         int playerX = 50;
         
         /*
         * if our player is past the left of the screen,
         * or if our player is pas the right side of the screen
         */
         if(playerX < 0 || playerX > 500) {
             // some code that reverses our player's direction
             System.out.println("OR executed");
         }
     }
}
