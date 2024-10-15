package net.salesianosLaCuesta.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class fileManager {
    public static void readAndWrite() {
        final String ROUTE = "./output/resultFiles/upgradedPhrase";
        ArrayList<String> phrases = new ArrayList<>();

        File file = new File("./output/resultFiles");
        int fileCount = file.list().length;
        for (int i = 0; i < fileCount; i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(ROUTE+i+".txt", StandardCharsets.UTF_8))){
                phrases.add(reader.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try (FileWriter writer = new FileWriter("usersIMC.txt")){
            for(String str: phrases) {
            writer.write(str + System.lineSeparator());
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
