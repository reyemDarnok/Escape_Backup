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
    private int angle;
    private String[] controls = {"w","a","s","d","space","left","right","down","w","a","s","d"};
    private Turret turret = new Turret();
    private int energy = -200;
    private int dropshipCooldown = 100;
    /**
     * Constructor for objects of class Phase2.
     * 
     */
    public Phase2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(turret,300,575);
    }
    
    public void act()
    {
        spawnDropship();
        if(dropshipCooldown>0)
        {
            dropshipCooldown--;
        }
    }
    
    public void spawnDropship()
    {
        if(dropshipCooldown==0)
        {
            addObject(new Dropship(),Greenfoot.getRandomNumber(getWidth()),0);
            dropshipCooldown=100;
        }
    }
    
    public void startPhase1()
    {
        Greenfoot.setWorld(p1W);
    }
    
    public void regenerate(int energy)
    {
        this.energy+=energy;
        if(this.energy>0)
            startPhase3(energy);
    }
    
    public void startPhase3(int surplusEnergy)
    {
        Greenfoot.setWorld(p3W);
    }
    
    public String[] getControls()
    {
        return controls;
    }

    public void setWorlds(Menu menu,Phase1World p1W, Phase3World p3W, MapWorld mW)
    {
        this.menu = menu;
        this.p1W = p1W;
        this.p3W = p3W;
        this.mW = mW;
    }
    public void setGlobals(String[] controls,int angle)
    {
        for(int i = 0; i<12;i++)
        this.controls[i] = controls[i];
        this.angle = angle;
    }
}
