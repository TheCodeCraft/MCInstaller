package me.reddev;

import java.io.File;

public class FileUtils {

    public static void createFolder(String name) {
        File file = new File(name);
        if(!file.exists()) {
            file.mkdirs();
        }
    }

}
