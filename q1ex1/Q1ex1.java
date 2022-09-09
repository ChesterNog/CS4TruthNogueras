/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;
/**
 *
 * @author TRUTH
 */
public class Q1ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dog1 = "Nano";
        String height1 = "short";
        String furcolor1 = "black and white";
        int age1 = 2;
        
        String dog2 = "Brownie";
        String height2 = "short";
        String furcolor2 = "brown";
        int age2 = 1;
        
        String dog3 = "Blackie";
        String height3 = "tall";
        String furcolor3 = "black";
        int age3 = 1;
        
        System.out.println("Dog 1");
        System.out.println("Name: " + dog1);
        System.out.println("Height: " + height1);
        System.out.println("Furcolor: " + furcolor1);
        System.out.println("Age: " + age1);
        
        System.out.println("\nDog 2");
        System.out.println("Name: " + dog2);
        System.out.println("Height: " + height2);
        System.out.println("Furcolor: " + age2);
        
        System.out.println("\nDog 3");
        System.out.println("Name: " + dog3);
        System.out.println("Height: " + height3);
        System.out.println("Furcolor: " + age3);
        
        if (height1.compareTo(height2) == 0) {
            
            System.out.println("\nIs " + dog1 + " as tall as " + dog2 + ": true");
            
        }
        else {
            
            System.out.println("\nIs " + dog1 + " as tall as " + dog2 + ": false");
            
        }
        
        if (furcolor2.compareTo(furcolor3) == 0) {
            System.out.println("Does " + dog2 + " have the same fur color as " + dog3 + ": true");
        }
        else {  
            System.out.println("Does " + dog2 + " have the same fur color as " + dog3 + ": false"); 
        }
        
        int totalAge = age1 + age2 + age3;
        
        System.out.println("Total age of all 3 dogs: " + totalAge);
        
  

    }
    
}
