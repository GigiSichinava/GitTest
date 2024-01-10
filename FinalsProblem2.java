import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class FinalsProblem2 extends GraphicsProgram implements ComponentListener {

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private JTextField widthField, heightField;
    private ArrayList<GRect> rectangles;

    public void init() {
        rectangles = new ArrayList<>();

        JLabel widthLabel = new JLabel("Width:");
        add(widthLabel, SOUTH);
        widthField = new JTextField(10);
        add(widthField, SOUTH);

        JLabel heightLabel = new JLabel("Height:");
        add(heightLabel, SOUTH);
        heightField = new JTextField(10);
        add(heightField, SOUTH);

        JButton addButton = new JButton("Add");
        add(addButton, SOUTH);
        addButton.addActionListener(this);

        // Add ComponentListener to listen for window resize events
        addComponentListener(this);

        addActionListeners();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            int width = Integer.parseInt(widthField.getText());
            int height = Integer.parseInt(heightField.getText());

            GRect rect = new GRect(width, height);
            add(rect, rgen.nextInt(0, getWidth() - width), rgen.nextInt(0, getHeight() - height));
            rectangles.add(rect);
        }
    }

    @Override
    public void componentResized(ComponentEvent e) {
        for (GRect rect : rectangles) {
            // Update the position and potentially size for each rectangle
            int newWidth = (int) Math.min(rect.getWidth(), getWidth() - (int) rect.getX());
            int newHeight = (int) Math.min(rect.getHeight(), getHeight() - (int) rect.getY());
            rect.setSize(newWidth, newHeight);
        }
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
}
