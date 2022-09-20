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
        InstrumentDictionary instrumentDictionary= new InstrumentDictionary();

        for (String next: instrumentDictionary.getInstrumentNames()) {
            combo.addItem(next);
        }
        combo.addActionListener(e -> midiChannel.programChange(instrumentDictionary.getSound((String) combo.getSelectedItem())));
        add(combo);
    }
}
