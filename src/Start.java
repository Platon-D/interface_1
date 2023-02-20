public class Start {
    public static void main(String[] args) {

        Gibson gibson = new Gibson();
        Fender fender  = new Fender();
        Esp esp = new Esp();


        fender.soundSamples();
        esp.soundSamples();
        gibson.soundSamples();
    }
}
