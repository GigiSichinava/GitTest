import java.awt.event.MouseEvent;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Practice extends GraphicsProgram {
    
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final int N_COLS = 9;
    private static final int N_ROWS = 9;
    
    private GOval oval1;
    private GOval oval2;
    private boolean oval1Visible = true;
    private boolean oval2Visible = true;
    
    public void run() {
        setSize(500, 500);
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
        oval1.setColor(rgen.nextColor());
        add(oval1);
        
        oval2 = new GOval(rectWidth, rectHeight);
        oval2.setFilled(true);
        oval2.setColor(rgen.nextColor());
        add(oval2, rectWidth, rectHeight);
        
        addMouseListeners();
    }
    
    public void mouseClicked(MouseEvent e) {
        GObject obj = getElementAt(e.getX(), e.getY());
        if (obj == oval1) {
            if (oval1Visible) {
                oval1.setVisible(false);
                oval1Visible = false;
            } else {
                oval1.setLocation(e.getX() - oval1.getWidth() / 2, e.getY() - oval1.getHeight() / 2);
                oval1.setVisible(true);
                oval1Visible = true;
            }
        } else if (obj == oval2) {
            if (oval2Visible) {
                oval2.setVisible(false);
                oval2Visible = false;
            } else {
                oval2.setLocation(e.getX() - oval2.getWidth() / 2, e.getY() - oval2.getHeight() / 2);
                oval2.setVisible(true);
                oval2Visible = true;
            }
        }
    }
}
