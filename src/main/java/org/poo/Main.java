package org.poo;

import org.poo.challenge.Course;
import org.poo.challenge.Mentoring;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("java", "OO", 10);
        Mentoring mentoring = new Mentoring("java", "OO", 12);

        System.out.println(course1);
        System.out.println(mentoring);
    }
}