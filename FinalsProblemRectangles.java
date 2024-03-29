import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class FinalsProblemRectangles extends GraphicsProgram {

	private HashMap<String, GRect> rectMap;
	private GObject obj;
	private GRect rect;
	private String name;

	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel x;
	private JTextField xTextField;
	private JLabel y;
	private JTextField yTextField;
	private JLabel width;
	private JTextField widthTextField;
	private JLabel height;
	private JTextField heightTextField;
	private JButton Add;

	public void init() {
		nameLabel = new JLabel("Name:");
		add(nameLabel, SOUTH);
		nameTextField = new JTextField(5);
		add(nameTextField, SOUTH);
		x = new JLabel("X:");
		add(x, SOUTH);
		xTextField = new JTextField(5);
		add(xTextField, SOUTH);
		y = new JLabel("Y:");
		add(y, SOUTH);
		yTextField = new JTextField(5);
		add(yTextField, SOUTH);
		width = new JLabel("Width:");
		add(width, SOUTH);
		widthTextField = new JTextField(5);
		add(widthTextField, SOUTH);
		height = new JLabel("Height:");
		add(height, SOUTH);
		heightTextField = new JTextField(5);
		add(heightTextField, SOUTH);
		Add = new JButton("Add");
		add(Add, SOUTH);

		addActionListeners(this);
		addMouseListeners();

		rectMap = new HashMap<>();

	}

	public void actionPerformed(ActionEvent e) {
		String line = e.getActionCommand();

		int xCoordinate = Integer.parseInt(xTextField.getText());
		int yCoordinate = Integer.parseInt(yTextField.getText());
		int width = Integer.parseInt(widthTextField.getText());
		int height = Integer.parseInt(heightTextField.getText());
		name = nameTextField.getText();

		// Only add rectangles with unique names	
		if (line.equals("Add") && !rectMap.containsKey(name)) {
			rect = new GRect(xCoordinate, yCoordinate, width, height);
			add(rect);
			rectMap.put(name, rect);

		}
	}

}
