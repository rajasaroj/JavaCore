package org;

import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Student implements Comparable {

    private String name;
    private String subject;
    private int marks;

    Student() {
    }

    public Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class StreamsBasic {

    static int marks = 0;

    static Map<Integer, Student> hashmap = new HashMap<>();

    public static void main(String[] args) throws IOException {


        int[] a = IntStream.range(0, 10).filter(x -> x % 2 == 0).toArray();

        for (int aa : a) {
            System.out.println(aa);
        }

        List<String> at = new ArrayList<String>();
        at.add("a");
        at.add("b");
        at.add("c");
        at.add("d");

        Function ex = (x) -> {
            String esd = x + "1";
            return esd;
        };


        Function bsd = (x) -> {
            //String esd = x;
            return x;
        };


        Map asdf = (Map) at.stream().collect(Collectors.toMap(ex, bsd));
        System.out.println(asdf);


        Supplier<Student> supplier = () -> {
            Student std = new Student();
            std.setMarks(marks++ * 100);
            std.setName("aa" + marks);
            std.setSubject("English");
            return std;
        };

        Supplier<Student> supplierMaths = () -> {
            Student std = new Student();
            std.setMarks(marks++ * 100);
            std.setName("bb" + marks);
            std.setSubject("Maths");
            return std;
        };

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            students.add(supplier.get());
            hashmap.put(i, supplier.get());
        }

        for (int i = 0; i < 5; i++) {
            students.add(supplierMaths.get());
            hashmap.put(i + 5, supplierMaths.get());
        }

        Map<String, List<Student>> stMap = students.stream().collect(Collectors.groupingBy(Student::getSubject));

        students.stream().collect(Collectors.groupingBy(x -> x.getSubject())).forEach((x, y) -> System.out.println(x + y));

        //streamOFStudentsArray().forEach(System.out::println);

        streamMap();
        streamfilter();
        whenFindFirst_thenGetFirstStudentInStream();
        flatEarthersMap();
        peekapeek();
        shortCiruitOperation();
        sortByName();
        distinction();
        matche();


    }

    public static Consumer print = (x) -> System.out.println(x);

    public static Student[] arrayOfStudents = {

            new Student("Raja", "Math", 1),
            new Student("Soham", "Science", 23),
            new Student("Shubham", "Physic", 45),

    };

    // 1) Create Stream of Student...
    public static Stream<? extends Student> streamOFStudentsArray() {
        return Stream.of(arrayOfStudents);
    }

    // 2) Create Stream with builder.
    public static Stream<? extends Student> streamBuilder() {
        Stream.Builder<Student> studentStreamBuilder = Stream.builder();
        studentStreamBuilder.accept(arrayOfStudents[0]);
        studentStreamBuilder.accept(arrayOfStudents[1]);
        studentStreamBuilder.accept(arrayOfStudents[2]);
        return studentStreamBuilder.build();
    }

    // 3) transform data using.
    public static void streamMap() {
        IntStream.range(0, 5)
                .mapToObj(hashmap::get)
                .mapToInt(x -> x.getMarks())
                .forEach(System.out::println);
    }

    // 4) Collect convert to list
    public static void streamlist() {
        hashmap.values().stream().collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // 5) filter
    public static void streamfilter() {
        IntStream.range(0, 10)
                .mapToObj(hashmap::get)
                .filter(x -> x.getSubject().equals("Maths"))
                .forEach(System.out::println);
    }

    // 6) FindFirst an Optional for the first entry in the stream
    public static void whenFindFirst_thenGetFirstStudentInStream() {
        Student a = IntStream.range(0, 10)
                .mapToObj(hashmap::get)
                .filter(x -> x.getMarks() > 1000)
                .findFirst()
                .orElse(null);

        System.out.println(a);
    }

    // 7) toArray
    public static void toArrayConverter() {
        Student[] studentarray = hashmap.values().stream().toArray(Student[]::new);
    }

    public static void flatEarthersMap() {

        Stream.of(arrayOfStudents, arrayOfStudents, arrayOfStudents)
                //.flatMap(x -> Arrays.stream(x.clone()))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // 8) peek its is a non terminal operation if i want to perform some changes in object and the perform filter or groupby or map
    // i will be complete abled to do it since peek is the intermendiate operation which behave similar to foreach
    public static void peekapeek() {
        Stream.of(arrayOfStudents, arrayOfStudents)
                .flatMap(x -> Arrays.stream(x.clone()))
                .peek(x -> x.setMarks(x.getMarks() + 112))
                .filter(x -> x.getMarks() > 200)
                .forEach(System.out::println);
    }

    // 9) Some operations are deemed short-circuiting operations.
    // Short-circuiting operations allow computations on infinite streams to complete in finite time:
    public static void shortCiruitOperation() {
        Stream<Integer> stream = IntStream.iterate(1, (i) -> i * 2).boxed();
        stream.skip(3)
                .limit(5)
                .forEach(System.out::println);
    }

    // Sorting with inbuild Comparator Api
    public static void sortByName() {
        Stream.of(arrayOfStudents)
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .forEach(System.out::println);
    }

    // Min and Max
    public static void mini() {
        Stream.of(arrayOfStudents)
                .min(Comparator.comparing(Student::getMarks))
                .orElse(null);

    }

    public static void maxi() {
        Stream.of(arrayOfStudents)
                .max(Comparator.comparing(Student::getMarks))
                .orElse(null);
    }

    // Distinct
    public static void distinction() {

        List at = Arrays.asList(2, 4, 4, 6, 8, 8, 10);

        at.stream().distinct().forEach(print);
    }

    // allmatch , anymatch, nonematch
    public static void matche() {

        List<Integer> bt = Arrays.asList(2, 4, 5, 6, 8, 10);

        //bt.stream().allMatch(x -> x%2 ==0);
        boolean ans = bt.stream().mapToInt(x -> x)
                .allMatch(x -> x % 2 == 0);
        System.out.println(ans);

        boolean bns = bt.stream()
                .anyMatch(x -> x % 2 == 0);

        System.out.println(bns);

        boolean cns = bt.stream().noneMatch(x -> x % 3 == 0);
        System.out.println(cns);
    }


}
