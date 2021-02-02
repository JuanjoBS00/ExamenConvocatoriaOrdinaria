package app;

import control.Command;
import control.ExitCommand;
import control.ShowCatalogueCommand;
import control.ShowFilmCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import view.CatalogueDisplay;
import view.FilmDisplay;
import view.FilmLoader;

public class FilmApp {
    private final Scanner reader = new Scanner(System.in);
    private final Map<String, Command> commands;
    private final CatalogueDisplay catalogueDisplay;
    private final FilmDisplay filmDisplay;
    private final FilmLoader filmLoader;
        
        public FilmApp(){
            this.commands = new HashMap<>();
            this.filmDisplay = new MockFilmDisplay();
            this.catalogueDisplay = new MockCatalogueDisplay();
            this.filmLoader = new MockFilmLoader();
            
            this.commands.put("Q", new ExitCommand());
            this.commands.put("C", new ShowCatalogueCommand(filmLoader, catalogueDisplay));
            this.commands.put("F", new ShowFilmCommand(filmDisplay, catalogueDisplay));
        }

    public static void main(String[] args) {
       new FilmApp().execute();
    }

    private void execute() {
              while(true) commands.getOrDefault(input(), Command.Null).execute();
    }
    

    private String input() {
        return reader.nextLine();
    }
    
    
}
