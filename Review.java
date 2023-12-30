import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Review extends GraphicsProgram{
	
	private static final int ROW_NUM = 5;
	private static final int COL_NUM = 5;
	private int ovalWidth, ovalHeight;
	private GOval oval;
	
	public void init(){
		JButton down = new JButton ("Move down");
		add(down, SOUTH);
		JButton up = new JButton ("Move up");
		add(up, NORTH);
		JButton right = new JButton ("Move right");
		add(right, EAST);
		JButton left = new JButton ("Move left");
		add(left, WEST);
		addActionListeners();
	}
	
	public void run(){
		int width = getWidth() / COL_NUM;
		int height = getHeight() / ROW_NUM;
		for(int i = 0; i < ROW_NUM; i++){
			for(int j = 0; j < COL_NUM; j++){
				GRect rect = new GRect(width, height);
				add(rect, width * i, height * j);
			}
		}
		ovalWidth = width;
		ovalHeight = height;
		GOval oval = new GOval(ovalWidth, ovalHeight);
		add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
	}
	
	public void actionPerformed(ActionEvent e){
		String temp = e.getActionCommand();
		if(temp.equals("Move down")){
			oval.move(0, -ovalHeight);
		}
		
	}
}