package com.ocp33_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FindBug {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\ocp33_nio\\score.csv");
        Optional<String> opt = Files.readAllLines(path)
                .stream()
                .parallel()
                .peek(s -> System.out.println(s))
                .filter(s -> s.contains("bug"))
//              .sequential()
                .findFirst();
        System.out.println(opt.isPresent());
    }
    
}
