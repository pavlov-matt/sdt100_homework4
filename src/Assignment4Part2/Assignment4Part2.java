package Assignment4Part2;

import java.util.Scanner;

/**
 * Name: Matvii Pavlov
 * Course: SDT 100: Principles of Programming
 * Due: Wednesday by 11:59pm
 * Time spent: 10 minutes
 * Description: Calculates the volume in gallons needed to fill a rectangular pool
 *  * and computes the total water bill cost.
 *  Sources: Google to find out calculations for gallons. No AI use
 */

public class Assignment4Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion constant: 1 cubic meter = 264.172 gallons
        final double GALLONS_PER_CUBIC_FOOT = 264.172;

        System.out.println("==========================================");
        System.out.println("        Pool Water Fill Calculator         ");
        System.out.println("==========================================");

        // Collect inputs
        System.out.print("Enter length in meters: ");
        double lengthInMeters = scanner.nextDouble();

        System.out.print("Enter width in meters: ");
        double widthInMeters = scanner.nextDouble();

        System.out.print("Enter depth/height in meters: ");
        double depthInMeters = scanner.nextDouble();

        System.out.print("Enter utility cost per 1,000 gallons ($): ");
        double costPerThousandGallons = scanner.nextDouble();

        // Perform calculations
        double volumeInCubicFeet = lengthInMeters * widthInMeters * depthInMeters;
        double totalGallonsRequired = volumeInCubicFeet * GALLONS_PER_CUBIC_FOOT;
        double totalCost = (totalGallonsRequired / 1000.0) * costPerThousandGallons;

        // Display output
        System.out.println("\n----------------- Summary -----------------");
        System.out.printf("Structure Dimensions : %.2f m x %.2f m x %.2f m%n", lengthInMeters, widthInMeters, depthInMeters);
        System.out.printf("Total Volume         : %.2f cubic feet%n", volumeInCubicFeet);
        System.out.printf("Water Required       : %.2f gallons%n", totalGallonsRequired);
        System.out.printf("Total Water Bill Cost: $%.2f%n", totalCost);
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}