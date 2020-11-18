/*
    Name: Dominic Morgadez
    Class: CSC110
    Date: October 13, 2020

    Program 1: ABC Sales Company
    A program that summarizes a part-time employee's monthly work hours.
*/
import java.util.Scanner;
public class ABCSales {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Constant Variables
        int workWeek = 40;
        int workDay = 8;
        double vacayPerHour = 0.05;

        // User Inputs
        System.out.println("Please enter name: ");
        String employee = kb.nextLine();

        System.out.println("Please enter the first week's work (as an integer): ");
        int firstWeek = kb.nextInt();
        System.out.println("Please enter the second week's work (as an integer): ");
        int secondWeek = kb.nextInt();
        System.out.println("Please enter the third week's work (as an integer): ");
        int thirdWeek = kb.nextInt();
        System.out.println("Please enter the fourth week's work (as an integer): ");
        int fourthWeek = kb.nextInt();

        System.out.println("Please enter number of sales calls made (as an integer): ");
        int salesCalls = kb.nextInt();

        //Arithmatic Operations
        int totalHours = firstWeek + secondWeek + thirdWeek + fourthWeek;
        double avgHours = (double) totalHours / 4;
        double vacationEarned = (double) totalHours * vacayPerHour;
        int equivalentWeeks = totalHours / workWeek;
        int equivalentDays = (int) avgHours / workDay;
        int equivalentHours = totalHours % workDay;
        double avgSales = (double) salesCalls/ totalHours;

        //Outputs
        System.out.println();
        System.out.println("\t" + employee);
        System.out.println("\t \tTotal hours worked: " + totalHours);
        System.out.println("\t \tAverage hours per week: " + avgHours);
        System.out.println("\t \tVacation hours earned: " + vacationEarned);
        System.out.println("\t \t \tEquivalent weeks: " + equivalentWeeks);
        System.out.println("\t \t \tEquivalent days: "+ equivalentDays);
        System.out.println("\t \t \tEquivalent hours: " + equivalentHours);

        if(totalHours >= 0) {
            System.out.println("\t \tAverage sales calls per hour: " + avgSales);
        }
    }
}
