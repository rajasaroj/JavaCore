package com.java8features;


import java.util.*;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}

public class EmployeeOffice {

    List<Employee> employeeList = new ArrayList<>();

    EmployeeOffice() {
        employeeList.add(new Employee("Jake", 25));
        employeeList.add(new Employee("Jake", 60));
        employeeList.add(new Employee("Mary", 18));
        employeeList.add(new Employee("Mary", 30));
        employeeList.add(new Employee("Jake", 28));
        employeeList.add(new Employee("bertha", 25));
        employeeList.add(new Employee("bertha", 65));
        employeeList.add(new Employee("bertha", 50));
    }

    public static void main(String[] args) {

        EmployeeOffice employeeOffice = new EmployeeOffice();


        // Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names.(Java 8 APIs only)
        //List<String> at =  employeeOffice.employeeList.stream().filter(x -> x.getAge() > 20).map(Employee::getName).collect(Collectors.toList());
        //System.out.println(at);

        // 17) Given the list of employees, count number of employees with age 25?
        //Long Count = employeeOffice.employeeList.stream().filter(x -> x.getAge() == 25).count();
        //System.out.println(Count);

        //List<Employee> e = employeeOffice.employeeList.stream().filter(x -> x.getName().contentEquals("Mary")).collect(Collectors.toList());
        //System.out.println(e);

        // 19)Given a list of employee, find maximum age of employee?
        //List<Integer> at = employeeOffice.employeeList.stream().mapToInt(x-> x.getAge()).boxed().collect(Collectors.toList());
        //at.sort(Comparator.reverseOrder());
        //System.out.println(at);


        // 20) Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
        //employeeOffice.employeeList.sort( (e1, e2) -> - e1.getAge() + e2.getAge() );
        //employeeOffice.employeeList.forEach(System.out::println);

        //21) Join the all employee names with “,” using java 8?
       // List<String>  a  = employeeOffice.employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        //String names = String.join(",", a);
        //System.out.println(names);


        //22) Given the list of employee, group them by employee name?
        //Map<String, List<Employee>> at = employeeOffice.employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        //at.forEach((x,y) -> System.out.println(x + " => " + y.toString()));

        //26) Given a list of numbers, square them and filter the numbers which are greater 10000 and then find average of them.( Java 8 APIs only)
        //Double a = employeeOffice.employeeList.stream().collect(Collectors.averagingInt(Employee::getAge));
        //System.out.println(a);
        //or you can use
        //employeeOffice.employeeList.stream().mapToInt(Employee::getAge).average();

        //employeeOffice.employeeList.forEach();

    }



}
