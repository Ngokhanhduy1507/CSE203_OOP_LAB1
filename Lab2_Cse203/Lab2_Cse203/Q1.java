/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Q1 {
   double first;
   double second;
    public Q1() {
    
    }
    public Q1(double first , double second) {
        this.first = first;
        this.second = second;
    }
public void input() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Numbers:  ");
        first = sc.nextDouble();
        System.out.println("Enter Second Numbers: ");
        second = sc.nextDouble();
    }
    
 public void print() {
      System.out.println("add ="+first+" , " +second+") result: "+add());
        System.out.println("minus:"+ first +" " +second+" )result: "+minus());
           System.out.println("multiply ="+first+" " +second+") result: "+multiply());
        System.out.println("divide =("+first+" , " +second+") result: "+divide());
        
    }
 public double add() {
        return first+second;
    }
    public double minus() {
        return first-second;
    }
    public double multiply(){
        return first*second;
    }
    public double divide() {
        return first/second;
    }
}
   