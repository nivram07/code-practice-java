package code.practice.java.problem;

import java.util.Scanner;
import java.io.FileReader;

public class FileOperationsExample {

    public static void main(String args[]) throws Exception {
      Scanner in = new Scanner(new FileReader("sample.txt"));
      while (in.hasNext()) {
        System.out.print(in.next() + " ");
      }
      in.close();
    }
}
