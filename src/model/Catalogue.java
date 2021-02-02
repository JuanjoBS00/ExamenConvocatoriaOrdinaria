package model;

import java.util.ArrayList;
import java.util.List;

public class Catalogue implements Subject{
    private final List<Observer> observers;
    private List<Film> peliculas;

    public Catalogue() {
        this.observers = new ArrayList<>();
        this.peliculas = new ArrayList<>();
    }
    
    public void addFilm(Film film) {
        this.peliculas.add(film);
        notifyObservers();
    }

    public void removeFilm(Film film) {
        this.peliculas.remove(film);
        notifyObservers();
    }
    
    public List<Film> getFilms(){
        return peliculas;
    }
    
    public void sort(String sortMethod){
        List<Film> sortedFilms = new ArrayList<>();
        
        switch (sortMethod){
            case "género":
                // Se ordenan por género y se añaden a la lista
                for (Film film : peliculas){
                    sortedFilms.add(film);
                }
                peliculas=sortedFilms;
                notifyObservers();
                break;
            
            case "novedades":
                // Se ordenan por novedades y se añaden a la lista
                for (Film film : peliculas){
                    sortedFilms.add(film);
                }
                peliculas=sortedFilms;
                notifyObservers();
                break;
            case "mostviewed":
                // Se ordenan por más vistas y se añaden a la lista
                for (Film film : peliculas){
                    sortedFilms.add(film);
                }
                peliculas=sortedFilms;
                notifyObservers();
                break;
            case "mostvalorated":
                // Se ordenan por más valoradas y se añaden a la lista
                for (Film film : peliculas){
                    sortedFilms.add(film);
                }
                peliculas=sortedFilms;
                notifyObservers();
                break;            
        }

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
