import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Practice extends GraphicsProgram {

    private static final int DIAMETER = 30;
    private GOval player;

    public void run() {
        setUpGame();
        addKeyListeners();
    }

    private void setUpGame() {
        player = new GOval(DIAMETER, DIAMETER);
        player.setFilled(true);
        player.setColor(Color.BLUE);
        add(player, getWidth() / 2 - DIAMETER / 2, getHeight() / 2 - DIAMETER / 2);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                movePlayer(0, -5);
                break;
            case KeyEvent.VK_DOWN:
                movePlayer(0, 5);
                break;
            case KeyEvent.VK_LEFT:
                movePlayer(-5, 0);
                break;
            case KeyEvent.VK_RIGHT:
                movePlayer(5, 0);
                break;
        }
    }

    private void movePlayer(int dx, int dy) {
        player.move(dx, dy);
    }
}
