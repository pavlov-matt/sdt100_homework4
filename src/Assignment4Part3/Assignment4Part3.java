package Assignment4Part3;

import java.util.Scanner;

/**
 * Name: Matvii Pavlov
 * Course: SDT 100: Principles of Programming
 * Due: Wednesday by 11:59pm
 * Time spent: 25 minutes
 * Calculates a student's weighted course grade based on 5 categories:
 *  * Quizzes, Projects, Activities, Attendance, and Exams.
 *  Sources: none. No AI use
 */

public class Assignment4Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student and course information
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        double quizzesWeight = 0;
        double projectsWeight = 0;
        double activitiesWeight = 0;
        double attendanceWeight = 0;
        double examsWeight = 0;
        boolean validWeights = false;

        // Loop until all weights sum up to 1.0
        while (!validWeights) {
            System.out.println("\n--- Enter Category Weights (Must sum to 1.0) ---");

            System.out.print("Enter quizzes weight: ");
            quizzesWeight = scanner.nextDouble();

            System.out.print("Enter projects weight: ");
            projectsWeight = scanner.nextDouble();

            System.out.print("Enter activities weight: ");
            activitiesWeight = scanner.nextDouble();

            System.out.print("Enter attendance weight: ");
            attendanceWeight = scanner.nextDouble();

            System.out.print("Enter exams weight: ");
            examsWeight = scanner.nextDouble();

            double totalWeight = quizzesWeight + projectsWeight + activitiesWeight
                    + attendanceWeight + examsWeight;

            // Check if the weights sum up to 1
            if (totalWeight == 1) {
                validWeights = true;
            } else {
                System.out.printf("Error: The sum of weights is %.2f. The weights must sum to exactly 1.0. Please try again.%n", totalWeight);
            }
        }

        // Collect category averages
        System.out.println("\n--- Enter Category Averages (0.0 to 1.0) ---");

        System.out.print("Enter quizzes average: ");
        double quizzesAverage = scanner.nextDouble();
        while (quizzesAverage > 1.0 || quizzesAverage < 0.0) {
            System.out.print("Invalid average! Enter quizzes average (must be 1 or smaller): ");
            quizzesAverage = scanner.nextDouble();
        }

        System.out.print("Enter projects average: ");
        double projectsAverage = scanner.nextDouble();
        while (projectsAverage > 1.0 || projectsAverage < 0.0) {
            System.out.print("Invalid average! Enter projects average (must be 1 or smaller): ");
            projectsAverage = scanner.nextDouble();
        }

        System.out.print("Enter activities average: ");
        double activitiesAverage = scanner.nextDouble();
        while (activitiesAverage > 1.0 || activitiesAverage < 0.0) {
            System.out.print("Invalid average! Enter activities average (must be 1 or smaller): ");
            activitiesAverage = scanner.nextDouble();
        }

        System.out.print("Enter attendance average: ");
        double attendanceAverage = scanner.nextDouble();
        while (attendanceAverage > 1.0 || attendanceAverage < 0.0) {
            System.out.print("Invalid average! Enter attendance average (must be 1 or smaller): ");
            attendanceAverage = scanner.nextDouble();
        }

        System.out.print("Enter exams average: ");
        double examsAverage = scanner.nextDouble();
        while (examsAverage > 1.0 || examsAverage < 0.0) {
            System.out.print("Invalid average! Enter exams average (must be 1 or smaller): ");
            examsAverage = scanner.nextDouble();
        }

        // Calculate weighted scores and final grade percentage
        double weightedQuizzes = quizzesWeight * quizzesAverage;
        double weightedProjects = projectsWeight * projectsAverage;
        double weightedActivities = activitiesWeight * activitiesAverage;
        double weightedAttendance = attendanceWeight * attendanceAverage;
        double weightedExams = examsWeight * examsAverage;

        double totalWeightedScore = weightedQuizzes + weightedProjects + weightedActivities
                + weightedAttendance + weightedExams;

        double finalPercentage = totalWeightedScore * 100.0;

        // Formatted Output
        System.out.println("\nHi " + studentName + ",");
        System.out.printf("You have a %.1f%% in your %s course.%n", finalPercentage, courseName);

        scanner.close();
    }
}