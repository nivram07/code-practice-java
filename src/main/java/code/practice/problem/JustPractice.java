package code.practice.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;


public class JustPractice {

    public static void main(String args[]) {
        File sampleFile = new File("sample.txt");
        byte[] fileArray;
        try {

            fileArray = Files.readAllBytes(sampleFile.toPath());
            System.out.println(new String(fileArray));

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try (Scanner input = new Scanner(new BufferedReader(new FileReader("sample.txt")))){
            while (input.hasNext()) {
                String currentLine = input.nextLine();
                System.out.println("::" + currentLine);
            }
        } catch (FileNotFoundException fileNotFoundEx) {
            fileNotFoundEx.printStackTrace();
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("new.txt", true));
            writer.write("Added this");
            writer.close();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

        listExample();

    }

    public static void listExample() {
        List<Integer> list1 = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        for (int i = 0; i < list1.size(); i++) {
            if (i == 2) list1.remove(i);
        }

        System.out.format("%s\n", Arrays.toString(list1.toArray()));
    }
}
