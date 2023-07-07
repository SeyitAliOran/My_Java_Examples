package dersler.gun25_Reading_User_Input_Scanner;

import java.util.Scanner;
/*
      (Science: calculating energy)
      Write a program that calculates the energy needed to heat water from an
      initial temperature to a final temperature;
      Your program should prompt the user to enter the amount of water in kilograms
      and the initial and final temperatures of the water.

      The formula to compute the energy is
           Q = M * (finalTemperature – initialTemperature) * 4184
      where M is the weight of water in kilograms, temperatures are in degrees Celsius,
      and energy Q is measured in joules.

   */
public class HomeWorkCalculateEnergy {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = scanner.nextDouble();
        System.out.print("Enter the initial temperature of the water in degrees Celsius: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature of the water in degrees Celsius: ");
        double finalTemperature = scanner.nextDouble();


        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed to heat the water is: " + Q + " joules");
    }
}
