import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lifeCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lifeCounter extends Actor
{
    /**
     * Act - do whatever the lifeCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lifeCounter()
    {
        setImage(new GreenfootImage("lives left: 3", 24, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        World W = getWorld();
        controller Controller = (controller) W.getObjects(controller.class).get(0);
        setImage(new GreenfootImage("Lives left: " + Controller.getLives(), 24, Color.WHITE, Color.BLACK));
    }
}
