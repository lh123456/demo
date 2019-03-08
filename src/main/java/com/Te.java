package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Te {
    public static void main(String[] args) {
        File file = new File(Te.class.getClassLoader().getResource("").getPath()+File.separator+"li.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
