package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 10 Solution
 *  Copyright 2021 Drake Scott
 */

public class taxes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //I know this is super inefficient I just wanted to practice with arrays in java.
        double[] price;
        price = new double[3];

        double[] quant = new double[3];

        double[] preTaxItems;
        preTaxItems = new double[3];

        int i = 0;

        //experimenting with arrays and while loops
        while(i != 3){
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            price[i] = input.nextDouble();

            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            quant[i] = input.nextDouble();

            preTaxItems[i] = price[i] * quant[i];

            i++;
        }

        double sum = 0;
        for (int j = 0; j < price.length; j++)
            sum += preTaxItems[j];

        double taxesAdded = sum  * 0.055;
        double afterTax = sum + taxesAdded;


        //experimenting with different methods of formatting doubles.
        System.out.printf("Subtotal: $%,.2f", sum);
        System.out.printf("\nTax: $%,.2f", taxesAdded);

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("\nTotal: $" + df.format(afterTax));

    }
}
