
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

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
public class Animation1 implements Icon 
{

    private final MoveableShape myMoveableShape;
    private final int width;
    private final int height;


    Animation1(MoveableShape shape, int width, int height) 
    {
        this.myMoveableShape  = shape;
        this.width  = width;
        this.height = height;
    }


    @Override
    public void paintIcon(Component cmpnt, Graphics g, int x, int y) 
    {
        Graphics2D g2 = (Graphics2D) g;
        myMoveableShape.draw(g2);   
    }


    @Override
    public int getIconWidth() 
    {
        return width;
    }


    @Override
    public int getIconHeight() 
    {
        return height;
    }

}

