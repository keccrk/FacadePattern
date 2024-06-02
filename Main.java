public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        //Facade nesnesini oluşturur
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv,soundSystem,lights);

        homeTheaterFacade.watchMovie();

        homeTheaterFacade.endMovie();
    }
}