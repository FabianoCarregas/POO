package org.poo.challenge;

public class Mentoring {

    private String title;
    private String description;
    private int workLoad;

    @Deprecated
    public Mentoring() {
    }

    public Mentoring(String title, String description, int workLoad) {
        this.title = title;
        this.description = description;
        this.workLoad = workLoad;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
