import java.util.Scanner;

public class UniversityAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- University Java Assignment ---");

        // Q1: Percentage Marks
        System.out.println("\n[Q1: Percentage Marks]");
        System.out.print("Enter obtained marks: ");
        double obtained = input.nextDouble();
        System.out.print("Enter maximum marks: ");
        double maxMarks = input.nextDouble();
        double percentage = (obtained / maxMarks) * 100;
        System.out.println("Percentage: " + percentage + "%");

        // Q2: Circle Circumference and Area
        System.out.println("\n[Q2: Circle Calculations]");
        System.out.print("Enter radius: ");
        double r = input.nextDouble();
        double circumference = 2 * Math.PI * r;
        double areaCircle = Math.PI * r * r;
        System.out.println("Circumference: " + circumference + " | Area: " + areaCircle);

        // Q3: Discounted Selling Price
        System.out.println("\n[Q3: Discounted Selling Price]");
        System.out.print("Enter original price: ");
        double op3 = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discP3 = input.nextDouble();
        double discountedPrice = op3 - (op3 * (discP3 / 100));
        System.out.println("Discounted Price: " + discountedPrice);

        // Q4: Original Selling Price
        System.out.println("\n[Q4: Original Selling Price]");
        System.out.print("Enter discounted price: ");
        double dsp4 = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discP4 = input.nextDouble();
        double originalPrice = dsp4 / (1 - (discP4 / 100));
        System.out.println("Original Price: " + originalPrice);

        // Q5: Watts Calculation
        System.out.println("\n[Q5: Power Calculation]");
        System.out.print("Enter Volts: ");
        double volts = input.nextDouble();
        System.out.print("Enter Amperes: ");
        double amps = input.nextDouble();
        double watts = volts * amps;
        System.out.println("Power: " + watts + " Watts");

        // Q6: Area of a Trapezoid
        System.out.println("\n[Q6: Area of Trapezoid]");
        System.out.print("Enter side a, side b, and height: ");
        double a6 = input.nextDouble();
        double b6 = input.nextDouble();
        double h6 = input.nextDouble();
        double areaTrap = ((a6 + b6) / 2) * h6;
        System.out.println("Area: " + areaTrap);

        // Q7: Even or Odd
        System.out.println("\n[Q7: Even or Odd]");
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        // Q8: Heron's Formula
        System.out.println("\n[Q8: Heron's Formula]");
        System.out.print("Enter sides a, b, and c: ");
        double a8 = input.nextDouble();
        double b8 = input.nextDouble();
        double c8 = input.nextDouble();
        double s = (a8 + b8 + c8) / 2.0;
        double areaHero = Math.sqrt(s * (s - a8) * (s - b8) * (s - c8));
        System.out.println("Area of Triangle: " + areaHero);

        input.close();
    }
}