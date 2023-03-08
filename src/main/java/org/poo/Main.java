package org.poo;

import org.poo.challenge.Bootcamp;
import org.poo.challenge.Course;
import org.poo.challenge.Dev;
import org.poo.challenge.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("java", "OO", 10);
        Course course2 = new Course("java-2", "OO-2", 11);
        Mentoring mentoring = new Mentoring("Java", "OO", LocalDate.now());

        Bootcamp bcJava = new Bootcamp("bcJava", "Java-bt");
        bcJava.getContents().add(course);
        bcJava.getContents().add(course2);
        bcJava.getContents().add(mentoring);

        Dev tiburcio = new Dev("Tiburcio");
        tiburcio.subcribeBootcamp(bcJava);
        System.out.println("tiburcio Subscribed Contents " + tiburcio.getSubscribedContent());
        System.out.println("tiburcio finished Contents " + tiburcio.getFinishedContent());
        System.out.println("tiburcio xp " + tiburcio.xpCalculate());

        System.out.println("-----------------------------------------------------------");

        Dev tito = new Dev("Tito");
        tito.subcribeBootcamp(bcJava);
        System.out.println("tito Subscribed Contents " + tito.getSubscribedContent());
        tito.proceed();
        System.out.println("---after-conclusion---");
        System.out.println("tito Subscribed Contents " + tito.getSubscribedContent());
        System.out.println("tito finished Contents " + tiburcio.getFinishedContent());
        System.out.println("tito xp " + tito.xpCalculate());

    }
}