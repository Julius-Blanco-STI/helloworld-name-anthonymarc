/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;


public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String name="Anthony Marc I. Rosario";
    System.out.println("Hello World!");
    System.out.println("What's your name?");
    name = scn.nextLine();
    
    System.out.println("How old are you?");
    int age=scn.nextInt();
    
    System.out.println("What's your address?");
    String address = scn.nextLine();
    address = scn.nextLine();
         
    System.out.println("Hi " + name);
    System.out.println("You are " + age + "years old");
    System.out.println("You live at " + address);
  }

}