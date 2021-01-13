package com.mendes;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Student> students = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                if (t1.getId() < t2.getId()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        students.offer(new Student(4, "Ali"));
        students.offer(new Student(2, "Can"));
        students.offer(new Student(5, "Jack"));
        students.offer(new Student(1, "Mario"));
        students.offer(new Student(3, "Gomez"));

        System.out.println("sort students by id: " + students);
        System.out.println("\npeek method show but don't delete: " + students.peek());
        System.out.println("sort students after peek method: " + students);
        System.out.println("\npoll method show and delete: " + students.poll());
        System.out.println("sort students after poll method: " + students);

        System.out.println("\nshow and delete with while:");
        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
        System.out.println("\nafter while: " + students);
    }
}

class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student student) {
        if (this.id < student.id) {
            return -1;
        } else if (this.id > student.id) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
