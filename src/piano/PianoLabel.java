package piano;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;

public class PianoLabel extends JLabel
{
	private Key key;
	private Color defaultColor; // color of key when NOT clicked
	private Color colorOnClick; // color of key when clicked
	private Dimension dimension;


	public PianoLabel(Color defaultColor, Color colorOnClick) {
		if (defaultColor == Color.WHITE || defaultColor == Color.BLACK) {
			createPianoLabel(defaultColor, colorOnClick);
		}
	}

	private void createPianoLabel(Color defaultColor, Color onClickColor) {
		if (defaultColor == Color.WHITE) {
			dimension = new Dimension(KeyStats.WHITE_WIDTH, KeyStats.FRAME_HEIGHT);
		} else {
			dimension = new Dimension(KeyStats.BLACK_WIDTH, KeyStats.BLACK_HEIGHT);
		}
		this.defaultColor = defaultColor;
		this.colorOnClick = onClickColor;
		setPreferredSize(dimension);
		setOpaque(true);
		setBackground(defaultColor);
	}

	public Key getKey()
	{
		return key;
	}

	public void setKey(Key k)
	{
		this.key = k;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public Color getDefaultColor() {
		return defaultColor;
	}

	public void setColorToDefaultColor() {
		setBackground(defaultColor);
	}

	public void setColorToOnClickColor() {
		setBackground(colorOnClick);
	}
}
