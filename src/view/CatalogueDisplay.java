package view;

import java.util.List;
import model.Film;
import model.Observer;

public interface CatalogueDisplay extends Observer{
    void display(List<Film> films);
    
    void on(FilmSelect filmSelect);

    public interface FilmSelect {
        void select(Film film);
    }

}
