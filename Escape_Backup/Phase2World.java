import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phase2World extends World
{
    private Menu menu;
    private Phase1World p1W;
    private Phase3World p3W;
    private MapWorld mW;
    /**
     * Constructor for objects of class Phase2.
     * 
     */
    public Phase2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void setWorlds(Menu menu,Phase1World p1W, Phase3World p3W, MapWorld mW)
    {
        this.menu = menu;
        this.p1W = p1W;
        this.p3W = p3W;
        this.mW = mW;
    }
}
