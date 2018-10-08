package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class SortFiles {
    public void sortFiles() {
        File[] files = new File("C:/Users/a s u s/IdeaProjects/Test/SortF").listFiles();
        File folder = null;
        int dotPos = 0;
        String path = null;
        StringBuffer sb = null;

        for(File f: files){
            path = f.getName();
            dotPos = path.lastIndexOf('.') + 1;
            if(dotPos == 0) continue;

            String str = path.substring(dotPos);
            sb = new StringBuffer(str).insert(0,"SortF/");

            folder = new File(sb.toString());
            if (!folder.exists()) folder.mkdir();
            f.renameTo(new File(folder, path));

        }

    }
}
