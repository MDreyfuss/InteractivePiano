package piano.instruments;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class InstrumentList {

    private ArrayList<Instrument> instruments = new ArrayList<>();

    public InstrumentList()
    {
        //instrument data from https://www.midi.org/specifications-old/item/gm-level-1-sound-set

        try
        {
            InputStream list = InstrumentList.class.getResourceAsStream("ListOfInstruments.txt");

            Scanner readFile = new Scanner(list);
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

