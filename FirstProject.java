import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GResizable;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FirstProject extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final int N_ROWS = 10;
	private static final int N_COLS = 10;

	private int rectWidth;
	private int rectHeight;

	private int hoeWidth;
	private int hoeHeight;

	private GRect rect;

	private GRect broski;
	private GLabel broskiLabel;
	private GCompound finishedBroski;

	private GOval hoe;

	public void init() {
		// setSize(900, 900);
		addKeyListeners();

	}

	public void run() {

		rectWidth = getWidth() / N_COLS;
		rectHeight = getHeight() / N_ROWS;

		hoeWidth = getWidth() / N_COLS;
		hoeHeight = getHeight() / N_ROWS;

		createGrid();
		createBroski();
		createHoe();
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
		broski.setColor(Color.GREEN);

		broskiLabel = new GLabel("BROSKI");
		broskiLabel.setColor(Color.WHITE);
		double labelX = (rectWidth - broskiLabel.getWidth()) / 2;
		double labelY = (rectHeight + broskiLabel.getAscent()) / 2;

		finishedBroski = new GCompound();
		finishedBroski.add(broski);
		finishedBroski.add(broskiLabel, labelX, labelY);

		add(finishedBroski, broskiPlacementX, broskiPlacementY); //

	}

	private void createHoe() {

		int randomX = rgen.nextInt(0, getWidth() - rectWidth);
		int randomY = rgen.nextInt(0, getHeight() - rectHeight);

		int hoePlacementX = (randomX / rectWidth) * rectWidth;
		int hoePlacementY = (randomY / rectHeight) * rectHeight;

		hoe = new GOval(hoeWidth, hoeHeight);
		hoe.setFilled(true);
		hoe.setColor(Color.RED);

		add(hoe, hoePlacementX, hoePlacementY);
	}

	public void keyPressed(KeyEvent e) {

		
		int MOVE_SIZE_X = rectWidth;
		int MOVE_SIZE_Y = rectHeight;

		int randomX = rgen.nextInt(0, getWidth() - rectWidth);
		int randomY = rgen.nextInt(0, getHeight() - rectHeight);

		int hoePlacementX = (randomX / rectWidth) * rectWidth;
		int hoePlacementY = (randomY / rectHeight) * rectHeight;

		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			if(finishedBroski.getY() < rectHeight / 2){
				return;
			}
			finishedBroski.move(0, -MOVE_SIZE_Y);
			break;
		case KeyEvent.VK_DOWN:
			finishedBroski.move(0, MOVE_SIZE_Y);
			break;
		case KeyEvent.VK_LEFT:
			if(finishedBroski.getX() < rectWidth / 2){
				return;
			}
			finishedBroski.move(-MOVE_SIZE_X, 0);
			break;
		case KeyEvent.VK_RIGHT:
			finishedBroski.move(MOVE_SIZE_X, 0);
			break;
		}

		if (finishedBroski.getX() == hoe.getX() && finishedBroski.getY() == hoe.getY()) {
			hoe.setLocation(hoePlacementX, hoePlacementY);
		}

	}
}
