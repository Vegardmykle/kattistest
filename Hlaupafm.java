import java.util.Scanner;

class Hlaupafm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fodt = 2020;
        int aar =(int) sc.nextDouble();  // Assuming the input is an integer year
        int bursdager = 0;

        // Check if the year is a leap year
        if (isLeapYear(aar)) {
            // Calculate the number of leap years since 2020, inclusive
            bursdager = countLeapYears(aar) - countLeapYears(fodt);
        }

        // Check if the year is a leap year
        if (!isLeapYear(aar)) {
            System.out.println("Neibb");
        } else {
            System.out.println(bursdager);
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to count leap years up to a certain year
    public static int countLeapYears(int year) {
        if (year < 0) return 0; // No leap years in negative years
        return year / 4 - year / 100 + year / 400;
    }
}
