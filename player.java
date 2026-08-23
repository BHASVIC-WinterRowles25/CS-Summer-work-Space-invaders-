import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean pause = false;
    public player()
    {
        GreenfootImage image = getImage();
        image.scale(40, 40);
        setImage(image);
    }
    public void setup()
    {
        boolean pause = true;
        World W = getWorld();
        startScreen startscreen = new startScreen();
        W.addObject(startscreen, 200, 300);
        startButton startbutton = new startButton();
        W.addObject(startbutton, 200, 400);
        title Title = new title();
        W.addObject(Title, 200, 150);
        exitButton exitbutton = new exitButton();
        W.addObject(exitbutton, 200, 525);
    }
    public void act()
    {
        World W = getWorld();
        controller Controller = (controller) W.getObjects(controller.class).get(0);
        if (!Controller.getPause())
        {
            if(Greenfoot.isKeyDown("a"))
            {
                setLocation(getX() - 5, getY());
            }
            if(Greenfoot.isKeyDown("w"))
            {
                setLocation(getX(), getY() - 5);
            }
            if(Greenfoot.isKeyDown("d"))
            {
                setLocation(getX() + 5, getY());
            }
            if(Greenfoot.isKeyDown("s"))
            {
                setLocation(getX(), getY() + 5);
            }
            String key = Greenfoot.getKey();
            if (key == "space")
            {
                shoot();
                key = null;
            }
        }
    }
    public void shoot()
    {
        World W = getWorld();
        bullet Bullet = new bullet();
        W.addObject(Bullet, getX(), getY());
    }
}
