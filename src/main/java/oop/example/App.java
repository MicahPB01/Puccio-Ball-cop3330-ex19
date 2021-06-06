package oop.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        App myApp = new App();

        double weight;
        double height;
        double BMI;

        System.out.print("What is your weight in pounds? ");
        weight = myApp.userInput();
        System.out.print("What is your height in inches? ");
        height = myApp.userInput();

        BMI = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.2f\n", BMI);

        if(BMI >= 18.5 && BMI <= 25)   {
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI < 18.5)   {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else   {
            System.out.println("You are overweight. You should see your doctor.");
        }

    }


    public double userInput()  {
        Scanner input = new Scanner(System.in);
        try   {
            return Double.parseDouble(input.nextLine());
        }
        catch(NumberFormatException e)   {
            System.out.println("Please enter a number!");
            userInput();
        }
        return 0;
    }


}
