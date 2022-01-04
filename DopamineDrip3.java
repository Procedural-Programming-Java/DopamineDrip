/**
 * @author Yaaqov Shkifati
 * @since 10/3/19
 * @version 1.0 
 * Part#2 
 * Description: In this program is we are continuing IV
 * calculation from part# 1 but, now we are just entering the patients
 * weight(kg) and calculating the dripRate(perMin) given the dose range
 * 5-10µg/kg/min.
 *
 * We will be writing this with program with the trailer method. We will first
 * create a while loop with the condition that dose is greater than zero. Within
 * the while loop we will create a for loop which will set condition to stay in
 * the dose range 5-10µg/kg/min and add one to the dose and then compute the
 * dripRate(preMin) for each dose until reach 10µg. Then we will signal the data
 * to stop by entering a zero and that is our trailer.
 */
package dopaminedrip3;

import java.util.Scanner;
import java.io.PrintStream;

public class DopamineDrip3 {

    public static PrintStream dr;

    public static void main(String[] args) throws Exception {

        double dose, weight, dripRate;

        Scanner sc = new Scanner(System.in);
        dr = new PrintStream("Drip3.txt");

        promptUser();

        weight = sc.nextDouble();
        while (weight > 0) {

            dr.printf("  %.0f %n%n", weight);

            System.out.printf("dose(mg/kg/min)\t dripRate per minute\n");
            dr.printf("dose(mg/kg/min)\t dripRate per minute\n");

            for (dose = 5; dose <= 10; dose++) {

                dripRate = ((weight * dose) / 1000) * (60 / 0.8);

                System.out.printf(" %.0f\t\t\t %.2f%n", dose, dripRate);
                dr.printf("%.0f\t\t\t %.2f%n", dose, dripRate);
            }

            System.out.println("Enter the patient weight in kg:");
            dr.print(" \n Enter the patient weight in kg:");

            weight = sc.nextDouble();

        }

    }

    public static void promptUser() {
        System.out.println(" Enter the patient weight in kg:");
        dr.print("\n Enter the patient weight in kg:");
    }
}
