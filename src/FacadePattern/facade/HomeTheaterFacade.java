package FacadePattern.facade;

import FacadePattern.systems.PopcornPopper;
import FacadePattern.systems.Screen;
import FacadePattern.systems.TheaterLights;

public class HomeTheaterFacade {
    private PopcornPopper popcornPopper;
    private Screen screen;
    private TheaterLights theaterLights;

    public HomeTheaterFacade(PopcornPopper popcornPopper, Screen screen, TheaterLights theaterLights) {
        this.popcornPopper = popcornPopper;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }

    public void watchMovie(){
        popcornPopper.on();
        popcornPopper.pop();
        screen.down();
        theaterLights.on();
        theaterLights.dim();
        System.out.println("\nMovie starts now... have fun :)");
        System.out.println("-------------------------------------");
    }

    public void endMovie(){
        popcornPopper.off();
        screen.up();
        theaterLights.off();
        System.out.println("\nMovie ends now... good night.");
    }
}
