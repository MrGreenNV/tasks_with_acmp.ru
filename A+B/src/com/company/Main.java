package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("INPUT.TXT"));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))){
            String[] splitStr = fileReader.readLine().split(" ");
            int i = Integer.parseInt(splitStr[0]) + Integer.parseInt(splitStr[1]);
            System.out.println(i);
            fileWriter.write(String.valueOf(i));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
