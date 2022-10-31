package smallProjectsIdeas.mathFormulas;

import java.beans.Expression;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Find the Area of Circle ");
            System.out.print("Enter the value of Radius :-->>");
            double radius = sc.nextDouble();

            // Expression or calculating the area of circle 
            // Area of a circle radius. The radius of a circle calculator uses the following area of a circle formula:
            // Area of a circle = π * r2
            radius = radius * radius;
            double area = 3.14159265358979323846264338327950288419716939937510 * radius;
            System.out.println("The Area of circle is " + area);

    }
}
}
