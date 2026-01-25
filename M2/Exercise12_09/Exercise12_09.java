package Exercise12_09;
import java.util.Scanner;

public class Exercise12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user input
        System.err.print("Enter binary string: ");
        String binaryString = input.next();
        input.close();

        //try to convert string via bin2Dec method
        try{
            double newValue = bin2Dec(binaryString);
            System.out.println(newValue);
        } 
        //catch custom exception
        catch (BinaryFormatException ex) {
            System.out.println(ex);
        }
    }
    
    //bin2Dec(String binaryString) method
    public static double bin2Dec(String binaryString) throws BinaryFormatException{
        //Starting with decimal equal to zero
        double finalValue = 0.0;
        //split string into array of strings
        String[] binaryArray = binaryString.split("");
        //loop through array of strings
        for(int i = 0; i < binaryArray.length; i ++){
            //take each digit from the array, from right to left
            int backwards = binaryArray.length - i - 1;
            double digit = Double.parseDouble(binaryArray[backwards]);
            //if the digit is one or zero, convert and add to final value
            if(digit == 1.0 | digit == 0.0){
                finalValue += digit * Math.pow(2, i);
            }
            //custom exception
            else {
                throw new BinaryFormatException();
            }
        }
        return finalValue;
    }

    
}
