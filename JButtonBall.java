
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class JButtonBall extends GraphicsProgram implements ComponentListener{

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 5;
	private GOval oval;
	private int ovalWidth, ovalHeight;

	public void init() {
		JButton right = new JButton("Move right");
		add(right, EAST);
		JButton left = new JButton("Move left");
		add(left, WEST);
		JButton down = new JButton("Move down");
		add(down, SOUTH);
		JButton up = new JButton("Move up");
		add(up, NORTH);
		addActionListeners();
	}

	public void run() {
		updateGrid();
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
		 updateGrid();		
	}

	private void updateGrid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}