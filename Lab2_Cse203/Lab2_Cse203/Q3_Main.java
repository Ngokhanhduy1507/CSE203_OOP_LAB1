/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Admin
 */
public class Q3_Main {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the number of employees");
       int n = sc.nextInt();
       
       ArrayList <Q3_Employee> list = new ArrayList<>();
       
       for (int i = 0 ; i < n ; i++ ) {
           System.out.println("Enter the code of employee");
           String employee_code = sc.next();
           sc.nextLine();
           
           System.out.println("Enter the employee name");
           String employee_name = sc.next();
           
           System.out.println("Enter the years of service ");
           int yearOfService = sc.nextInt();
           
           System.out.println("Enter the salary Coefficient");
           double salary_Coefficient = sc.nextInt();
           
           System.out.println("ENter the basic salary") ;
           double basicSalary= sc.nextInt();
           
           list.add(new Q3_Employee(employee_code, employee_name,yearOfService, salary_Coefficient, basicSalary));
           
       }
public void printhighestsalary(ArrayList<Q3_Employee> list) {
           sort(list);
           list.get(0).print();
           
       }
       public void sort(ArrayList<Q3_Employee> list) {
           Collections.sort (list, (s1,s2) ....)
       }
           
           
       }
