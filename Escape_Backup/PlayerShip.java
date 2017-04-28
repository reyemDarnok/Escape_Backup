import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerShip extends Phase3Actor
{
    private boolean friendly = true;
    private int cooldown = 0;
    public PlayerShip(int life,int damage)
    {
        super(life,damage);
    }
    /**
     * Act - do whatever the PlayerShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        if(cooldown>0)
        {
            cooldown--;
        }
    }
    public void move()
    {
        if(Greenfoot.isKeyDown(world.getControls()[0]))
        {
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown(world.getControls()[1]))
        {
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown(world.getControls()[2]))
        {
            setLocation(getX(),getY()+5);
        }
        if(Greenfoot.isKeyDown(world.getControls()[3]))
        {
            setLocation(getX()+5,getY());
        }
         if(Greenfoot.isKeyDown(world.getControls()[4])&&cooldown<=0)
        {
            shoot(friendly); 
            cooldown=25;
        }
      
        // Add your action code here.
    }    
}
