package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BMI(Body Mass Index) Calculator");
        System.out.println("Enter your Height:");
        float yourHeight = input.nextFloat();
        System.out.println("Enter your Weight:");
        float yourWeight = input.nextFloat();
        yourHeight *= yourHeight;
        float BMI = yourWeight / yourHeight;
        System.out.println("Your BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("You are a Underweight person");
        }
        else if(BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You are a Normal Weight person");
        }
        else {
            System.out.println("You are a Obese person");
        }


    }
}
