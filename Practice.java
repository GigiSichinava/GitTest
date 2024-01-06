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
    
    private boolean isRemoved = false;
    
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
        
        oval1 = new GOval(rectWidth, rectHeight); // use the class-level variable
        oval1.setFilled(true);
        oval1.setFillColor(rgen.nextColor());
        add(oval1);
        
        oval2 = new GOval(rectWidth, rectHeight); // use the class-level variable
        oval2.setFilled(true);
        oval2.setFillColor(rgen.nextColor());
        add(oval2, rectWidth, rectHeight);
        
        addMouseListeners();
    }
    
    public void mouseClicked(MouseEvent e) {
        GObject obj = getElementAt(e.getX(), e.getY());
        if (obj == oval1 && !isRemoved) {
            remove(oval1);
            isRemoved = true;
        }else if( obj != oval1){
            add(oval1, e.getX() - oval1.getWidth()/2, e.getY() - oval1.getHeight() / 2); 
            isRemoved = false;
        }
    }
}
