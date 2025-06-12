package File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Day4Task5 {
    public static void main(String[] args) {
  
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter fr = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            int total = 0;
            int i = 0;

            while ((line = br.readLine()) != null) {
                String[] a = line.split(" ");
                String name = a[0];
                int mark = Integer.parseInt(a[1]);

                fr.write(name + "  : " + mark + " \n");
                total = total + mark;
                i = i + 1;
            }

            if (i > 0) {
                double avg = (double) total / i;
                fr.write("Total class mark = " + total + "\n");
                fr.write("Average percentage (%)= " + avg );
            }

            br.close();
            fr.close();
            System.out.println("Check in output text document file.....");

        } catch (Exception e) {
            System.out.println("File is not exist " + e);                                  
        }
    }
}
