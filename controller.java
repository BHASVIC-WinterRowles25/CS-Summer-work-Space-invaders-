import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemySpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controller extends Actor
{
    /**
     * Act - do whatever the enemySpawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = 0;
    int counter = 0;
    int lives = 3;
    int score = 0;
    boolean pause = true;
    int highscore = 0;
    boolean gameOver = false;
    public controller()
    {
        GreenfootImage image = getImage();
        image.scale(10, 10);
        setImage(image);
    }
    public void act()
    {
        if (!pause)
        {
            if (counter > 60)
            {
                int y = 0;
                int count = 0;
                y = Greenfoot.getRandomNumber(2);
                y = y + 1;
                while (count < y)
                {
                    spawn();
                    count++;
                }
            }
            else
            {
                counter++;
            }
            if(Greenfoot.isKeyDown("e"))
            {
                pause();
            }
            if (lives == 0)
            {
                pause();
                World W = getWorld();
                gameOverScreen GameOverScreen = new gameOverScreen();
                W.removeObjects(W.getObjects(title.class));
                W.removeObjects(W.getObjects(exitButton.class));
                W.addObject(GameOverScreen, 200, 150);
                lives = 3;
                gameOver = true;
            }
        }
    }
    public void spawn()
    {
        World W = getWorld();
        enemy Enemy = new enemy();
        x = Greenfoot.getRandomNumber(7);
        x = x + 1;
        if (x == 1)
        {
            W.addObject(Enemy, 50, 50);
        }
        if (x == 2)
        {
            W.addObject(Enemy, 100, 50);
        }
        if (x == 3)
        {
            W.addObject(Enemy, 150, 50);
        }
        if (x == 4)
        {
            W.addObject(Enemy, 200, 50);
        }
        if (x == 5)
        {
            W.addObject(Enemy, 250, 50);
        }
        if (x == 6)
        {
            W.addObject(Enemy, 300, 50);
        }
        if (x == 7)
        {
            W.addObject(Enemy, 350, 50);
        }
        counter = 0;
    }
    public void die()
    {
        World W = getWorld();
        player Player = (player) W.getObjects(player.class).get(0);
        W.removeObjects(W.getObjects(enemy.class));
        W.removeObjects(W.getObjects(enemyBullet.class));
        W.removeObjects(W.getObjects(bullet.class));
        Player.setLocation(200, 550);
        lives--;
        Greenfoot.delay(120);
    }
    public void increaseScore()
    {
        score++;
        if (score > highscore)
        {
            increaseHighscore();
        }
    }
    public boolean getPause()
    {
        return pause;
    }
    public void pause()
    {
        pause = true;
        World W = getWorld();
        startScreen startscreen = new startScreen();
        W.addObject(startscreen, 200, 300);
        startButton startbutton = new startButton();
        W.addObject(startbutton, 200, 400);
        title Title = new title();
        W.addObject(Title, 200, 150);
        exitButton exitbutton = new exitButton();
        W.addObject(exitbutton, 200, 525);
        scoreInMenu ScoreInMenu = new scoreInMenu();
        W.addObject(ScoreInMenu, 200, 320);
        highscore Highscore = new highscore();
        W.addObject(Highscore, 200, 280);
    }
    public void play()
    {
        pause = false;
        if (gameOver)
        {
            score = 0;
            gameOver = false;
        }
        World W = getWorld();
        lifeCounter LifeCounter = new lifeCounter();
        W.addObject(LifeCounter, 340, 25);
        W.removeObjects(W.getObjects(title.class));
        W.removeObjects(W.getObjects(exitButton.class));
        W.removeObjects(W.getObjects(startScreen.class));
        W.removeObjects(W.getObjects(startButton.class));
        W.removeObjects(W.getObjects(highscore.class));
        W.removeObjects(W.getObjects(scoreInMenu.class));
        W.removeObjects(W.getObjects(gameOverScreen.class));
    }
    public void increaseHighscore()
    {
        highscore++;
    }
    public int getScore()
    {
        return score;
    }
    public int getHighscore()
    {
        return highscore;
    }
    public int getLives()
    {
        return lives;
    }
    public void reset()
    {
        score = 0;
        lives = 3;
        World W = getWorld();
        title Title = new title();
        player Player = (player) W.getObjects(player.class).get(0);
        W.removeObjects(W.getObjects(exitButton.class));
        W.removeObjects(W.getObjects(gameOverScreen.class));
        W.removeObjects(W.getObjects(enemy.class));
        W.removeObjects(W.getObjects(enemyBullet.class));
        W.removeObjects(W.getObjects(bullet.class));
        W.addObject(Title, 200, 150);
        Player.setLocation(200, 550);
    }
}
