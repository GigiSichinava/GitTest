import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem69 extends GraphicsProgram implements ComponentListener{

	public void init(){
		addComponentListener(this);
	}
	
	public void run(){
		draw();
	}
	
	private static final int GRID_NUM = 8;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	private void draw(){
		removeAll();
		double width = (double)getWidth() / GRID_NUM;
		double height = (double)getHeight() / GRID_NUM;
		for(int i = 0; i < GRID_NUM; i++){
			for(int j = 0; j < GRID_NUM; j++){
				GRect rect = new GRect(i * width, j * height, width, height);
				rect.setFilled(true);
				rect.setColor(rgen.nextColor());
				add(rect);
			}
		}
	}
	
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		draw();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	}
