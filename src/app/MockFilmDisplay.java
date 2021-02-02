package app;

import model.Film;
import model.Subject;
import view.FilmDisplay;

public class MockFilmDisplay implements FilmDisplay{
    private Film film;

     
    @Override
    public void display() {
        System.out.println("Se muestra la película: " + film.getTitle());

    }

    @Override
    public Film get() {
        return this.film;
    }

    @Override
    public void update(Subject subject) {
        this.film = (Film) subject;
    }

}
