import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player Player = new player();
        controller Controller = new controller();
        scoreInGame ScoreInGame = new scoreInGame();
        addObject(Player, 200, 550);
        addObject(Controller, 1, 1);
        addObject(ScoreInGame, 45, 25);
        startScreen startscreen = new startScreen();
        addObject(startscreen, 200, 300);
        startButton startbutton = new startButton();
        addObject(startbutton, 200, 400);
        title Title = new title();
        addObject(Title, 200, 150);
        highscore Highscore = new highscore();
        addObject(Highscore, 200, 280);
    }
}
