package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperations {
    private final Logger logger = LoggerFactory.getLogger(FileOperations.class);

    public void createNewBookDir(Path path, String dirName){
        try {
            Files.createDirectory(Path.of(String.valueOf(path), dirName));
        }catch(IOException ex){
            logger.info("Could not create directory");
            System.out.println(ex.getMessage());
        }
    }

    public void createNewFile(Path path, String bookName, String fileName) throws IOException {
        try{
            Files.createFile(Path.of(String.valueOf(path), bookName, fileName));
        }catch(IOException ex){
            logger.info("\u001B[34m"+"Could not create new file"+"\u001B[34m");
            System.out.println(ex.getMessage());
        }
    }
    public void writeNotes(Path target) throws IOException{
        String value = null;
        try(var in = new BufferedReader(new InputStreamReader(System.in))){
            do{
                value = in.readLine();
            }while(!value.equals("q"));

            Files.writeString(target, value);
        }
    }
}
