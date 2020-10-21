package org.designPattern.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Component
interface Employee {
    void showEmployeeDetails();
}

// Leaf
class Developer implements Employee {
    String name;
    String id;

    public Developer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this);
    }
}

// Leaf
class Manager implements Employee {
    String name;
    String id;

    public Manager(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


    @Override
    public void showEmployeeDetails() {
        System.out.println(this);
    }
}

// Composite
class CompanyDirectory implements Employee {

    List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee e: list) {
            e.showEmployeeDetails();
        }
    }
}

public class CompositePatternDriver {

    public static void main(String[] args) {
        Developer d1 = new Developer("Dev1", "1");
        Developer d2 = new Developer("Dev2", "2");
        Developer d3 = new Developer("Dev3", "3");

        CompanyDirectory devDir  = new CompanyDirectory();
        devDir.addEmployee(d1);
        devDir.addEmployee(d2);
        devDir.addEmployee(d3);


        Manager m1 = new Manager("man1", "201");
        Manager m2 = new Manager("man2", "202");
        Manager m3 = new Manager("man3", "203");

        CompanyDirectory manDir  = new CompanyDirectory();
        manDir.addEmployee(m1);
        manDir.addEmployee(m2);
        manDir.addEmployee(m3);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(devDir);
        companyDirectory.addEmployee(manDir);

        companyDirectory.showEmployeeDetails();
    }

}
