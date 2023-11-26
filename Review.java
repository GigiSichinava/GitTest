import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class Review extends GraphicsProgram {

    private int xs, ys;
    private GLine line;

    public void init() {
        xs = ys = 0;
        addMouseListeners();
    }

    public void mousePressed(MouseEvent e) {
        line = new GLine(xs, ys, e.getX(), e.getY());
        add(line);
    }

    public void mouseDragged(MouseEvent e) {
        line.setEndPoint(e.getX(), e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        xs = e.getX();
        ys = e.getY();
    }
}
