import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class FinalsProblem10 extends GraphicsProgram implements ComponentListener{

	private static final int N_ROWS = 8;
	private static final int N_COLS = 8;

	int Width = getHeight() / N_COLS;
	int Height = getHeight() / N_ROWS;

	private JTextField textField;
	private GOval oval;
	private GRect stone;
	private GRect rect;
		
	public void init() {
		JLabel label = new JLabel("Move");
		add(label, SOUTH);
		textField = new JTextField(10);
		add(textField, SOUTH);
		textField.addActionListener(this);

		addComponentListener(this);
		addActionListeners();
		addMouseListeners();
	}

	public void run() {

		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLS; j++) {
				int rectWidth = getHeight() / N_COLS;
				int rectHeight = getHeight() / N_ROWS;
				rect = new GRect(rectWidth, rectHeight);
				add(rect, j * rectWidth, i * rectHeight);
			}
		}

		int ovalWidth = getHeight() / N_COLS;
		int ovalHeight = getHeight() / N_ROWS;
		oval = new GOval(ovalWidth, ovalHeight);
		oval.setFilled(true);
		oval.setColor(Color.RED);
		add(oval, 4 * ovalWidth, 4 * ovalHeight);

		
		 double stoneWidth = (getHeight() / N_COLS) * 0.7;
		 double stoneHeight = (getHeight() / N_ROWS) * 0.7; 
		 stone = new GRect(stoneWidth,  stoneHeight);
		 stone.setFilled(true); 
		 stone.setColor(Color.GREEN);
		 add(stone, 4 * ovalWidth + 8, 4 * ovalHeight + 8);
		 
	}

	public void actionPerformed(ActionEvent e) {
		int Width = getHeight() / N_COLS;
		int Height = getHeight() / N_ROWS;

		String line = e.getActionCommand();
		if (line.equals("right")) {
			if (oval.getX() > 6 * Width) {
				return;
			}
			oval.move(Width, 0);
			stone.move(Width,  0);
		} else if (line.equals("left")) {
			if (oval.getX() < Width) {
				return;
			}
			oval.move(-Width, 0);
			stone.move(-Width, 0);
		} else if (line.equals("up")) {
			if (oval.getY() < Height) {
				return;
			}
			oval.move(0, -Height);
			stone.move(0, -Height);
		} else if (line.equals("down")) {
			if (oval.getY() > 6 * Height) {
				return;
			}
			oval.move(0, Height);
			stone.move(0, Height);
		}
	}
	
	
	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == oval || obj == stone) {
			remove(oval);
			remove(stone);
		} else {

			int width = getHeight() / N_COLS;
			int height = getHeight() / N_ROWS;

			int gridX = (e.getX() / width) * width;
			int gridY = (e.getY() / height) * height;

			add(oval, gridX, gridY);
			add(stone, gridX + 8,gridY + 8);
		}
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
	   
		// Calculate new dimensions based on the resized window
	    int width = getHeight() / N_COLS;
	    int height = getHeight() / N_ROWS;

	    // Clear all existing elements
	    removeAll();

	    // Redraw grid
	    for (int i = 0; i < N_ROWS; i++) {
	        for (int j = 0; j < N_COLS; j++) {
	            rect = new GRect(j * width, i * height, width, height);
	            add(rect);
	        }
	    }

	    // Redraw oval
	    oval = new GOval(4 * width, 4 * height, width, height);
	    oval.setFilled(true);
	    oval.setColor(Color.RED);
	    add(oval);

	    // Redraw stone
	    double stoneWidth = width * 0.7;
	    double stoneHeight = height * 0.7;
	    stone = new GRect(4 * width + width * 0.2, 4 * height + width * 0.2, stoneWidth, stoneHeight);
	    stone.setFilled(true);
	    stone.setColor(Color.GREEN);
	    add(stone);
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
