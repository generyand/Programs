package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BuffereTest {
    
    public static void main(String[] args) throws Exception{

        // ArrayList<Integer> number = new ArrayList<>();
        
        // String[] message = {"Never gonna give you up", "Never gonna let you down", "hehe"};

        // BufferedWriter writer = new BufferedWriter(new FileWriter("hehe.txt"));

        // for (String dialog : message) {
        //     writer.write(dialog + "\n");
        // }
        // writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("hehe.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }

}
