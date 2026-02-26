package com.example;

import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // Guava example
        ImmutableList<String> fruits =
                ImmutableList.of("Apple", "Banana", "Orange");

        System.out.println("Fruits list: " + fruits);

        // Apache Commons IO example
        try {
            File file = new File("example.txt");
            FileUtils.writeStringToFile(file, "Hello Maven!", "UTF-8");

            System.out.println("File written successfully: "
                    + file.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
