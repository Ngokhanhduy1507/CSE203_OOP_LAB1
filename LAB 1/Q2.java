/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
public class Q2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int min_value= Arrays.stream(new int[] {a,b,c}).min().getAsInt();
        System.out.println(" The smaller number is " + min_value );   
    }
}

