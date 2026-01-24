import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled in? True or False: ");
        boolean filled = input.nextBoolean();

        input.close();

        Triangle newTriangle = new Triangle(side1,side2,side3);

        newTriangle.setColor(color);
        newTriangle.setFilled(filled);
        
        
        System.out.println("The area of the triangle is:" + newTriangle.getArea());
        System.out.println("The perimeter of the triangle is: "+ newTriangle.getPerimeter());
        System.out.println("The color of the triangle is: "+ newTriangle.getColor());
        System.out.println("Is the triangle filled?: " + newTriangle.isFilled());
    }
    
}

