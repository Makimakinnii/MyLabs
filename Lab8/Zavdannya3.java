import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Zavdannya3 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
            for (String line : lines)// for each operator
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            RandomAccessFile file = new RandomAccessFile("example.txt.", "rw");
            file.seek(file.length()); 
            file.writeBytes("\nAdd new line to the file");
            file.writeBytes("\nAdd new line to the file");
            file.writeBytes("\nAdd new line to the file");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
