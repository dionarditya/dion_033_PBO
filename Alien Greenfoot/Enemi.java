import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemi extends Actor
{

    public Enemi() {
        setRotation(180);
    }
    public Enemi (int speed){
        setRotation(180);
         this.speed = speed; 
    }
    
    public int speed = 2;
    public void act()
    {
       
        move(speed);
    }
}
