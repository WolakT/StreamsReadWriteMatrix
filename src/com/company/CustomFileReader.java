package com.company;

import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public class CustomFileReader {
    FileInputStream fis = null;
    String content = null;
    String [][] splitCont;
    int counter = 0;
    private int[][] array;
    public CustomFileReader(String path){
        try{
        fis = new FileInputStream( path);

            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String first = br.readLine();
            String[] sParse = first.split(" ");
            int dim1 = Integer.parseInt(sParse[0]);
            int dim2 = Integer.parseInt(sParse[1]);
            splitCont = new String[dim1][dim2];
            while ((content = br.readLine())!=null){

                splitCont[counter] = content.split(";");
                counter ++;
            }
            array = new int[dim1][dim2];
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Integer.parseInt(splitCont[i][j]);
                }
            }
        }catch (FileNotFoundException e ){

        }catch(IOException e){

        }
    }

    public int[][] getArray(){return array;}
}
