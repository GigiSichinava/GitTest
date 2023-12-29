import javax.swing.JButton;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Review extends GraphicsProgram {
    
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;

    public void init() {
        JButton right = new JButton("Move right");
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Move grid or elements right
            }
        });
        add(right, EAST);

        JButton left = new JButton("Move left");
        // Similarly add ActionListener for left
        add(left, WEST);

        JButton down = new JButton("Move down");
        // Similarly add ActionListener for down
        add(down, SOUTH);

        JButton up = new JButton("Move up");
        // Similarly add ActionListener for up
        add(up, NORTH);
    }

    public void run() {
        double height = (double) getHeight() / NUM_ROWS;
        double width = (double) getWidth() / NUM_COLS;
        
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                GRect rect = new GRect(j * width, i * height, width, height);
                add(rect);
            }
        }
    }

    public static void main(String[] args) {
        new Review().start(args);
    }
}
