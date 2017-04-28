import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Main extends Actor
{
    /**
     * Act - do whatever the Main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static void error(String message)
    {
        System.out.println(message);
        Greenfoot.stop();
    }
}
