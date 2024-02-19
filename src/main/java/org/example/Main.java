package org.example;

import java.io.IOException;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        Path init = new Init().getOperatingSystemDefaultPath();
        FileOperations fileOperations = new FileOperations();
        fileOperations.createNewBookDir(init , "newdirectory");
        fileOperations.createNewFile(init, "newdirectory", "newfilename.txt");
       /* while(true){
            System.out.println("please set path to your files");
             Scanner scanner = new Scanner(System.in);
             String input = scanner.nextLine();
             final PathVariable p = new PathVariable(input);
            System.out.println(p.getPathVariable());
        }*/
    }
}