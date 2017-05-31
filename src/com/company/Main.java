package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        int[] [] array = {
                {3,4,6},
                {9,8,3},
                {37,8,8},
                {3,2,1},
        };





	CustomFileWriter cfw = new CustomFileWriter(array);
        CustomFileReader cfr = new CustomFileReader("fileWriter.txt");
        int[][] arr = cfr.getArray();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }


        try {
            Files.lines(Paths.get("fileWriter.txt"))
                    .forEach(line -> System.out.println(line));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
