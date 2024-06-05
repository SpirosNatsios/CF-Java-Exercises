package gr.aueb.cf.ch9;

import java.io.*;

public class LocationsApp {

    public static void main(String[] args) {
        File inFd = new File("C:\\Users\\spiro\\Desktop\\Coding-Factory6\\java\\files\\locations.txt");
        File outFd = new File("C:\\Users\\spiro\\Desktop\\Coding-Factory6\\java\\files\\new-locations2.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inFd));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFd))) {

            String line;
            if ((line = reader.readLine()) != null) {
                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split(",");
                    String formattedLine = String.format("location: '%s', latitude: %s, longitude: %s", tokens[0], tokens[1], tokens[2]);
                    writer.write(formattedLine);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}