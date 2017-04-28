import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p3Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p3Bullet extends Phase3Actor
{
    private boolean friendly;
    public p3Bullet(int rotation,int damage,boolean friendly)
    {
        super(0,damage);
        setRotation(rotation);
        this.friendly=friendly;
    }
    /**
     * Act - do whatever the p3Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        hit();
        if(getX()<20 || getX()>world.getWidth()-19 || getY()<20 || getY()>world.getHeight()-19)
            world.removeObject(this);
        // Add your action code here.
    }    
    public void hit()
    {
        if(friendly)
        {
            EnemyShip enemy=(EnemyShip)getOneIntersectingObject(EnemyShip.class);
            if(enemy!=null)
            {
                enemy.damage(damage);
                world.removeObject(this);
            }
        } else {
            PlayerShip enemy=(PlayerShip)getOneIntersectingObject(PlayerShip.class);
            if(enemy!=null)
            {
                enemy.damage(damage);
                world.removeObject(this);
            }
        }
    }
}
