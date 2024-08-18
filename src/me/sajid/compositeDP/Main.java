package me.sajid.compositeDP;

import me.sajid.compositeDP.fileSystems.Directory;
import me.sajid.compositeDP.fileSystems.File;
import me.sajid.compositeDP.fileSystems.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");

        File f1 = new File("f1");
        File f2 = new File("f2");
        File f3 = new File("f3");

        System.out.println("ls f1:");
        f1.ls();

        System.out.println("ls d1:");
        d1.ls();

        d1.addFileSystem(d2);
        d1.addFileSystem(f1);
        d2.addFileSystem(f2);
        d2.addFileSystem(f3);

        System.out.println("ls d1");
        d1.ls();
    }
}
