import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{    
    /**
     * MÉTODO PARA DETECTAR CUANDO EL BOTÓN ES ACCIONADO
     */
    public boolean isClicked()
    {
        if (Greenfoot.mouseClicked(this))
        {   
            return true;
            
}
        else
        {   return false;}
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        isClicked();
    }
}
