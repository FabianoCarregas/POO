package org.poo.challenge;


public class Course extends Content{

    private int workLoad;

    public Course(String title, String description, int workLoad) {
        super(title, description);
        this.workLoad = workLoad;
    }

    @Override
    public double xpCalculate() {
        return XP_PATTERN + workLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
