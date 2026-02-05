//package SDEV200 Assignments.M4.Exercise21_03;
//C:\Users\ekfou\Desktop\JavaClass\SDEV200 Assignments\M4\Exercise21_03\Welcome_21_03.java
import java.util.*;
import java.io.*;

public class Exercise21_03 {
  public static void main(String[] args) throws Exception {  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Java source file: ");
    String filename = input.nextLine();

    File file = new File(filename);
    if (file.exists()) {
      System.out.println("The number of keywords in " + filename 
        + " is " + countKeywords(file));
    }
    else {
      System.out.println("File " + filename + " does not exist");
    } 
    input.close();   
  }

  public static int countKeywords(File file) throws Exception {  
    // Array of all Java keywords + true, false and null
    String[] keywordString = {"abstract", "assert", "boolean", 
      "break", "byte", "case", "catch", "char", "class", "const",
      "continue", "default", "do", "double", "else", "enum",
      "extends", "for", "final", "finally", "float", "goto",
      "if", "implements", "import", "instanceof", "int", 
      "interface", "long", "native", "new", "package", "private",
      "protected", "public", "return", "short", "static", 
      "strictfp", "super", "switch", "synchronized", "this",
      "throw", "throws", "transient", "try", "void", "volatile",
      "while", "true", "false", "null"};
    
    Set<String> keywordSet = 
      new HashSet<>(Arrays.asList(keywordString));
    int count = 0;    

    Scanner input = new Scanner(file);
    boolean skip = false;
    while (input.hasNext()) {
      String word = input.nextLine().trim();
      //take entire line, check if its a comment,
      if(word.contains("/*")){
        //if the line begins a multiline comment, skip until the comment ends
        skip = true;
      }
      else if(word.startsWith("//")){
        //if line is a comment, do nothing
      }else{
        //System.out.println("test");
        String[] Strings = word.split("\"");
        boolean inString = false;
        for(String s: Strings){
          //the first section of the line will not contain a string
          //if there's a quotation mark, skip that section until the next quotation mark
          if(!inString & !skip){
            //split the section up into words and check for keywords
            String[] words = s.split(" ");
            for(String eachword: words){
              //if there's a keyword, increase the count
              if(keywordSet.contains(eachword)){
                count++;
              }
            }
          }
          //reverse the 'inString' variable at the end of the loop. If there are quotes in the line, every other section will be a string
          inString = !inString;
        }
      }
      //Stop skipping at the end of a multiline comment
      if(word.contains("*/")){
        skip = false;
      }
    }
    input.close();
    return count;
  }
}