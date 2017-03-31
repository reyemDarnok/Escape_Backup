import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Ben Konrad Meyer 
 * @version 28.03.2017
 */
public class Menu extends World
{
    private Phase1World p1W = new Phase1World();
    private Phase2World p2W = new Phase2World();
    private Phase3World p3W = new Phase3World();
    private MapWorld mW = new MapWorld();
    private int[] textX = new int[20];
    private int[] textY = new int[20];
    private int index = 0;
    private boolean menu = false;
    //standard keylayout, customizable
    //starship up,starship left,starship down,starship right, shoot, turret left, turret right, turret recenter, player up, player left, player down, player right
    private String[] controls = {"w","a","s","d","space","left","right","down","w","a","s","d"};
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        text("ESCAPE_BACKUP",getWidth()/2,getHeight()/4);
        text("Start",getWidth()/2,getHeight()/2);
        text("Menu",getWidth()/2,getHeight()*3/4);
        p1W.setWorlds(this,p2W,p3W,mW);
        p2W.setWorlds(this,p1W,p3W,mW);
        p3W.setWorlds(this,p2W,p1W,mW);
        mW.setWorlds(this,p2W,p3W,p1W);        
    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(!(mouse==null))
        {
            if(!menu)
            {
                // Are the buttons on the start screen pressed?
                if(mouse.getX()<400 && mouse.getX()>200 && mouse.getY()<350 && mouse.getY()>250 && mouse.getButton()==1)
                {   
                    showMenu();
                } else if(mouse.getX()<400 && mouse.getX()>200 && mouse.getY()<250 && mouse.getY()>150 && mouse.getButton()==1){
                    startGame();
                }
            }
        }
    }

    public void showMenu()
    {
        deleteAllText();
        text("Schiff oben: ",75,25);
        text(controls[0],150,25);
        text("Schiff links: ",75,50);
        text(controls[1],150,50);
        text("Schiff unten: ",75,75);
        text(controls[2],150,75);
        text("Schiff rechts: ",75,100);
        text(controls[3],150,100);
    }

    public void startGame()
    {

    }

    public void text(String text, int x, int y)
    {
        showText(text,x,y);
        textX[++index] = x;
        textY[index] = y;
    }

    public void deleteAllText()
    {
        for(int i = 0; i <= index; i++)
        {
            showText(null,textX[i],textY[i]);
        }
    }
}
