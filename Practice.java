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
    private GObject lastSelected; // Track the last selected object
    
    public void run() {
        setSize(500, 500);
        int rectWidth = getWidth() / N_COLS;
        int rectHeight = getHeight() / N_ROWS;
        
        // Create the grid
        for (int i = 0; i < N_COLS; i++) {
            for (int j = 0; j < N_ROWS; j++) {
                GRect rect = new GRect(rectWidth, rectHeight);
                add(rect, rectWidth * i, rectHeight * j);
            }
        }
        
        // Create and add ovals
        oval1 = new GOval(rectWidth, rectHeight);
        oval1.setFilled(true);
        oval1.setColor(rgen.nextColor());
        add(oval1);
        
        oval2 = new GOval(rectWidth, rectHeight);
        oval2.setFilled(true);
        oval2.setColor(rgen.nextColor());
        add(oval2, rectWidth, rectHeight);
        
        // Add mouse listeners
        addMouseListeners();
    }
    
    public void mouseClicked(MouseEvent e) {
        GObject obj = getElementAt(e.getX(), e.getY());
        if (obj == oval1 || obj == oval2) {
            lastSelected = obj; // Set the last selected object
        }
    }

    public void mouseDragged(MouseEvent e) {
        if (lastSelected != null) {
            lastSelected.setLocation(e.getX() - lastSelected.getWidth() / 2, e.getY() - lastSelected.getHeight() / 2);
        }
    }

    public void mouseReleased(MouseEvent e) {
        lastSelected = null; // Clear the selection once released
    }
}
