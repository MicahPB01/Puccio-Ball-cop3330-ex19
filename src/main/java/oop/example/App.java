package oop.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double weight;
        double height;
        double BMI;

        System.out.print("What is your weight in pounds? ");
        weight = userInput();
        System.out.print("What is your height in inches? ");
        height = userInput();

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


    public static double userInput()  {
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
