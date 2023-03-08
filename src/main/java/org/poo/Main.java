package org.poo;

import org.poo.challenge.Course;
import org.poo.challenge.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("java", "OO", 10);
        Mentoring mentoring = new Mentoring("Java", "OO", LocalDate.now());

        System.out.println(course);
        System.out.println(mentoring);
    }
}