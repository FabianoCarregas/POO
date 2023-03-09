package org.poo.challenge;

public abstract class Content {
    public static final double XP_PATTERN = 10d;
    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    public abstract double xpCalculate();
}
