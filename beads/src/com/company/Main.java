package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("INPUT.TXT"));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))){
            int n = Integer.parseInt(fileReader.readLine());
            fileWriter.write(String.valueOf(++n));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
