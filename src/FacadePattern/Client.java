package FacadePattern;

import FacadePattern.facade.HomeTheaterFacade;
import FacadePattern.systems.PopcornPopper;
import FacadePattern.systems.Screen;
import FacadePattern.systems.TheaterLights;

public class Client {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popcornPopper,screen,theaterLights);

        homeTheaterFacade.watchMovie();

        homeTheaterFacade.endMovie();
    }
}
