import java.awt.event.MouseEvent;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Practice extends GraphicsProgram {

    private GLine line;

    public void run() {
        addMouseListeners();
        line = new GLine(0, 0, 0, 0); 
    }

    public void mousePressed(MouseEvent e) {
        double x2 = e.getX();
        double y2 = e.getY();
        line.setEndPoint(x2, y2); 
        add(line);
    }
}

