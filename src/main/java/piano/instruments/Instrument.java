package piano.instruments;

public class Instrument {
    private String name;
    private int sound;

    public Instrument(String name, int sound) {
        this.name = name;
        this.sound = sound;
    }

    public Integer getSound() {
        return sound;
    }

    public String toString() {
        return name;
    }
}
