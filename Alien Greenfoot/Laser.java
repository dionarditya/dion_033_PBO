import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        laserCollision();
    }
    
    public void laserCollision()
    {
        if (isTouching(Alien.class))
        {
            removeTouching(Alien.class);
           getWorld().addObject(new Boom(),getX(),getY());
              //removeTouching(Alien.class);
              getWorld().removeObject(this);
              
        }else if (isAtEdge())
            getWorld().removeObject(this);
    }

}
