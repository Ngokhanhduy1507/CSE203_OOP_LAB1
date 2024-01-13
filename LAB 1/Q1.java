/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Q1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number:");
        int a=sc.nextInt();
        int last=(int)(a%10);
        int d;
        int first=0;
        while(a>0)
        {
            d=a%10;
            if((a/10)==0)
            {
                first=d;
            }
            a=a/10;
        }
        System.out.println(first+last);  
            }
        }
        