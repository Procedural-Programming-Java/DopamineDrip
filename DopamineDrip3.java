
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
