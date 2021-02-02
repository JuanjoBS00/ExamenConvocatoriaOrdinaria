package app;

import java.util.ArrayList;
import java.util.List;
import model.Catalogue;
import model.Film;
import view.FilmLoader;

public class MockFilmLoader implements FilmLoader{

    @Override
    public List<Film> load() {
        List<Film> peliculas = new ArrayList<>();
        List<String> actores = new ArrayList<>();
        Catalogue catalogue = new Catalogue();
        actores.add("DiCaprio");
        actores.add("Stalone");
        actores.add("Statham");
        
        
        Film una = new Film("img1", "La Dama y el Vagabundo", "Spielberg", "Drama", 2001, actores, 4.4, 125);
        Film dos = new Film("img2", "Matrix", "Lincon", "Acción", 1998, actores, 4.7, 118);
        Film tres = new Film("img3", "Nemo", "Thomas", "Animación", 2005, actores, 4.9, 109);
        Film cuatro = new Film("img4", "Narnia", "Tarantino", "Fantasia", 1999, actores, 4.4, 131);
        
        
        catalogue.addFilm(una);
        catalogue.addFilm(dos);
        catalogue.addFilm(tres);
        catalogue.addFilm(cuatro);
        
        catalogue.sort("novedades");
        
        return catalogue.getFilms();
    }
    

}
