//exercise 9.9
// module 1 assignment 4
public class Exercise09_09 {
  public static void main(String[] args) {
    //Creating three polygon objects
    RegularPolygon polygon1 = new RegularPolygon();
    RegularPolygon polygon2 = new RegularPolygon(6,4);
    RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);

    //Printing data for the three polygons
    System.out.println("First Polygon:");
    System.out.println("Perimeter: "+polygon1.getPerimeter());
    System.out.println("Area: "+polygon1.getArea());

    System.out.println("Second Polygon:");
    System.out.println("Perimeter: "+polygon2.getPerimeter());
    System.out.println("Area: "+polygon2.getArea());

    System.out.println("Third Polygon:");
    System.out.println("Perimeter: "+polygon3.getPerimeter());
    System.out.println("Area: "+polygon3.getArea());
  }
}

class RegularPolygon {
  // Default values
  int n = 3;
  double side = 1;
  double x = 0;
  double y = 0;

  // Constructors
  RegularPolygon(){
  }

  RegularPolygon(int newN, double newSide){
    n = newN;
    side = newSide;
  }

  RegularPolygon(int newN, double newSide, double newX, double newY){
    n = newN;
    side = newSide;
    x = newX;
    y = newY;
  }

  // Getter
  int getN(){
    return n;
  }

   double getSide(){
    return side;
  }

   double getX(){
    return x;
  }

   double getY(){
    return y;
  }

  // Setter
  void setN(int newN){
    n = newN;
  }

  void setSide(double newSide){
    side = newSide;
  }

  void setX(double newX){
    x = newX;
  }

  void setY(double newY){
    y = newY;
  }

  // Methods to get perimeter and area
  double getPerimeter(){
    double perimeter;
    perimeter = side * n;
    return perimeter;
  }

  double getArea(){
    double area;
    area = (n*side*side) / (4 * Math.tan(Math.PI / n));
    return area;
  }


}
