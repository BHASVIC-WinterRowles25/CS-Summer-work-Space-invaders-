import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverScreen extends Actor
{
    /**
     * Act - do whatever the gameOverScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public gameOverScreen()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 150, image.getHeight());
        setImage(image);
    }
}
