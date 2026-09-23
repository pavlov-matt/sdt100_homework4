package Assignment4Part4;

import java.util.Scanner;

/**
 * Name: Matvii Pavlov
 * Course: SDT 100: Principles of Programming
 * Due: Wednesday by 11:59pm
 * Time spent: 60 minutes
 * Draws a hollow box of user-specified size using exclusively `while` loop structures.
 * Sources: none. No AI use
 */
public class Assignment4Part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.print("Enter box size: ");
            int size = scanner.nextInt();

            if (size < 1) {
                System.out.println("Size must be at least 1.");
            } else if (size == 1) {
                System.out.println("+");
            } else {
                // Horizontal interior width formula to balance visual aspect ratio: (2 * size - 3)
                int innerWidth = 2 * size - 2;
                int currentRow = 1;

                while (currentRow <= size) {
                    if (currentRow == 1 || currentRow == size) {
                        // Top or Bottom Border (+-------+)
                        System.out.print("+");
                        int col = 0;
                        while (col < innerWidth) {
                            System.out.print("-");
                            col++;
                        }
                        System.out.println("+");
                    } else {
                        // Middle Hollow Rows (|       |)
                        System.out.print("|");
                        int col = 0;
                        while (col < innerWidth) {
                            System.out.print(" ");
                            col++;
                        }
                        System.out.println("|");
                    }
                    currentRow++;
                }
            }

            // Prompt user to continue or exit
            System.out.print("\nDo you want to draw another box? (y/n): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("yes")) {
                keepGoing = false;
            }
            System.out.println();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}