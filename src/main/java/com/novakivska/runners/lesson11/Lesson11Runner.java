package com.novakivska.runners.lesson11;

import java.io.File;

/**
 * Created by Tas_ka on 4/21/2017.
 */
public class Lesson11Runner {

    public static void main (String[] args){

        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "resoucers\\userInputs\\Welcome.csv";
        String osName = System.getProperty("os.name");
        String testProperties = "test.properties";
        String testPropertiesWindowsStyle = "src\\test\\recoucers\\userInputs";
        String testPropertiesLinuxStyle = "src/test/recoucers/userInputs";

File someFile = new File(currentDir, windowsStyle);
        System.out.println(someFile.getAbsolutePath());
        System.out.println(currentDir);
        System.out.println(osName);

        if(osName.toLowerCase().contains("win")){
            File newFile = new File(currentDir, testPropertiesWindowsStyle);
            System.out.println(newFile.getAbsolutePath());

        }else{
            File newFile = new File(currentDir, testPropertiesLinuxStyle);
            System.out.println(newFile.getAbsolutePath());
        }
    }
}
