public class Exercise11_11 {
    
}

abstract class Triangle extends GeometricObject{
    //default data fields
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    //no-arg constructor
    Triangle(){}

    //constructor with three sides
    Triangle(double newSide1, double newSide2, double newSide3){
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
    }

    //accessor methods
    double getSide1(){return side1;}
    double getSide2(){return side2;}
    double getSide3(){return side3;}

    //getArea()
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
        return area;
    }
    
    //toString()
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}