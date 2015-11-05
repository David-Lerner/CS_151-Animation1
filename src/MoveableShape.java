
import java.awt.Graphics2D;


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
public interface MoveableShape 
{
    void draw(Graphics2D g2);
    void translate(int dx, int dy);
    int getX();
    int getY();
}
