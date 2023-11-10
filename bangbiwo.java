/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class bangbiwo extends GraphicsProgram {

/** Width and height of application window in pixels */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
    private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
    private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
    private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
    private static final int BRICK_SEP = 4;

/** Width of a brick */
    private static final int BRICK_WIDTH =
      (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
    private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
    private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
    private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
    private static final int NTURNS = 3;

    private static final int DELAY = 20;


/* Method: run() */
/** Runs the Breakout program. */
    public void run() {
        setup();
        play(); 
    }

    private void setup(){
        brickWall();
        paddle();
        initialization();
        ball(); 
    }

    private void play(){
        if(ballClicked()){
            while(!gameOver()){
                moveBall();
                checkForCollisionWithWall();
                bounceOffObject();
                pause(DELAY);
            }
        playerFeedback();
        }
    }

    private void brickWall(){
        for (int i=0; i<NBRICK_ROWS; i++){
            for (int k=0; k<NBRICKS_PER_ROW; k++){
                double x = getWidth()/2-(BRICK_WIDTH*NBRICKS_PER_ROW/2)-((NBRICKS_PER_ROW-1)*BRICK_SEP)/2+BRICK_WIDTH*k+BRICK_SEP*k;
                double y = BRICK_Y_OFFSET+BRICK_HEIGHT*i+BRICK_SEP*i;
                brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
                if (i<2) brick.setColor(Color.RED);
                if(i>1 && i<4) brick.setColor(Color.ORANGE);
                if(i>3 && i<6) brick.setColor(Color.YELLOW);
                if(i>5 && i<8) brick.setColor(Color.GREEN);
                if(i>7 && i<NBRICK_ROWS) brick.setColor(Color.CYAN);
                brick.setFilled(true);
                add(brick); 
            }
        }
    }

    private void paddle(){
        paddle = new GRect(PADDLE_WIDTH,PADDLE_HEIGHT);
        paddle.setFilled(true);
        add(paddle, getWidth()/2-PADDLE_WIDTH/2, getHeight()-PADDLE_Y_OFFSET);
        addMouseListeners();
    }

    public void mousePressed(MouseEvent e){
        lastX = e.getX();
        lastY = e.getY();
        gobj = getElementAt(lastX,lastY);
    }

    public void mouseDragged(MouseEvent e){
        if (gobj == paddle){
                if(((gobj.getX()+(e.getX()-lastX))>=0) && (gobj.getX()+(e.getX()-lastX)<=(getWidth()-PADDLE_WIDTH))){
                gobj.move(e.getX()-lastX, 0);
                lastX=e.getX();
            }
        }
    }

     private void initialization(){
        GLabel label = new GLabel ("Click the ball to start the game.");
        double x = (getWidth() -  label.getWidth()) / 2;
        double y = (getHeight() +  label.getAscent()) / 2 + 25;
        label.setFont(new Font("Serif", Font.BOLD, 18));
        label.setColor(Color.GREEN);
        add(label, x, y);
    }

     private void ball(){
        ball= new GOval(getWidth()/2-BALL_RADIUS,getHeight()/2-BALL_RADIUS, BALL_RADIUS*2, BALL_RADIUS*2);
        add(ball);
        ball.setFilled(true);
        ball.sendToBack();
        vy= +3.0;
        vx=rgen.nextDouble(1.0, 3.0);
        if (rgen.nextBoolean(0.5)) vx=-vx; // makes the velocity negative half of the time.
        addMouseListeners();
     }

    public void mouseClicked(MouseEvent e){
        clickedX=e.getX();
        clickedY=e.getY();  
        firstClickedObject = getElementAt(clickedX, clickedY);
        ballClicked();
    }

    private boolean ballClicked(){
        return (firstClickedObject == ball);
    }

    private void moveBall(){
        ball.move(vx, vy);
    }

    private void checkForCollisionWithWall(){
        //determine whether there is a wall present
        if (wallPresent()){
            if(ball.getY()<0) {
                vy = -vy;       
                bounceClip.play(); 
                moveBall();
            } else {
                vx = -vx; //launch the  ball right or left by reversing its velocity
                bounceClip.play(); 
                moveBall();
            }
        }   
    }

    private boolean wallPresent(){
        return((ball.getX()+BALL_RADIUS*2)>getWidth()) || (ball.getX()<0) || (ball.getY()<0) ;
    }

    private GObject getCollidingObject(){ 

        if (getElementAt(ball.getX(), ball.getY()) != null){
            return (getElementAt(ball.getX(), ball.getY()));
        } else if (getElementAt(ball.getX()+2*BALL_RADIUS, ball.getY()) != null){ 
            return (getElementAt(ball.getX()+2*BALL_RADIUS, ball.getY()));
        } else if ((getElementAt(ball.getX(), ball.getY()+2*BALL_RADIUS) !=null)){
            return (getElementAt(ball.getX(), ball.getY()+2*BALL_RADIUS));
        } else if (getElementAt(ball.getX()+2*BALL_RADIUS, ball.getY()+2*BALL_RADIUS)!=null){
            return (getElementAt(ball.getX()+2*BALL_RADIUS, ball.getY()+2*BALL_RADIUS));
        } else {
            return (null);
        }
    }

    private void bounceOffObject(){ 
        GObject collider = getCollidingObject();

        if (collider != null){
            if(collider == paddle){
                if ((ball.getY()<=((getHeight()-PADDLE_Y_OFFSET)+(1/3)*(getHeight()-   PADDLE_Y_OFFSET)))){
                vy = - vy;
                bounceClip.play(); 
                moveBall();
                }
            } else { // meaning the ball collided with a brick;
                vy = -vy;
                bounceClip.play(); 
                moveBall();
                remove(collider);
                bricksRemaining--;
            }
        }
    }

    private boolean collisionWithObjectOccured(){
        return (getElementAt(ball.getX(), ball.getY()) != null) ||
        (getElementAt(ball.getX()+2*BALL_RADIUS, ball.getY()) != null) ||
        (getElementAt(ball.getX(), ball.getY()+2*BALL_RADIUS) !=null) ||
        (getElementAt(ball.getX()+2*BALL_RADIUS, ball.getY()+2*BALL_RADIUS)!=null);
    }

    private boolean gameOver(){
        return ((ball.getY()+BALL_RADIUS*2)>getHeight()) || (bricksRemaining == 0);
    }

    private void playerFeedback(){
        if ((ball.getY()+BALL_RADIUS*2)>getHeight()){
            GLabel label = new GLabel ("HAHA! YOU LOST! GAME OVER.");
            double x = (getWidth() - label.getWidth()) / 2;
            double y = (getHeight() + label.getAscent()) / 2;
            label.setFont(new Font("Serif", Font.BOLD, 18));
            label.setColor(Color.MAGENTA);
            add(label, x, y);
        } else {
            GLabel  label = new GLabel  ("You won! Pop that champagne! It's time to celebrate.");
            double x = (getWidth() -  label.getWidth()) / 2;
            double y = (getHeight() +  label.getAscent()) / 2;
            label.setFont(new Font("Serif", Font.BOLD, 18));
            label.setColor(Color.GREEN);
            add(label, x, y);
        } 
    }

    AudioClip bounceClip = MediaTools.loadAudioClip("bounce.au");

    private RandomGenerator rgen = RandomGenerator.getInstance();
    private GRect brick;
    private GRect paddle;
    private GObject gobj;
    private GOval ball;
    private double lastX;
    private double lastY;
    private double clickedX;
    private double clickedY;
    private double vx, vy; // velocity of the ball
    private int bricksRemaining = NBRICKS_PER_ROW *NBRICK_ROWS;
    GObject firstClickedObject;
}