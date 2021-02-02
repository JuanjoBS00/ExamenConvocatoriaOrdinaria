package app;

import java.util.List;
import model.Catalogue;
import model.Film;
import model.Subject;
import view.CatalogueDisplay;

public class MockCatalogueDisplay implements CatalogueDisplay{
    private Catalogue catalogue;
    private FilmSelect filmSelect;

    @Override
    public void display(List<Film> films) {
        
        for (Film film : films){
            System.out.println("El título de la película es: " + film.getTitle());
        }
    }

    @Override
    public void on(FilmSelect filmSelect) {
        this.filmSelect = filmSelect;
    }

    @Override
    public void update(Subject subject) {
        this.catalogue = (Catalogue) subject;
    }

}
