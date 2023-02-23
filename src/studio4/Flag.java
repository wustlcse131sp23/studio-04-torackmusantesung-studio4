package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		
		Color pissYellow = new Color(225, 225, 20);
		StdDraw.setPenColor(pissYellow);
		StdDraw.filledCircle(0.5, 0.5, 0.14);
	
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5,  0.5, 0.4, 0.2);
	}
}