package formas;

import java.awt.Color;
import java.awt.Graphics;

public class Punto extends FormaBase {
	 private final int DOT_SIZE = 3;

	public Punto(int x, int y, Color color) {
		super(x, y, color);
	}
	 @Override
	    public int getWidth() {
	        return DOT_SIZE;
	    }

	    @Override
	    public int getHeight() {
	        return DOT_SIZE;
	    }

	    @Override
	    public void paint(Graphics graphics) {
	        super.paint(graphics);
	        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
	    }
}
