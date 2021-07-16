package org.wso2.carbon.apim.migration.validator.fileReader;

import java.io.*;
import java.util.*;


public class ReadFile {
    public static Map<String, String> readFile(){

        String count[][] = new String[1000][1000];
        Map<String, String> map = new HashMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader("/usr/local/test/output.txt"))) {
            String str;

            int i = 0;
            int j = 0;
            while ((str = in.readLine()) != null) {
                String[] tokens = str.split(",");

                count[i][j] = tokens[0];
                count[i][j + 1] = tokens[1];

                map.put(count[i][j],count[i][j + 1]);
                i++;

            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }

        return map;
    }
}