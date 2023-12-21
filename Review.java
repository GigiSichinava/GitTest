import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class Review extends ConsoleProgram {

	private JTextField field;

	public void run() {

		JLabel label = new JLabel("Hello!");
		add(label, SOUTH);

		field = new JTextField(10);
		add(field, SOUTH);

		JButton button = new JButton("Press me!");
		add(button, SOUTH);

		addActionListeners();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Press me!")) {
			if (e.getActionCommand().equals("")) {
				println("_");
			} else {
				println(field.getText());

			}
		}
	}
}