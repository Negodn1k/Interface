public class Main {
    public static void main(String[] args) {
        Instrument[] music = new Instrument[3];
        music[0] = new Guitar(6);
        music[1] = new Drums(50);
        music[2] = new Trumpet(10);

        for (Instrument obj: music) {
            obj.play();
        }
    }
}