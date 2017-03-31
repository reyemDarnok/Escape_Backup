import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phase3World extends World
{
    private Menu menu;
    private Phase2World p2W;
    private Phase1World p1W;
    private MapWorld mW;
    /**
     * Constructor for objects of class Phase3.
     * 
     */
    public Phase3World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void setWorlds(Menu menu,Phase2World p2W, Phase1World p1W, MapWorld mW)
    {
        this.menu = menu;
        this.p2W = p2W;
        this.p1W = p1W;
        this.mW = mW;
    }
}
