package com.learncode.old;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        /* Find out the count of male and female employees present in the organization? */
        Map<String, Long> q1 = employeeList.stream().collect(Collectors.groupingBy(i -> i.getGender(), Collectors.counting()));
//        System.out.println(q1);

        /* Write a program to print the names of all departments in the organization. */
        List<String> q2 = employeeList.stream().map(item -> item.getDepartment()).distinct().collect(Collectors.toList());
//        System.out.println(q2);

        /* Find the average age of Male and Female Employees. */
//        total sum of bande / count of bande age
        Map<String, Double> q3 = employeeList.stream().collect(Collectors.groupingBy(i -> i.getGender(), Collectors.averagingDouble(Employee::getAge)));
//        System.out.println(q3);

        /* Get the Names of employees who joined after 2015. */
        List<String> q4 = employeeList.stream().filter(item -> item.getYearOfJoining() > 2015).map(item -> item.getName()).collect(Collectors.toList());
//        System.out.println(q4);

        /* Count the number of employees in each department. */
        Map<String, Long> q5 = employeeList.stream().collect(Collectors.groupingBy(i -> i.getDepartment(), Collectors.counting()));
//        System.out.println(q5);

        /* Find out the average salary of each department. */
        Map<String, Double> q6 = employeeList.stream().collect(Collectors.groupingBy(i -> i.getDepartment(), Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(q6);

        /* Find out the oldest employee, his/her age and department? */
//        employeeList.stream().max(Comparator.comparingInt(Employee::getAge))
//                .ifPresent((item) -> System.out.println(item.getName()+ ", " + item.getAge() + ", " + item.getDepartment()));
//
        /* Find out the average and total salary of the organization. */
        DoubleSummaryStatistics q8 = employeeList.stream().collect(Collectors.summarizingDouble(item -> item.getSalary()));
//        System.out.println(q8);

        /* List down the employees of each department. */
        Map<String, List<Employee>> q9 = employeeList.stream().collect(Collectors.groupingBy(i -> i.getDepartment()));
//        q9.forEach((k, v) -> {
//            System.out.println("#Department: " + k);
//            v.forEach(item -> System.out.println(item.getName()));
//        });

        /* Find out the highest experienced employees in the organization */
//        employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).ifPresent(emp -> System.out.println(emp.getName()));


//        Stream<Integer> numbers = Stream.of(10, 5, 8, 30, 25);
//        int max = numbers.reduce(-1, Integer::max);
//        System.out.println("Max: " + max);  // Output: Max: 30

        /* Implement a custom reduction to calculate the factorial of a number using streams. */
//        Long factorial = LongStream.rangeClosed(1L, 10L).reduce(1, (a, b) -> a * b);
//        System.out.println(factorial);
//




        List<Integer> l1 = Arrays.asList(1, 2, 6, 5, 8, 9);

        // Using Stream API to find the second largest number
        List<Integer> secondLargest = l1.stream()
                .distinct()                     // Remove duplicates
                .sorted(Collections.reverseOrder()) // Sort in descending order
                .skip(1)                        // Skip the first largest number
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(secondLargest);
    }

}
