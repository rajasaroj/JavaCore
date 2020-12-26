package org.programmingQuestions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        //Files.lines(Paths.get("file.txt")).forEach(System.out::println);

        String[] at = {"raja", "soham", "subham"};

        try(PrintWriter pwd = new PrintWriter(Files.newBufferedWriter(Paths.get("newFile.txt")))) {
            Stream.of(at).forEach(pwd::println);
        }

    }
}
