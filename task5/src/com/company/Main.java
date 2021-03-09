package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        Main.createStudent();
        Main.getScholarshipsStudents();
    }

    public static void createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce student name: ");
        String name = scanner.nextLine();

        System.out.println("Introduce student age: ");
        int age = scanner.nextInt();

        System.out.println("Introduce student marks average: ");
        double marksAverage = scanner.nextDouble();

        System.out.println("Introduce student registration number: ");
        String registrationNumber = scanner.nextLine();

        Student student = new Student(
                name,
                age,
                registrationNumber,
                marksAverage
        );

        System.out.println(student.getAScholarship());
    }

    public static void getScholarshipsStudents() {
        Student test1 = new Student(
                "Test1",
                12,
                "AA1",
                6
        );
        Student test2 = new Student(
                "Test2",
                13,
                "AA2",
                7
        );
        Student test3 = new Student(
                "Test3",
                14,
                "AA3",
                8
        );
        Student test4 = new Student(
                "Test4",
                15,
                "AA4",
                9
        );

        List<Student> group = List.of(test1, test2, test3, test4);

        for (Student student : group) {
            if (student.getAScholarship()) {
                System.out.println(student.getName());
            }
        }
    }
}
