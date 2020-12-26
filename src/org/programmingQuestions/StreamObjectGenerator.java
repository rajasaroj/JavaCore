package org.programmingQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StudentOfTheYear{
    int roll;

    public StudentOfTheYear() {}
    public StudentOfTheYear(int roll) {
        this.roll = roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentOfTheYear{" +
                "roll=" + roll +
                '}';
    }
}

public class StreamObjectGenerator {

    public static java.util.function.Consumer print = System.out::println;
    static int c = 0;

    public static void main(String[] args) {
        IntStream.iterate(1, x->x)
                .limit(10)
                .boxed()
                .forEach(print);


        IntStream.range(0, 5)
                 .boxed()
                 .map(y -> Stream.generate(StudentOfTheYear::new)
                 .limit(10)
                 .skip(3)
                 .peek(x -> x.setRoll(y))
                 .collect(Collectors.toList())
                                   .get(y))
                                          .collect(Collectors.toList())
                                          .forEach(print);
        int[] a = {1, 2 ,3};

        a = Arrays.stream(a).toArray();
    }
}
