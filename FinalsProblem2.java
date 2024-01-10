import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FinalsProblem2 extends GraphicsProgram{
	
	private GRect rect;
	private RandomGenerator rgen = RandomGenerator.getInstance();
    private ArrayList<GRect> rectangles;

	
	private JTextField widthField;
	private JTextField heightField;
	
	public void init(){
		
		rectangles = new ArrayList<>();
		
		JLabel width = new JLabel("width:");
		add(width, SOUTH);
		
		widthField = new JTextField(10);
		add(widthField, SOUTH);
		
		JLabel height = new JLabel("height");
		add(height, SOUTH);
		
		heightField = new JTextField(10);
		add(heightField, SOUTH);
		
		JButton add = new JButton("Add");
		add(add, SOUTH);
		add.addActionListener(this);
		
		JButton filter = new JButton("Filter");
		add(filter, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e){
		
		int width = Integer.parseInt(widthField.getText());
		int height = Integer.parseInt(heightField.getText());
		
		if(e.getActionCommand().equals("Add")){
			
			rect = new GRect(width, height);
			add(rect, rgen.nextInt(0, getWidth() - width), rgen.nextInt(getHeight() - height));
			rectangles.add(rect);
		}
		
		if(e.getActionCommand().isEmpty()){
			return;
		}
		
		if(e.getActionCommand().equals("Filter")){
			for(GRect curRect : rectangles){
				if(curRect.getWidth() > Integer.parseInt(widthField.getText()) || curRect.getHeight() > Integer.parseInt(heightField.getText())){
					rectangles.remove(curRect);
				}
			}
		}
	}
}