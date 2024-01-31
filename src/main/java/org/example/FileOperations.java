package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperations {
    private final Logger logger = LoggerFactory.getLogger(FileOperations.class);

    public void createNewBookDir(String dirName){
        try {
            Files.createDirectory(Path.of(dirName));
        }catch(IOException ex){
            logger.info("Could not create directory");
            System.out.println(ex.getMessage());
        }
    }

    public void createNewFile(Path path, String bookName, String fileName){
        try{
            Files.createFile(Path.of(path + bookName +"/"+ fileName));
        }catch(IOException ex){
            logger.info("Could not create new file");
            System.out.println(ex.getMessage());
        }
    }
}
