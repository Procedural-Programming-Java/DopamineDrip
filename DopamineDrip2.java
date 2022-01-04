
package dopaminedrip2;

import java.util.Scanner;
import java.io.PrintStream;

public class DopamineDrip2 {

    public static PrintStream dr;

    public static void main(String[] args) throws Exception {

        double dose, weight, mlInfused, dripRate, concentration, dropsMl;

        dropsMl = 60;
        concentration = 0.8;

        Scanner sc = new Scanner(System.in);
        dr = new PrintStream("Drip2.txt");

        promptUser();

        boolean conditionsMet = dopaminRate();

        while (conditionsMet == false) {

            conditionsMet = dopaminRate();
        }

        weight = sc.nextDouble();

        dr.printf(" %.0f %n%n", weight);

        System.out.println("Administer 30 drops per minute\n");
        dr.println("Administer 30 drops per minute\n");

        System.out.println("\n Please enter the weight and the dose:");
        dr.println(" \n Please enter the weight and the dose:");

        System.out.println(" Enter a zero to stop. \n");
        dr.printf(" Enter a zero to stop. \n\n");

        
        dose = sc.nextDouble();
        while (dose > 0) {

            weight = sc.nextDouble();

            dr.printf("When patient weight is = %.0fkg the given dose = %.0fμ "
                    + "%n", weight, dose);

            System.out.printf("When patient weight is = %.0fkg the given "
                    + "dose = %.0fμ%n", weight, dose);

            mlInfused = (weight * dose) / 1000;
            dripRate = (mlInfused * dropsMl) / concentration;

            System.out.printf(" Then mlInfused = %.2fmg and the dripRate= %.2f "
                    + "preMin %n%n", mlInfused, dripRate);
            dr.printf(" Then mlInfused = %.2fmg and the dripRate= %.2fpreMin "
                    + "%n%n", mlInfused, dripRate);

            dose = sc.nextDouble();

        }
    }

    public static boolean dopaminRate() {

        Scanner sc = new Scanner(System.in);

        int dose;

        dose = sc.nextInt();
        if (dose >= 10) {

            dr.printf(" %d %n", dose);

            System.out.println("Too large. Try again");
            dr.println("Too large. Try again");

            System.out.println("Enter an integer between 5 and 10: ");
            dr.println("Enter an integer between 5 and 10: ");
        } 
        else if (dose <= 5) {

            dr.printf(" %d %n%n", dose);

            System.out.println("Enter the patient weight in kg: ");
            dr.println("Enter the patient weight in kg :");

            return true;
        }
        return false;
    }

    public static void promptUser() {
        System.out.println("Enter the desired dose in mcg/kg/min");
        System.out.println("Enter an integer between 5 and 10: ");
        dr.println("Enter the desired dose in mcg/kg/min");
        dr.println("Enter an integer between 5 and 10: ");

    }
}
