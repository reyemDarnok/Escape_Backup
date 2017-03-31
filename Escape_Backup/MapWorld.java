import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapWorld extends World
{
    private Menu menu;
    private Phase2World p2W;
    private Phase3World p3W;
    private Phase1World p1W;
    private int angle;
    private String[] controls = {"w","a","s","d","space","left","right","down","w","a","s","d"};
    /**
     * Constructor for objects of class Map.
     * 
     */
    public MapWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void setWorlds(Menu menu,Phase2World p2W, Phase3World p3W, Phase1World p1W)
    {
        this.menu = menu;
        this.p2W = p2W;
        this.p3W = p3W;
        this.p1W = p1W;
    }
    public void setGlobals(String[] controls,int angle)
    {
        for(int i = 0; i<12;i++)
        this.controls[i] = controls[i];
        this.angle = angle;
    }
}
