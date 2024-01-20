import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Final2022Session1Excel extends GraphicsProgram {
	private static final int COLUMN_START_X = 10;
	private static final int COLUMN_START_Y = 20;
	private static final int ROW_STEP = 20;
	private static final int COLUMN_STEP = 100;

	private JTextField colField;
	private JTextField rowField;
	private JTextField filterField;
	private JButton colButton;
	private JButton rowButton;
	private JButton filterButton;

	private ArrayList<String> columnNames;
	private ArrayList<ArrayList<String>> rows;

	public void init() {
		colField = new JTextField(10);
		rowField = new JTextField(10);
		filterField = new JTextField(10);
		colButton = new JButton("add column");
		rowButton = new JButton("add row");
		filterButton = new JButton("filter");

		add(colField, SOUTH);
		add(colButton, SOUTH);
		add(rowField, SOUTH);
		add(rowButton, SOUTH);
		add(filterField, SOUTH);
		add(filterButton, SOUTH);

		addActionListeners();

		columnNames = new ArrayList<>();
		rows = new ArrayList<>();
	}
}