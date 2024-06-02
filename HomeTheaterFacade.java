public class HomeTheaterFacade {
    private Television tv;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(Television tv, SoundSystem soundSystem, Lights lights){
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch movie...");
        lights.dim(10);
        tv.on();
        soundSystem.on();
        soundSystem.setVolume(20);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        tv.off();
        soundSystem.off();
    }
}
