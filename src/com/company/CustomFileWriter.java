package com.company;

import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public class CustomFileWriter {

    public CustomFileWriter(int[][] array){
        FileOutputStream fos = null;

        try{
//        File file = new File("CustomFileWriter.txt");
//        FileWriter fileWriter = new FileWriter(file);
//       BufferedWriter bw = new BufferedWriter(fileWriter);
//        }catch (IOException e){
            fos = new FileOutputStream("fileWriter.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(String.valueOf(array.length));
            bw.write(" ");
            bw.write(String.valueOf(array[0].length));
            bw.write(10);
            bw.flush();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    bw.write(String.valueOf(array[i][j]));
                    bw.write(";");
                }
                bw.write(10);
            }
            bw.flush();
            bw.close();
        }catch (FileNotFoundException e){

        }catch (UnsupportedEncodingException e){

        }catch (IOException e){

        }

    }
}
