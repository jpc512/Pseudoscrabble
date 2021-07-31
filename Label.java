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
     * CREA LA PRIMERA IMAGEN QUE CONTIENE LOS PUNTAJES
     */
    
    public Label(String text)
    {
        setImage(new GreenfootImage("PUNTOS", 24,Color.WHITE, Color.BLACK));
    }
    
    /**
     * SETTEXT ACTUALIZA LOS PUNTOS UTILIZANDO COMO PARÁMETRO LOS NUEVOS PUNTOS DEL TURNO
     * ESTE MÉTODO SE LLAMA DESDE
     */
    public void setText(int newPoints)
    {
        this.pointCount = newPoints + this.pointCount;
        String text = "PUNTOS = " + String.valueOf(pointCount);
        setImage(new GreenfootImage(text, 24,Color.BLACK, Color.WHITE));
    }
    
    /**
     * SET Y GET DE LA VARIABLE POINTCOUNT, QUE SE UTILIZA PARA ACTUALIZAR EL TEXTO
     */
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
