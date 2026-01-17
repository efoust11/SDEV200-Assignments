//exercise 8.29
// module 1 assignment 3
import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args){
        //Start input
        Scanner input = new Scanner(System.in);

        //Create blank multi dimensional arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        //Input first array
        System.out.print("Enter m1: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3;j++){
                m1[i][j] = input.nextInt();
            }
        }

        //Input second array
        System.out.print("Enter m2: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3;j++){
                m2[i][j] = input.nextInt();
            }
        }
        
        //Check if arrays are identical
        if(equals(m1, m2)){
            System.out.println("The two arrays are identical");
        }else{
            System.out.println("The two arrays are not identical");
        }

        //close input
        input.close();


    }
    
    public static boolean equals(int[][] m1, int[][] m2) {
        for(int row = 0; row <= 2; row ++){
            for(int column = 0; column <= 2; column++){
                if(m1[row][column] != m2[row][column]){
                    return false;
                }
            }
        }
        return true;
   }

}