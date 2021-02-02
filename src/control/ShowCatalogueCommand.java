package control;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.CatalogueDisplay;
import view.FilmLoader;

public class ShowCatalogueCommand implements Command{
    private final FilmLoader filmLoader;
    private final CatalogueDisplay catalogueDisplay;
    private final List<Film> peliculas;

    public ShowCatalogueCommand(FilmLoader filmLoader, CatalogueDisplay catalogueDisplay) {
        this.filmLoader = filmLoader;
        this.catalogueDisplay = catalogueDisplay;
        this.peliculas = new ArrayList<>();
        
        List<Film> filmsLoaded = filmLoader.load();
        
        for (Film film: filmsLoaded){
            this.peliculas.add(film);
        }
        
    }
    
    

    @Override
    public void execute() {
        catalogueDisplay.display(peliculas);
    }

}
