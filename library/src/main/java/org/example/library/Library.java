/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.library;

/**
 *
 * @author mstahv
 */
public class Library {

    public static void main(String[] args) {
    }
    
    public static void doStuff() {
        System.out.println("STUFF");
        try {
            Library.class.getClassLoader().loadClass("org.example.optional.Optional");
            System.out.println("OPTIONAL EXISTS!");
        } catch (ClassNotFoundException ex) {
            System.out.println("OPTIONAL NOT AVAILABLE");
        }
        
    }
    
}
