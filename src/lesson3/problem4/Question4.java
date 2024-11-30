package lesson3.problem4;

import java.util.Scanner;

public class Question4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continueInput = true;

            while (continueInput) {
                System.out.println("Enter C for Circle");
                System.out.println("Enter R for Rectangle");
                System.out.println("Enter T for Triangle");
                String choice = scanner.nextLine().toUpperCase();

                switch (choice) {
                    case "C" -> {
                        System.out.print("Enter the radius of the Circle: ");
                        double radius = scanner.nextDouble();
                        Circle circle = new Circle(radius);
                        System.out.printf("The area of the Circle is: %.2f%n", circle.computeArea());
                    }
                    case "R" -> {
                        System.out.print("Enter the width of the Rectangle: ");
                        double width = scanner.nextDouble();
                        System.out.print("Enter the length of the Rectangle: ");
                        double length = scanner.nextDouble();
                        Rectangle rectangle = new Rectangle(length, width);
                        System.out.printf("The area of the Rectangle is: %.2f%n", rectangle.computeArea());
                    }
                    case "T" -> {
                        System.out.print("Enter the base of the Triangle: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter the height of the Triangle: ");
                        double height = scanner.nextDouble();
                        Triangle triangle = new Triangle(base, height);
                        System.out.printf("The area of the Triangle is: %.2f%n", triangle.computeArea());
                    }
                    default -> System.out.println("Invalid choice. Please enter C, R, or T.");
                }

                System.out.print("Do you want to continue (y/n)? ");
                scanner.nextLine(); // Consume leftover newline
                continueInput = scanner.nextLine().equalsIgnoreCase("y");
            }

            scanner.close();
            System.out.println("Thank you! Have a nice day");
        }

}
