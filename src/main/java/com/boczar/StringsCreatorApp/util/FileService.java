package com.boczar.StringsCreatorApp.util;

import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        for (String s : strings) {
            writer.write(s + "\n");

        }
        writer.close();

    }
}


