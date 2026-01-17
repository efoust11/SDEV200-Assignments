import java.util.Scanner;
//module 1 assignment 2
// exercise 6.31
public class Exercise06_31 {
    public static void main(String[] args){
        // Start input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Credit Card Number: ");
        long number = input.nextLong();

        // Check number validity
        boolean result = isValid(number);

        // Print result
        if(result){
            System.out.println("This number is valid");
        }else{
            System.out.println("This number is not valid");
        }

        // Close input
        input.close();
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number){

        //check number size
        if(getSize(number) < 13 | getSize(number) > 16){
            return false;
        } 
        
        //check prefix against 4, 5, 37, and 6,
        if(!prefixMatched(number, 4) & !prefixMatched(number, 5) & !prefixMatched(number, 37) & !prefixMatched(number, 6)){
            return false;
        } 

        // Algorithm for validating credit cards
        int step1;
        step1 = sumOfDoubleEvenPlace(number);
        int step3;
        step3 = sumOfOddPlace(number);
        int step4 = step1 + step3;

        if(step4 % 10 == 0){
            return true;
        } else{
            return false;
        }
    }

/** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        String numText;
        numText = Long.toString(number);
        
        int newDigit = 0;
        int sum = 0;
        for(int i = numText.length() - 2; i >= 0; i = i-2){
            newDigit = getDigit(Integer.parseInt("+"+numText.charAt(i)));
            sum = sum + newDigit;
        }

        return sum;

    }

/** Return this number if it is a single digit, otherwise,
 * return the sum of the two digits */
    public static int getDigit(int number){
        number = number + number;

        String numText;
        numText = Integer.toString(number);

        int newDigit = 0;
        if(numText.length() > 1){
            newDigit = Integer.parseInt("+"+numText.charAt(0)) + Integer.parseInt("+"+numText.charAt(1));
            return newDigit;
        } else {
            return number;
        }

    }

/** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        String numText;
        numText = Long.toString(number);
        int newDigit = 0;
        int sum = 0;
        for(int i = numText.length() - 1; i > 0; i = i-2){
            newDigit = Integer.parseInt("+"+numText.charAt(i));
            sum = sum + newDigit;
        }

        return sum;
    }

/** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        long prefix1 = getPrefix(number, 1);
        long prefix2 = getPrefix(number, 2);

        if(d == prefix1 | d == prefix2){
            return true;
        }else{
            return false;
        }

    }

/** Return the number of digits in d */
    public static int getSize(long d){
        String numText;
        numText = Long.toString(d);
        return numText.length();

    }

/** Return the first k number of digits from number. If the
 * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){
        String numText;
        numText = Long.toString(number);

        if(k > numText.length()){
            return number;
        }

        String prefix;
        prefix = numText.substring(0,k);

        return Long.valueOf(prefix);

    }
}
