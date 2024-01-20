/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Q3_Employee {
   
    String employee_code;
    String employee_name;
    int YearOfService; 
    double salary_Coefficient;
    double basicSalary;
    double salary;
    
public Q3_Employee(String employee_code, String employee_name, int YearOfService,double salary_Coefficient, double basicSalary, double salary){
    this.employee_code = employee_code;
    this.employee_name= employee_name;
    this.YearOfService = YearOfService;
    this.salary_Coefficient = salary_Coefficient;
    this.basicSalary = basicSalary;
    this.salary = salary;
}

    Q3_Employee(String employee_code, String employee_name, int yearOfService, double salary_Coefficient, double basicSalary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public void print() {
    System.out.println(this.toString()); 
}    
    @Override
    public String toString() {
String show = "employee_code : "+ employee_code + "\n" + "employee_name : " +"\n" +"Years of service" +"\n" 
        +"salary cofficient : " + salary_Coefficient+ "\n" + "basic salary: " + basicSalary+ "\n" +"salary: " + Calculate_salary()+"\n";
        return show;
}
public double Calculate_salary() {
    this.salary = basicSalary*salary_Coefficient;
    return salary;
}
public void printsalary() {
    System.out.print(" " + this.salary) ;
    
}
        
        
}

