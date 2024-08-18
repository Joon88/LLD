package me.sajid.compositeDP.fileSystems;

public class File implements FileSystem {
    public String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("/" + name);
    }
}
