

public class Circle extends GeometricObject13_02 implements Comparable<Circle>{
        //radius data field
        private double radius = 1.0;

        //Constructors
        public Circle(){}

        public Circle(double radius){
            this.radius = radius;
        }

        //getter methods
        public double getRadius(){return radius;}
        public void setRadius(double radius){this.radius = radius;}

        @Override
        public double getArea(){
            return radius * radius *Math.PI;
        }
        
        public double getDiameter(){return 2*radius;}

        public double getPerimeter(){
            return 2*radius*Math.PI;
        }

        //print circle
        public void printCircle(){
            System.out.println("The circle has a radius of " + getRadius());
            //System.out.println("The circle is created "+getDateCreated()+"and the radius is"+radius);
        }

        //comparison method, using the radii of the circles
        @Override
        public int compareTo(Circle o) {
             if (getRadius() > o.getRadius())
                return 1;
            else if (getRadius() < o.getRadius())
                return -1;
            else
                return 0;
        }

        //equals method, using the radii of the circle
        @Override
        public boolean equals(Object o){
            Circle compareCircle = (Circle) o;
            if(getRadius() == compareCircle.getRadius()){
                return true;
            }else{
                return false;
            }

        }
    }
        
