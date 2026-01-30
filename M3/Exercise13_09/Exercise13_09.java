
public class Exercise13_09 {
    public static void main(String[] args) {
        //Testing the circle class by comparing two circles
        Circle circle1 = new Circle(1.0);
        Circle circle2 = new Circle(1.0);

        if(circle1.equals(circle2)){
            System.out.println("The circles are equal");
        } else{
            System.out.println("The circles are not equal");
        }
        
    }
}

