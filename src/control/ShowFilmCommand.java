package control;

import model.Film;
import view.CatalogueDisplay;
import view.FilmDisplay;

public class ShowFilmCommand implements Command {
    private final FilmDisplay filmDisplay;
    private final CatalogueDisplay catalogueDisplay;
    private Film movie;

    public ShowFilmCommand(FilmDisplay filmDisplay, CatalogueDisplay catalogueDisplay) {
        this.filmDisplay = filmDisplay;
        this.catalogueDisplay = catalogueDisplay;
        this.movie = filmDisplay.get();
    }
    
    
    @Override
    public void execute() {
        this.catalogueDisplay.on(filmSelect());
    }

    private CatalogueDisplay.FilmSelect filmSelect() {
        return new CatalogueDisplay.FilmSelect() {
            @Override
            public void select(Film film) {
                movie.unsubscribe(filmDisplay);
                movie = film;
                movie.subscribe(filmDisplay);
                movie.notifyObservers();
                filmDisplay.display();
            }
        };
    }

}
