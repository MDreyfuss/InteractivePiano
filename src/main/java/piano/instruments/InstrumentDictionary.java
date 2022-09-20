package piano.instruments;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class InstrumentDictionary {

    private ArrayList<Instrument> instruments = new ArrayList<>();

    public InstrumentDictionary()
    {
        //instrument data from https://www.midi.org/specifications-old/item/gm-level-1-sound-set

        try
        {
            File dictionary = new File("src/main/java/piano/instruments/ListOfInstruments.txt");

            Scanner readFile = new Scanner(dictionary);
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] entry = line.split(" ", 2);
                instruments.add(new Instrument(entry[1], Integer.valueOf(entry[0])));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Instrument> getInstruments ()
    {
        return this.instruments;
    }
}

