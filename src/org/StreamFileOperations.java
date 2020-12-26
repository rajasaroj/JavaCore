package org;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileOperations extends StreamsBasic {

    public static void main(String[] args) throws IOException {
        pf();
        filereader();
    }



    // File Write Operation Using Streams
    public static void pf() throws IOException {

        String[] words = {
                "hello",
                "refer",
                "world",
                "level"
        };

        try (PrintWriter pr = new PrintWriter(Files.newBufferedWriter(Paths.get("file.txt")))) {
            Stream.of(words)
                    .forEach(pr::println);
        }
    }

    // File Read Operation Using Streams
    public static void filereader() throws IOException {

        Files.lines(Paths.get("file.txt"))
                .filter(x -> x.compareToIgnoreCase( new StringBuilder(x).reverse().toString()) == 0 )
                .forEach(print);
    }
}
