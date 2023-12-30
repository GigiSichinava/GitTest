import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JButton;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class JButtonBall extends GraphicsProgram implements ComponentListener {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    private GOval oval;
    private int ovalWidth, ovalHeight;

    public void init() {
        JButton right = new JButton("Move right");
        add(right, EAST);
        JButton left = new JButton("Move left");
        add(left, WEST);
        JButton down = new JButton("Move down");
        add(down, SOUTH);
        JButton up = new JButton("Move up");
        add(up, NORTH);
        addActionListeners();

        // Register component listener
        addComponentListener(this);
    }

    public void run() {
        updateGrid();
    }

    @Override
    public void componentResized(ComponentEvent e) {
        updateGrid();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Move right")) {
            moveOval(ovalWidth, 0);
        } else if (command.equals("Move left")) {
            moveOval(-ovalWidth, 0);
        } else if (command.equals("Move down")) {
            moveOval(0, ovalHeight);
        } else if (command.equals("Move up")) {
            moveOval(0, -ovalHeight);
        }
    }

    private void moveOval(int dx, int dy) {
        if (oval != null) {
            oval.move(dx, dy);
            oval.setFilled(true);
            oval.setColor(rgen.nextColor());
        }
    }

    private void updateGrid() {
        removeAll(); // Remove all existing elements

        int height = getHeight() / NUM_ROWS;
        int width = getWidth() / NUM_COLS;

        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                GRect rect = new GRect(width, height);
                rect.setFilled(true);
                rect.setFillColor(Color.white);
                add(rect, i * width, j * height);
            }
        }

        ovalWidth = width;
        ovalHeight = height;

        // Recreate the oval or reposition it based on new dimensions
        if (oval == null) {
            oval = new GOval(ovalWidth, ovalHeight);
        } else {
            oval.setSize(ovalWidth, ovalHeight);
        }
        oval.setFilled(true);

        // Adjust oval position - center or within new grid bounds
        add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
    }

    // Empty implementations for other ComponentListener methods
    @Override
    public void componentMoved(ComponentEvent e) {}
    @Override
    public void componentShown(ComponentEvent e) {}
    @Override
    public void componentHidden(ComponentEvent e) {}
}
