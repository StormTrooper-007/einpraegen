package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Init{
    private final String operatingSystemName = System.getProperty("os.name");
    private final String userName = System.getProperty("user.name");
    private Path appPath;
    public Path getOperatingSystemDefaultPath(){
        if(operatingSystemName.contains("Linux")){
            appPath = Paths.get("/home/"+userName);
        } else if (operatingSystemName.contains("Windows")) {
            appPath = Paths.get("C:\\Users\\"+userName);
        } else if (operatingSystemName.contains("Mac")) {
            appPath = Paths.get("/Users/"+userName);
        }
        return appPath;
    }

}
