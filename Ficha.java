import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ficha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ficha extends Casilla
{
    private int valor;
    private Label myLabel;
    
    public Ficha(Label label, String letra,int valor)
    {
        GreenfootImage img = new GreenfootImage("tileblue.png");
        img.drawString(letra,5,15);
        setImage(img);
        this.valor = valor;
        myLabel=label;
    }
    
    /**
     * Act - do whatever the Ficha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseDragged(this))
        {
        MouseInfo info = Greenfoot.getMouseInfo();
        setLocation(info.getX(),info.getY());
        }
        
           
    }
    
    public int getPoints()
    {
        Actor roja = getOneObjectAtOffset(0,0, CasillaR.class);
        if (roja!= null)
        {
            return this.valor;
        }
        else
        {
            return 0;
        }
    }
}