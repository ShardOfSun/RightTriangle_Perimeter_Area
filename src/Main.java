/* 1к 15гр Терновская Елизавета
* Вариант 10. Найти периметр и площадь прямоугольного треугольника, если даны длины его
катетов a и b. */

import java.util.Scanner;
public class Main {

    public static boolean checkCathetus(double a, double b){
        return a > 0 & b > 0;
    }

    public static double perimeterCalculation(double a,double b){
        double c = Math.sqrt(a*a + b*b);
        return a + b + c;
    }

    public static double areaCalculation(double a, double b){
        return a*b/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the program that counts the perimeter and area of a right triangle!");

        System.out.println("Enter the length of the cathetus a:");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of the cathetus b:");
        double b = scanner.nextDouble();

        if (!checkCathetus(a,b)) { System.out.println("Incorrect input values!"); System.exit(-1); }

        System.out.println("Choose what to count:\n(1) Perimeter\n(2) Area\n(0) Exit");

        double result = 0;
        switch (scanner.nextInt()){
            case 0:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            case 1: result = perimeterCalculation(a,b); break;
            case 2: result = areaCalculation(a,b); break;
            default: System.out.println("Incorrect input!"); System.exit(-1);
        }

        System.out.println("Result is: " + result);
    }
}