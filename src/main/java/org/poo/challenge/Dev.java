package org.poo.challenge;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();
    public void subcribeBootcamp(Bootcamp bootcamp){

    }

    private void proceed(){
    }

    private void calculate(){
    }

    public String getName() {
        return name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(finishedContent, dev.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, finishedContent);
    }
}
