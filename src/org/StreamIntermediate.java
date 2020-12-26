package org;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediate extends StreamsBasic {

    public static void main(String[] args) {
        sum_avg();
        reducer();
        collectAdv();
        stats();
        partition();
        gorupy();
        mapping();
        //gen();
        iter();
    }


    // Java Stream Specializations
    // From what we discussed so far, Stream is a stream of object references.
    // However, there are also the IntStream, LongStream, and DoubleStream – which are primitive specializations for int, long and double respectively.
    // These are quite convenient when dealing with a lot of numerical primitives


    // Specialized Operations
    public static void sum_avg() {
        double a = Stream.of(StreamsBasic.arrayOfStudents)
                .mapToInt(Student::getMarks)
                .average().getAsDouble();
        System.out.println(a);

        double b = Stream.of(StreamsBasic.arrayOfStudents)
                .mapToInt(Student::getMarks)
                .sum();
        System.out.println(b);
    }

    //Reduce
    public static void reducer() {
        int a = Stream.of(arrayOfStudents)
                .mapToInt(Student::getMarks)
                .reduce(0, Integer::sum);

        System.out.println(a);
    }

    // Advanced collect joining
    public static void collectAdv() {

        String sts = Stream.of(arrayOfStudents)
                .map(Student::getName)
                .collect(Collectors.joining(" - "));

        System.out.println(sts);

    }

    // Collect stats of a particular property from list of objects
    public static void stats() {
        IntSummaryStatistics d =  Stream.of(arrayOfStudents).collect(Collectors.summarizingInt(Student::getMarks));
        System.out.println(d.toString());
    }

    // partitioningBy
    // We can partition a stream into two – based on whether the elements satisfy certain criteria or not.
    // Let’s split our List of numerical data, into even and ods:
    public static void partition() {
        System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.partitioningBy(x -> x % 2==0)));
    }


    // Groupby
    public static void gorupy() {
        Stream.of(arrayOfStudents)
                .collect(Collectors.groupingBy(x -> x.getName())).forEach((x, y) -> System.out.println(x + " => " + y));
    }

    // Groupby with mapping
    // mapping allow you to map a specific value to key instead of whole object
    public static void mapping() {
        Map<String, List<Integer>> at =Stream.of(arrayOfStudents)
                .collect(Collectors.groupingBy(
                        Student::getName,
                        Collectors.mapping(Student::getMarks, Collectors.toList())
                ));
        System.out.println(at);
    }

    // Parallel Streams
    public  static  void parallel() {
        Stream.of(arrayOfStudents).parallel().peek(x -> x.setMarks(x.getMarks() * 123));
    }

    // Generate Stream Infinite
    public static void gen() {
        Stream.generate(Math::random)
                .skip(3)
                .limit(10)
                .forEach(print);

    }

    // iterate
    public static void iter() {
        IntStream.iterate(2, i -> i * 2 )
                .skip(3)
                .limit(16)
                .boxed()
                .forEach(print);
    }


    // Reducing
    // Accumaltors
    // Combiners
}
