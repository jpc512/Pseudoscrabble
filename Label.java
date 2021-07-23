import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private int pointCount = 0;
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Label(String text)
    {
        GreenfootImage img = new GreenfootImage (200,40);
        img.drawString(text,2,20);
        img.setColor(Color.BLACK);
        setImage(img);
    }
    
    public void setText(int newPoints)
    {
        GreenfootImage img = getImage();
        img.clear();
        this.pointCount = newPoints + this.pointCount;
        String text = "PUNTOS = " + String.valueOf(pointCount);
        img.drawString(text,2,20);
    }
    
    public int getCount()
    {
        return pointCount;
    }
    
    public void setCount(int count)
    {
        this.pointCount = count;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
