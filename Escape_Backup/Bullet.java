import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Phase2Actor
{
    private int rot;
    public Bullet(int rotation)
    {
       rot=rotation; 
    }
    public void addedToWorld(World world)
    {
        setRotation(rot);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        Dropship enemy = (Dropship) getOneIntersectingObject(Dropship.class);
        if(enemy!=null)
        {
            Phase2World world = (Phase2World) getWorld();
            enemy.damage(100);
            world.removeObject(this);
        }
        // Add your action code here.
    }    
}
