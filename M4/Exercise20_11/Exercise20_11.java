import java.util.*;
import java.io.*;
//Test file: C:\Users\ekfou\Desktop\JavaClass\SDEV200 Assignments\M4\Exercise20_11\Welcome20_11.java
public class Exercise20_11 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename:");
        String filename = input.nextLine();

        File file = new File(filename);

        if (file.exists()){
            if(checkGrouping(file)){
                System.out.println("Correct grouping pairs");
            } else{
                System.out.println("Incorrect grouping pairs");
            }
        } 
    
        input.close();
    }

    public static boolean checkGrouping(File file) throws Exception{
        Scanner content = new Scanner(file);
        String opening = "";
        List<Character> arrayList = new ArrayList<>();

        //convert file to array of characters
        while(content.hasNext()){
            char[] chararcters = content.next().toCharArray();
            for(char c: chararcters){
                arrayList.add(c);
            }
        }
        for(char i: arrayList){
            //convert each character to a string
            String c = Character.toString(i);
             //check for (, {, or [. if it finds one, set that to a variable        
            if(c.equals("(") || c.equals("{") || c.equals("[")){
                opening = c;
            }
        //if the match is found, look for next  (, {, or [
        //if a non bracket character is found, keep looking for closing character
        //if a non match is found, break loop
            if(opening.equals("(")){
                if(c.equals("]") || c.equals("}")){
                    System.out.print("Error, mis-matched pair");
                    content.close();
                    return false;
                }
                if(c.equals(")")){
                    opening = "";
                }
            }
            if(opening.equals("[")){
                if(c.equals(")") || c.equals("}")){
                    System.out.print("Error, mis-matched pair");
                    content.close();
                    return false;
                }
                if(c.equals("]")){
                    opening = "";
                }
            }
            if(opening.equals("{")){
                if(c.equals("]") || c.equals(")")){
                    content.close();
                    return false;
                }
                if(c.equals("}")){
                    opening = "";
                }
            }
        }
        content.close();
        return true;
    }
}
    

