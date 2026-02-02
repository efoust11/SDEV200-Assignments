import java.util.Scanner;
import java.io.*;

public class Exercise20_11 {
    //for each character in the source code (read as a string from text file)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String filename = input.nextLine();

        //File file = new File(filename);
        //Scanner content = new Scanner(file);
        //String content = "test ( testing )"; // replace with content from an actual file later?

    //check for (, {, or [. if it finds one, set that to a variable
    //for(String c: content){
    //    String opening = "";
    //    if(c == "(" | c == "{" | c == "["){
    //        opening = c;
    //    }
    //    if(opening == "("){
    //        if(c == "]" | c == "}"){
    //            System.out.print("Error, mis-matched pair");
    //            break;
    //        }
    //        if(c == ")"){
    //            opening = "";
    //        }
    //    }
    //}
    //continue checking the following characters.
        //if the match is found, look for next opening
        //if a non bracket character is found, keep looking for closing
        //if a non match is found, break loop

        input.close();
    }
}
