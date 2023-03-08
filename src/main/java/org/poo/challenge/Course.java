package org.poo.challenge;

public class Course {

    private String title;
    private String description;
    private int workLoad;

    @Deprecated
    public Course() {
    }

    public Course(String title, String description, int workLoad) {
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
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
