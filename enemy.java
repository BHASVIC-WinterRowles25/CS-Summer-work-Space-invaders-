import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemy()
    {
        GreenfootImage image = getImage();
        image.scale(40, 40);
        setImage(image);
    }
    public void act()
    {
        World W = getWorld();
        controller Controller = (controller) W.getObjects(controller.class).get(0);
        if (getNeighbours(20, true, bullet.class).isEmpty() && Controller.getPause() == false)
        {
            setLocation(getX(), getY() + 1);
        }
        if (Greenfoot.getRandomNumber(120) == 0 && Controller.getPause() == false)
        {
            enemyBullet EnemyBullet = new enemyBullet();
            W.addObject(EnemyBullet,getX(), getY());
        }
        if (!getNeighbours(10, true, player.class).isEmpty())
        {
            Controller.die();
            W.removeObject(this);
        }
        else if (getY() == 599)
        {
            Controller.die();
            W.removeObject(this);
        }
    }
}
