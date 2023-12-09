//import acm.program.ConsoleProgram;
//
//public class Review extends ConsoleProgram {
//	public void run() {
//		while (2 > 1) {
//
//			int x = readInt();
//			switch (x) {
//			case 0:
//				println("nuli");
//				break;
//			case 2:
//				println("ori");
//				break;
//			default:
//				println("racxa sxva");
//				break;
//
//			}
//		}
//	}
//}


import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class Review extends GraphicsProgram {

    private GOval draggableObject;

    public void run() {
        draggableObject = new GOval(100, 100, 50, 50);
        draggableObject.setFilled(true);
        add(draggableObject);

        addMouseListeners();
    }

    public void mouseDragged(MouseEvent e) {
        double dx = e.getX() - draggableObject.getX();
        double dy = e.getY() - draggableObject.getY();
        draggableObject.move(dx, dy);
    }

   
    }

