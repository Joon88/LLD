package me.sajid.compositeDP.fileSystems;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private List<FileSystem> files;
    public String name;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fs) {
        if(fs == this)
            System.out.println("Can't add a directory to itself!");
        else
            files.add(fs);
    }

    @Override
    public void ls() {
        for(FileSystem fs: files) {
            fs.ls();
        }
    }
}
