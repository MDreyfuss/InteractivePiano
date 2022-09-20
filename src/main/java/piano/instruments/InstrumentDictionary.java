package piano.instruments;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InstrumentDictionary {

    private ArrayList<String> instrumentName = new ArrayList<>();
    private HashMap<String, Integer> instrumentSounds = new HashMap<>();

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
                instrumentName.add(entry[1]);
                instrumentSounds.put(entry[1], Integer.valueOf(entry[0]));
            }
        } catch (Exception e){
            File directory = new File("./");
            System.out.println(directory.getAbsolutePath());
            System.out.println(e);
        }
    }

    public Integer getSound(String lookUpInstrument)
    {
        return instrumentSounds.get(lookUpInstrument);
    }

    public ArrayList<String> getInstrumentNames ()
    {
        return this.instrumentName;
    }
}

