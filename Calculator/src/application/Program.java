package application;

import model.entities.Calculator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Calculator cal = new Calculator();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Enter a number: ");
        double number1 = sc.nextInt();

        System.out.print("Enter a operator (+,-,x,/): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter a second number: ");
        double number2 = sc.nextInt();


            double result = cal.Calculate(number1,number2,operator);
            System.out.printf("Result: %.2f", result);
        }catch (InputMismatchException e){
            System.out.println("Error: Not accepted input");
        }catch (IllegalArgumentException e){
            System.out.println("Error! " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

