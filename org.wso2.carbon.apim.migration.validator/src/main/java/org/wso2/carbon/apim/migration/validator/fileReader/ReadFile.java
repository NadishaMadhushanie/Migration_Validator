package org.wso2.carbon.apim.migration.validator.fileReader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

}
