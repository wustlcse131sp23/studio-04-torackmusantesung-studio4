package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeigh = in.nextDouble();
		
		Color pretty = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(pretty);
		String rectangle = "rectangle";
		
		if(shapeType.equals(rectangle))
		{	
			if(isFilled == true)
			{
				StdDraw.filledRectangle(x,y,halfWidth, halfHeigh);
			}
			else
			{
				StdDraw.rectangle(x,y,halfWidth, halfHeigh);
			}
		}
	}
}
