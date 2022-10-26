package com.boczar.StringsCreatorApp.util;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

@Service
public class FileService {

    public void saveAllStringsToAFile(Set<String> strings) throws IOException {
        File newFile;
        int index = 1;
        String parent = "C:\\GeneratedStrings";
        String name = "YourStrings";
        String extension = ".txt";

        while ((newFile = new File(parent, name + index + extension)).exists()) {
            index++;
        }
        newFile.createNewFile();

        // file is created at this point
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));

        for(String s: strings){
            writer.write(s + "\n");

        }
        writer.close();

    }

    public static void main(String[] args) throws IOException {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("mleko");
        stringSet.add("mlek32o");
        stringSet.add("mlek3232o");

        FileService fs = new FileService();
        fs.saveAllStringsToAFile(stringSet);

    }
}


