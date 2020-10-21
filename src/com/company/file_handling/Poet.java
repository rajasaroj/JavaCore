package com.company.file_handling;

import java.io.*;
import java.util.stream.Stream;

public class Poet {

    public static void main(String[] args) throws IOException {

        // Specify File Name with Append Mode (need compelete path)
        FileWriter fwt = new FileWriter("C:\\OneDrive\\OneDrive - MORNINGSTAR INC\\Deep Learning Natural Language Processing TF2\\Poet.txt", true);
        BufferedWriter bsf = new BufferedWriter(fwt);
        bsf.newLine();
        bsf.write("Hello Poet you there??");
        bsf.close();

        // Specify File Name (need compelete path)
        FileReader rwt = new FileReader("C:\\OneDrive\\OneDrive - MORNINGSTAR INC\\Deep Learning Natural Language Processing TF2\\Poet.txt");
        BufferedReader rsf = new BufferedReader(rwt);

        // Print all the data which was present in file using streams
        Stream<String>  stringStream = rsf.lines();
        stringStream.forEach(x -> System.out.println(x));
        rsf.close();
    }
}
