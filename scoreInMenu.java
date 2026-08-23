import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreInMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreInMenu extends Actor
{
    /**
     * Act - do whatever the scoreInMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public scoreInMenu()
    {
        setImage(new GreenfootImage("Score: 0", 24, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        World W = getWorld();
        controller Controller = (controller) W.getObjects(controller.class).get(0);
        setImage(new GreenfootImage("Score: " + Controller.getScore(), 24, Color.WHITE, Color.BLACK));
    }
}
