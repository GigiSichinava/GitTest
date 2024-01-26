import javax.swing.*;

import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adefaesaef extends GraphicsProgram{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Time remaining: ");
        frame.getContentPane().add(label);

        int delay = 1000; // 1000 milliseconds = 1 second
        Timer timer = new Timer(delay, new ActionListener() {
            int timeRemaining = 10; // Set your desired time in seconds

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Time remaining: " + timeRemaining + " seconds");
                if (timeRemaining > 0) {
                    timeRemaining--;
                } else {
                    ((Timer) e.getSource()).stop();
                    JOptionPane.showMessageDialog(frame, "Time's up!");
                }
            }
        });

        JButton startButton = new JButton("Start Timer");
        startButton.addActionListener(e -> {
            timer.start();
            startButton.setEnabled(false);
        });

        frame.getContentPane().add(startButton);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
