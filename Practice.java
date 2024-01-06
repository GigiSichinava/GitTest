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
    private boolean oval1Removed = false;
    private boolean oval2Removed = false;
    
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
        oval1.setFillColor(rgen.nextColor());
        add(oval1);
        
        oval2 = new GOval(rectWidth, rectHeight);
        oval2.setFilled(true);
        oval2.setFillColor(rgen.nextColor());
        add(oval2, rectWidth, rectHeight);
        
        addMouseListeners();
    }
    
    public void mouseClicked(MouseEvent e) {
        GObject obj = getElementAt(e.getX(), e.getY());
        if (obj == oval1 && !oval1Removed) {
                remove(oval1);
                oval1Removed = true;
            } else {
                add(oval1, e.getX() - oval1.getWidth() / 2, e.getY() - oval1.getHeight() / 2);
                oval1Removed = false;
            }
//        } else if (obj == oval2) {
//            if (!oval2Removed) {
//                remove(oval2);
//                oval2Removed = true;
//            } else {
//                add(oval2, e.getX() - oval2.getWidth() / 2, e.getY() - oval2.getHeight() / 2);
//                oval2Removed = false;
//            }
    }
}
