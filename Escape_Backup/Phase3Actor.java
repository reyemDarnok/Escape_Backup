import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase3Actor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Phase3Actor extends Actor
{
    protected int life = 100;
    protected int damage = 50;
    protected Phase3World world;
    protected boolean friendly;
    public void addedToWorld(World world)
    {
        this.world=(Phase3World) world;
    }
    public Phase3Actor(int life,int damage)
    {
        this.life=life;
        this.damage=damage;
    }
    public void damage(int damage)
    {
        life-=damage;
        if(life<0)
            world.removeObject(this);
    }
    public void shoot(boolean friendly)
    {
        world.addObject(new p3Bullet(getRotation(),damage,friendly),getX(),getY());
    }
    
    /**
     * Act - do whatever the Phase3Actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
