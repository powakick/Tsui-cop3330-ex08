/*
UCF COP3330 FALL 2021 ASSIGNMENT 8 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){

        int people, pizzas, slices, slices_total, slices_per_person, leftovers;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people?");
        people = scan.nextInt();

        System.out.println("How many pizzas do you have");
        pizzas = scan.nextInt();

        System.out.println("How many slices per pizza?");
        slices = scan.nextInt();

        slices_total = pizzas * slices;
        slices_per_person = slices_total / people;

        System.out.println(people + " people with " + pizzas + " pizzas ( " + slices_total + " slices )");

        System.out.println("Each person gets " + slices_per_person + " pieces of pizza.");

        leftovers = slices_total % people;
        System.out.println("There are " + leftovers + " leftover pieces");


    }
}
