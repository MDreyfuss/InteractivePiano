package piano.instruments;

public class Instrument {
    private String instrumentName;
    private Integer instrumentSound;

    public Instrument(String instrumentName, int instrumentSound) {
        this.instrumentName = instrumentName;
        this.instrumentSound = instrumentSound;
    }

    public Integer getInstrumentSound() {
        return instrumentSound;
    }

    public String toString() {
        return instrumentName;
    }
}
