import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class highscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class highscore extends Actor
{
    /**
     * Act - do whatever the highscore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public highscore()
    {
        setImage(new GreenfootImage("Highscore: 0", 24, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        World W = getWorld();
        controller Controller = (controller) W.getObjects(controller.class).get(0);
        setImage(new GreenfootImage("Highscore: " + Controller.getHighscore(), 24, Color.WHITE, Color.BLACK));
    }
}
