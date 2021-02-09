package com.martynenkoigor.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/Users/igor/projects/JavaCore";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("iml");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}


