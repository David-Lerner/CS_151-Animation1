
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

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
public class GreenBall implements MoveableShape 
{
    private int x;
    private int y;
    private final int shapeWidth;
  
    public GreenBall(int x, int y, int width) 
    {
        this.x = x;
        this.y = y;
        this.shapeWidth = width;
    }

    /**
     * Draws the shape.
     * @param g2 - the Graphics2D object
     */
    @Override
    public void draw(Graphics2D g2) 
    {    
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, shapeWidth, shapeWidth);
    
        g2.setColor(Color.GREEN);
        g2.fill(circle);
    
    }

    /**
     * Translates the current coordination x,y to x+dx and y+dy.
     * @param dx - the movement amount of x 
     * @param dy - the movement amount of y
     */
    @Override
    public void translate(int dx, int dy) 
    {
        x += dx;
        y += dy;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
