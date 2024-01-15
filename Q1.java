/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Q1 
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int first;
        int second;
        int add;
        int subtract;
        int multiply;
        float devide;

        System.out.print("Enter First Numbers: ");
        first = scanner.nextInt();
        System.out.print("Enter Second Numbers: ");
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
    }
}
