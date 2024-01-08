import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.ErrorException;

public class Practice extends GraphicsProgram{
	public void init(){
		
		JTextField txtfield = new JTextField(30);
		add(txtfield, SOUTH);
		txtfield.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String adress = e.getActionCommand();
		
		try{
			GImage image = new GImage(adress);
			add(image);
		}catch(ErrorException fix){
			println("Error");
		}
	}
}