import java.awt.Color;
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
		add(new JButton("		Recolor		"), SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		for(int i = 0; i < rectColors.length; i++){
			for(int j = 0; j < rectColors[i].length; j++){
				rectColors[i][j] = null;
			}
		}
		draw();
	}
	
	public void run(){
		rectColors = new Color[GRID_NUM][GRID_NUM];
		draw();
	}
	
	private static final int GRID_NUM = 8;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private Color[][] rectColors;
	
	private void draw(){
		removeAll();
		double width = (double)getWidth() / GRID_NUM;
		double height = (double)getHeight() / GRID_NUM;
		for(int i = 0; i < GRID_NUM; i++){
			for(int j = 0; j < GRID_NUM; j++){
				GRect rect = new GRect(i * width, j * height, width, height);
				rect.setFilled(true);
				if(rectColors[i][j] == null){
					rectColors[i][j] = rgen.nextColor();
				}
				rect.setColor(rectColors[i][j]);
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
