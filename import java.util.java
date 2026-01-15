import java.util.Scanner;

public class UniversityAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- University Java Assignment ---");

        // Q1: Student Marksheet
        System.out.println("\n[Q1: Student Marksheet]");
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = input.nextInt();
        System.out.print("Enter Marks for Math, English, and Science: ");
        double m1 = input.nextDouble();
        double m2 = input.nextDouble();
        double m3 = input.nextDouble();
        double total = m1 + m2 + m3;
        double percentage = (total / 300) * 100;
        System.out.println("Total: " + total + " | Percentage: " + percentage + "%");

        // Q2: Area of a Circle
        System.out.println("\n[Q2: Area of Circle]");
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        double areaCircle = Math.PI * r * r;
        System.out.println("Area: " + areaCircle); // Fixed: added semicolon

        // Q3: Area of Triangle (Base/Height)
        System.out.println("\n[Q3: Area of Triangle]");
        System.out.print("Enter base and height: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaTri = 0.5 * base * height;
        System.out.println("Area: " + areaTri);

        // Q4: Area of Triangle (Heron's Formula)
        System.out.println("\n[Q4: Heron's Formula]");
        System.out.print("Enter three sides: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double s = (a + b + c) / 2.0;
        double heronArea = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Fixed: added semicolon
        System.out.println("Area: " + heronArea);

        input.close(); // Good practice to close the scanner
    }
}