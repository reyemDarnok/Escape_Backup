import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dropship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dropship extends Phase2Actor
{
    int life = 100;
    Phase2World world;
    /**
     * Act - do whatever the Dropship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setRotation(90);
       move(1);
       Greenfoot.delay(1);
       if(getY()==world.getHeight()-10)
            world.startPhase1();
    }  
    public void addedToWorld(World world)
    {
        this.world = (Phase2World) world;
    }
    public void damage(int damage)
    {
        life-=damage;
        world.regenerate(damage/10);
        if(life<0)
        {
            world.removeObject(this);
        }
    }
}
