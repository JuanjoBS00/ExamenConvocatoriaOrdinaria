package model;

import java.util.ArrayList;
import java.util.List;

public class Film implements Subject {
    private final List<Observer> observers;
    private final String cover, title, director, genre;
    private final int year;
    private final List<String> actors;
    private final double valoration;
    private final int duration;

    public Film(String cover, String title, String director, String genre, int year, List<String> actors, double valoration, int duration) {
        this.observers = new ArrayList<>();
        this.cover = cover;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.actors = actors;
        this.valoration = valoration;
        this.duration = duration;
    }

    public String getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public List<String> getActors() {
        return actors;
    }

    public double getValoration() {
        return valoration;
    }

    public int getDuration() {
        return duration;
    }
    
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
