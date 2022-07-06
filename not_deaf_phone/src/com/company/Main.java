package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("INPUT.TXT"));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            while (fileReader.ready()) {
                int num = fileReader.read();
                fileWriter.write(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
