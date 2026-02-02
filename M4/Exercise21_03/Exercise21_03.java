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
      System.out.println("The number of words in " + filename 
        + " that are not keywords is " + countKeywords(file));
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

    while (input.hasNext()) {
      String word = input.next();
      if (!keywordSet.contains(word)){
        count++;
      } // Test if word is a keyword
    }
    input.close();
    return count;
  }
}