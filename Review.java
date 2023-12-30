import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Review extends GraphicsProgram {

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

        // Add component listener for window resize
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateGridAndOval();
            }
        });
    }

    public void run() {
        updateGridAndOval();
    }

    private void updateGridAndOval() {
        removeAll(); // Clear the canvas

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
        ovalHeight = height;
        ovalWidth = width;
        oval = new GOval(ovalWidth, ovalHeight);
        oval.setFilled(true);
        add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        moveOval(command);
    }

    private void moveOval(String direction) {
        if (direction.equals("Move right") && oval.getX() + ovalWidth <= getWidth() - ovalWidth) {
            oval.move(ovalWidth, 0);
        } else if (direction.equals("Move left") && oval.getX() >= ovalWidth) {
            oval.move(-ovalWidth, 0);
        } else if (direction.equals("Move down") && oval.getY() + ovalHeight <= getHeight() - ovalHeight) {
            oval.move(0, ovalHeight);
        } else if (direction.equals("Move up") && oval.getY() >= ovalHeight) {
            oval.move(0, -ovalHeight);
        }
        oval.setFilled(true);
        oval.setColor(rgen.nextColor());
    }
}
