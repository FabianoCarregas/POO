package org.poo.challenge;

import java.time.LocalDate;

public class Mentoring extends Content{

    private LocalDate date;

    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double xpCalculate() {
        return xpCalculate() + 20d;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
