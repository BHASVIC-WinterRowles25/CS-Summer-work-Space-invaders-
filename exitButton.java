import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exitButton extends Actor
{
    /**
     * Act - do whatever the exitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public exitButton()
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
            Controller.reset();
        }
    }
}
