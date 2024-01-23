import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FirstProject extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private static final int N_ROWS = 10;
	private static final int N_COLS = 10;
	
	private int rectWidth; 
	private int rectHeight;

	private GRect rect;
	private GRect broski;

	public void init() {
		setSize(900, 900);
	}

	public void run() {
		rectWidth = getWidth() / N_COLS;
		rectHeight = getHeight() / N_ROWS;
		createGrid();
		createBroski();
		// createMovement();
	}

	private void createGrid() {
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLS; j++) {
				rect = new GRect(rectWidth, rectHeight);

				add(rect, j * rectWidth, i * rectHeight);
			}
		}
	}

	private void createBroski() {
		
		int randomX = rgen.nextInt(0, getWidth() - rectWidth);
		int randomY = rgen.nextInt(0, getHeight() - rectHeight);
		
		int broskiPlacementX = (randomX / rectWidth) * rectWidth;
		int broskiPlacementY = (randomY / rectHeight) * rectHeight;
		
		broski = new GRect(rectWidth, rectHeight);
		broski.setFilled(true);
		broski.setColor(Color.RED);
		
		add(broski, broskiPlacementX, broskiPlacementY);
	
	}
}
