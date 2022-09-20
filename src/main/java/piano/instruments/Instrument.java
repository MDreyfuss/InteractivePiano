package piano.instruments;

public class Instrument {
    private String name;
    private int sound;

    public Instrument(String instrumentName, int instrumentSound) {
        this.name = instrumentName;
        this.sound = instrumentSound;
    }

    public Integer getInstrumentSound() {
        return sound;
    }

    public String toString() {
        return name;
    }
}
