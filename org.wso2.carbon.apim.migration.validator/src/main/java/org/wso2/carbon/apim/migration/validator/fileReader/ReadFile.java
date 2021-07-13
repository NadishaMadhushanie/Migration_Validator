package org.wso2.carbon.apim.migration.validator.fileReader;

import java.io.*;
import java.util.*;
/*
public class ReadFile {
    public static String[] readFile()
    {
        final Log log = LogFactory.getLog(ReadFile.class);

        String[] count = new String[1000];
        int i=0;

        try {
            File myObj = new File("/usr/local/test/output.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                count[i] = myReader.nextLine();
                i=i+1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return count;
    }

}*/
public class ReadFile {
    public static String[][] readFile() {
        String count[][] = new String[100][100];

        try (BufferedReader in = new BufferedReader(new FileReader("/usr/local/test/output.txt"))) {
            String str;

            int i = 0;
            int j = 0;
            while ((str = in.readLine()) != null) {
                String[] tokens = str.split(",");

                count[i][j] = tokens[0];
                count[i][j + 1] = tokens[1];
                i++;
            }
        } catch (IOException e) {
            System.out.println("File Read Error");
        }

        return count;
    }
}
