import javax.swing.JButton;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.event.ActionEvent;

public class Review extends GraphicsProgram {
    
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
    }

    public void run() {
        int height = getHeight() / NUM_ROWS;
        int width = getWidth() / NUM_COLS;
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                GRect rect = new GRect(j * width, i * height, width, height);
                add(rect);
            }
        }
        ovalHeight = height;
        ovalWidth = width;
        oval = new GOval(ovalWidth, ovalHeight);
        add(oval, getWidth() / 2 - ovalWidth / 2, getHeight() / 2 - ovalHeight / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Move right")) {
            oval.move(ovalWidth, 0);
        } else if (cmd.equals("Move left")) {
            oval.move(-ovalWidth, 0);
        } else if (cmd.equals("Move down")) {
            oval.move(0, ovalHeight);
        } else if (cmd.equals("Move up")) {
            oval.move(0, -ovalHeight);
        }
    }
}
