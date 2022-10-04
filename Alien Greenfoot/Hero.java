import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        ControlKeyboard();
    }
    
    public void ControlKeyboard()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            move(2);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            move(-2);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
    
        if(Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            move(4);
        }

    }
}
