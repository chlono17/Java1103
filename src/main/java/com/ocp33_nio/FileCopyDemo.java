package com.ocp33_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("src\\main\\java\\com\\ocp33_nio\\a.txt");
        Path target = Paths.get("src\\main\\java\\com\\ocp33_nio\\b.txt");
//Files.copy(source, target); 如果目的端存在則可不加  StandardCopyOption.REPLACE_EXISTING
Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);// 目的點已被建立則須加
        System.out.println("Copy ok");
    }
}
