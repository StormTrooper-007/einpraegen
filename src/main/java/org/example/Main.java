package org.example;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("please set path to your files");
             Scanner scanner = new Scanner(System.in);
             String input = scanner.nextLine();
             final PathVariable p = new PathVariable(input);
            System.out.println(p.getPathVariable());
        }
    }
}