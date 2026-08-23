import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyBullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemyBullet()
    {
        GreenfootImage image = getImage();
        image.scale(10, 10);
        setImage(image);
    }
    public void act()
    {
        if (getNeighbours(10, true, player.class).isEmpty())
        {
            setLocation(getX(), getY() + 5);
        }
        if (!getNeighbours(10, true, player.class).isEmpty())
        {
            World W = getWorld();
            controller Controller = (controller) W.getObjects(controller.class).get(0);
            Controller.die();
            W.removeObject(this);
        }
        else if (getY() == 599)
        {
            World W = getWorld();
            W.removeObject(this);
        }
    }
}
