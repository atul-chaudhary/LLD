package com.atul.fileSystem;

import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> objs;

    public Directory(String name, List<FileSystem> objs) {
        this.name = name;
        this.objs = objs;
    }

    @Override
    public void ls() {
        System.out.println("directory name :" + name);
        for (FileSystem it : objs) {
            it.ls();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileSystem> getObjs() {
        return objs;
    }

    public void setObjs(List<FileSystem> objs) {
        this.objs = objs;
    }
}
