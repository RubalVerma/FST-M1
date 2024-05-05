package Activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {

    public static void main(String[] args) throws IOException {

        File file = new File("Documents/NewFile.txt");
        boolean fStatus = file.createNewFile();
        if(fStatus)
        {
            System.out.println("File created successfully");
        }else
        {
            System.out.println("File already exists at this path");
        }

        File fileUtil = FileUtils.getFile("Documents/NewFile.txt");

    }

}
