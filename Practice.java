import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

    public void run() {
        addMouseListeners();
    }

    public void mousePressed(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();
        GLine line = new GLine(0, 0, x, y); // Create a new line for each click
        add(line);
    }
}
