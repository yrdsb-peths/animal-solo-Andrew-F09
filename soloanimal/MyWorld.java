import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in
 * 
 * @author FOK
 * @version 1.0
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        createApple();
        
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 60, 70); 

    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(300);
        addObject(apple, x, y);
        
    }
    
     public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
