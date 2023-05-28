package com.bridgelabz;

import java.io.File;
import java.io.IOException;

public class PayrollService {

    public static void main(String[] args) {
        System.out.println("Payroll Service");



        //file check

        File file = new File("sample.txt");
        System.out.println("Does file exist? " + file.exists());

        // Delete file and check if it doesn't exist
        if (file.exists()) {
            boolean deleted = file.delete();
            System.out.println("File deleted: " + deleted);
        }

        System.out.println("Does file exist now? " + file.exists());

        // Create directory
        File directory = new File("mydir");
        boolean dirCreated = directory.mkdir();
        System.out.println("Directory created: " + dirCreated);

        // Create empty file
        File emptyFile = new File(directory, "empty.txt");
        try {
            boolean created = emptyFile.createNewFile();
            System.out.println("Empty file created: " + created);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // List files and directories
        File rootDir = new File(".");
        File[] files = rootDir.listFiles();
        if (files != null) {
            System.out.println("\nFiles:");
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                }
            }

            System.out.println("\nDirectories:");
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                }
            }

            System.out.println("\nFiles with extension '.txt':");
            for (File f : files) {
                if (f.isFile() && f.getName().endsWith(".txt")) {
                    System.out.println(f.getName());

                }
            }
        }
    }
}
