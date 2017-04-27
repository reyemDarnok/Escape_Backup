import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Phase2Actor
{
    private Phase2World world;
    private int cooldown = 0;
    public void addedToWorld(World p2W)   
    {
        world=getWorldOfType(Phase2World.class);
        setRotation(270);
    }

    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()     
    {
        if(Greenfoot.isKeyDown(world.getControls()[5]))
        {
            move("left");
        } else if(Greenfoot.isKeyDown(world.getControls()[6]))
        {
            move("right");
        } else if(Greenfoot.isKeyDown(world.getControls()[7]))
        {
            move("middle"); 
        } 
        if(Greenfoot.isKeyDown(world.getControls()[4])&&cooldown==0)
        {
            world.addObject(new Bullet(getRotation()),getX(),getY());
            cooldown=25;
        }
        if(cooldown>0)
        {
            cooldown--;
        }
    }
    
   
    
    //y=1/720*(x-300)^2+275  
    //y=1/720*(x^2-600x+90000)+275
    //y=x^2/720-5*x/6+400
    public void move(String direction)
    {
        if(direction=="left" || direction=="middle" && getX()>getWorld().getWidth()/2)
        {
            setLocation(getX()-5,getY());
        } else
        if(direction=="right" || direction=="middle")
        {
            setLocation(getX()+5,getY());
        } else
        {
            Main.error("Turret: public void rotate was given an invalid Argument.");
        }
    }
}
