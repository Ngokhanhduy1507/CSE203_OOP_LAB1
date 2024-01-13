/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Q4 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the array limit:");
        int b= sc.nextInt();
        int[] a=new int[b];
        int sum=0;
        for(int i=0;i<b;i++)
        {
            System.out.printf("element of a[%d]:",i);
            a[i]=sc.nextInt();
        }
        for(int e:a)
        {
            if(e%2==0)
                sum=sum+e;
        }
        System.out.println("Sum of even array elements:"+sum);
 }
        }

