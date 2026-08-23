import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bullet()
    {
        GreenfootImage image = getImage();
        image.scale(10, 10);
        setImage(image);
    }
    public void act()
    {
        if (getNeighbours(20, true, enemy.class).isEmpty())
        {
            setLocation(getX(), getY() - 10);
        }
        if (!getNeighbours(20, true, enemy.class).isEmpty())
        {
            World W = getWorld();
            controller Controller = (controller) W.getObjects(controller.class).get(0);
            Controller.increaseScore();
            W.removeObject((getNeighbours(20, true, enemy.class).get(0)));
            W.removeObject(this);
        }
        else if (getY() == 0)
        {
            World W = getWorld();
            W.removeObject(this);
        }
    }
}
