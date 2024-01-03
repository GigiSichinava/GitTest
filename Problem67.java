import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.ErrorException;

public class Problem67 extends GraphicsProgram {
	public void init() {
		JTextField textField = new JTextField(30);
		add(textField, SOUTH);
		textField.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String adress = e.getActionCommand();
		try {
			GImage image = new GImage(adress);
			add(image);
		} catch (ErrorException fix) {
			println("No image found!");
		}
	}
}