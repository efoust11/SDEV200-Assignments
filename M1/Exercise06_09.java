//exercise 6.9
// module 1 assignment 1
public class Exercise06_09 {
    public static void main(String[] args){
        //Print the table header
        System.out.printf("%3s%10s%20s%10s\n","Feet","Meters","Meters","Feet");
        System.out.print("---------------------------------------------\n");

        //loop through 1.0 - 10.0 for feet and 20.0 - 65.0 for meters and print each new line
        double i = 1.0;
        double j = 20.0;
        while(i < 11){
            System.out.printf("%4.1f%10.3f%20.1f%10.3f\n",
             i, footToMeter(i),j, meterToFoot(j) );
             i += 1.0;
             j += 5.0;
        }

    }

    /** Convert from feet to meters */
    public static double footToMeter(double foot){
        double meter;
        meter = 0.305 * foot;
        return meter;
    }

/** Convert from meters to feet */
    public static double meterToFoot(double meter){
        double foot;
        foot = 3.279 * meter;
        return foot; 
    }
}
