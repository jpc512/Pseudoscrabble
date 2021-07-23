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
    private Button myButton;
    
    public Ficha(Button button, Label label, String letra,int valor)
    {
        GreenfootImage img = new GreenfootImage("tileblue.png");
        img.drawString(letra,5,15);
        setImage(img);
        this.valor = valor;
        myLabel=label;
        myButton=button;
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
        showPoints();
        
           
    }
    
    public int getPoints()
    {
        Actor roja = getOneObjectAtOffset(0,0, CasillaR.class);
        Actor rosa = getOneObjectAtOffset(0,0, CasillaP.class);
        Actor naranja = getOneObjectAtOffset(0,0, CasillaO.class);
        Actor amarilla = getOneObjectAtOffset(0,0, CasillaY.class);
        if (roja!= null)
        {
            return this.valor;
        }
        if (rosa!= null)
        {
            return this.valor*2;
        }
        if (naranja!= null)
        {
            return this.valor*4;
        }
        if (amarilla!= null)
        {
            return this.valor*8;
        }
        else
        {
            return 0;
        }
    }
    
    public void showPoints()
    {   //World world;
        //world = getWorld();
        //Button myButton = world.button;
        if (myButton.isClicked())
        {
        int newPoints = getPoints();
        myLabel.setText(newPoints);    
        }
    }
}