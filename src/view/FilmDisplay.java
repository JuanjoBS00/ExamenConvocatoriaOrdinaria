package view;

import model.Film;
import model.Observer;

public interface FilmDisplay extends Observer{
    void display();
    Film get();
    
}
