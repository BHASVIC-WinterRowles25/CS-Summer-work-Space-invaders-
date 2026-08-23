import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startButton extends Actor
{
    /**
     * Act - do whatever the startButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public startButton()
    {
        GreenfootImage image = getImage();
        image.scale(250, 100);
        setImage(image);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            World W = getWorld();
            controller Controller = (controller) W.getObjects(controller.class).get(0);
            Controller.play();
        }
    }
}
