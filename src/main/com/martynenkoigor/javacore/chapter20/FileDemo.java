package com.martynenkoigor.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT/");
        p("File name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("AbsolutePath: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "!exists");
        p(f1.canWrite() ? "write" : "!write");
        p(f1.canRead() ? "read" : "!read");
        p(f1.isDirectory() ? "directory" : "!directory");
        p(f1.isFile() ? "File" : "!File");
        p(f1.isAbsolute() ? "absolute" : "!absolute");
        p("Last Modified: " + f1.lastModified());
        p("Size: " + f1.length() + "bytes");
    }
}
