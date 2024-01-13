/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Q3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(a+"\t");
        while(a>1){
            if(a%2==0){
                a=a*1/2;
            }
            else{
                a=3*a+1;
            }
             System.out.println(a+"\t");
        }
        
        }
}