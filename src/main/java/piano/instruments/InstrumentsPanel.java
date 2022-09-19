package piano.instruments;

import piano.main.MainFrameInterface;
import javax.sound.midi.MidiChannel;
import javax.swing.*;
import java.awt.*;

public class InstrumentsPanel extends JPanel {

    public InstrumentsPanel(MidiChannel midiChannel) {
        setLayout(new FlowLayout());
        setSize(MainFrameInterface.KEYBOARD_WIDTH, MainFrameInterface.INSTRUMENTS_PANEL_HEIGHT);
        setBackground(Color.BLACK);
        JComboBox combo = new JComboBox();


        //instrument data from https://www.midi.org/specifications-old/item/gm-level-1-sound-set
        String[] instrumentName = {"Acoustic Grand Piano", "Music Box", "Xylophone", "Accordion",
                "Harmonica", "Acoustic Guitar", "Electric Guitar", "Violin", "Cello", "Trumpet",
                "Flute"};
        int[] instrumentVal = {1, 11, 14, 22, 23, 25, 27, 41, 43, 57, 74};

        for (String next: instrumentName) {
            combo.addItem(next);
        }
        combo.addActionListener(e -> midiChannel.programChange(instrumentVal[combo.getSelectedIndex()]));
        add(combo);
    }
}
