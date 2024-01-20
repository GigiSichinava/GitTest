import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class ovalInGrid extends GraphicsProgram implements ComponentListener{

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int N_COLS = 3;
	private static final int N_ROWS = 3;

	private GOval oval1;

	private boolean isRemoved = false;

	public void run() {
		setSize(400, 400);
		int rectWidth = getWidth() / N_COLS;
		int rectHeight = getHeight() / N_ROWS;

		for (int i = 0; i < N_COLS; i++) {
			for (int j = 0; j < N_ROWS; j++) {
				GRect rect = new GRect(rectWidth, rectHeight);
				add(rect, rectWidth * i, rectHeight * j);
			}
		}

		oval1 = new GOval(rectWidth, rectHeight); 
													
		oval1.setFilled(true);
		oval1.setFillColor(rgen.nextColor());
		add(oval1);

		addMouseListeners(this);
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == oval1 && !isRemoved) {
			remove(oval1);
			isRemoved = true;
		} else {

			int rectWidth = getWidth() / N_COLS;
			int rectHeight = getHeight() / N_ROWS;

			int gridX = (e.getX() / rectWidth) * rectWidth;
			int gridY = (e.getY() / rectHeight) * rectHeight;

			add(oval1, gridX, gridY);
			isRemoved = false;
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
		removeAll();
		
		
		int rectWidth = getWidth() / N_COLS;
	    int rectHeight = getHeight() / N_ROWS;

	    for (int i = 0; i < N_COLS; i++) {
	        for (int j = 0; j < N_ROWS; j++) {
	            GRect rect = new GRect(rectWidth, rectHeight);
	            add(rect, rectWidth * i, rectHeight * j);
	        }
	    }
	  
	    oval1 = new GOval(rectWidth, rectHeight);
	    oval1.setFilled(true);
	    oval1.setFillColor(rgen.nextColor());
	    add(oval1, (getWidth() - rectWidth) / 2, (getHeight() - rectHeight) / 2);
	    
	
		
	}
	
	

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
