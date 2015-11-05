
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Individual Assignment: Animation 1
 * CS 151 Fall 2015
 * Adapted from Demo8.
 * Description: A green ball drops from the ceiling of a frame and bounces back 
 * from the floor with the same speed. It continues to bounce back and forth.
 * 
 * @author David Lerner
 * @version 1.0
 */
public class Animation1Tester 
{

    private static final int DELAY        = 10; //millisecond
    private static final int ICON_WIDTH   = 800;
    private static final int ICON_HEIGHT  = 700;
    private static final int FRAME_WIDTH  = 800;
    private static final int FRAME_HEIGHT = 700;
    private static final int LABEL_WIDTH  = 100;
    private static final int LABEL_HEIGHT = 100;
    private static final int SHAPE_WIDTH  = 100;
    private static final int X            = 300;
    private static final int Y            = 0;

    private static final int DX = 0;
    private static final int DY = 2;
  
    private JFrame frame;
    private MoveableShape myMoveableShape;
    private JLabel myShape;
    
    private int bounce;
    private static final int OFFSET = 40;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Animation1Tester aTester = new Animation1Tester();
        aTester.initialSetUp();
        aTester.moveMyShape();
    }
    
    private void initialSetUp() 
    {
        myMoveableShape  = new GreenBall(X,Y, SHAPE_WIDTH);
        Animation1 myIcon = new Animation1(myMoveableShape, ICON_WIDTH, ICON_HEIGHT);
        myShape = new JLabel(myIcon);
        myShape.setSize(LABEL_WIDTH, LABEL_HEIGHT);

        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(myShape);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        bounce = -1;
    }
  
    private void moveMyShape() 
    {
        Timer t = new Timer(DELAY, getActionListener());
        t.start();
    
    }
  
    private ActionListener getActionListener() 
    {
    return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (bounce == -1 && myMoveableShape.getY() <= 0)
                    bounce = 1;
                else if (bounce == 1 && myMoveableShape.getY() + 
                        SHAPE_WIDTH + OFFSET >= ICON_HEIGHT)
                    bounce = -1;
                myMoveableShape.translate(DX, bounce * DY);
                myShape.repaint();
            }
          };
    
  }

}
