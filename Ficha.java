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
    
    /**
     * CREAR LA FICHA RESPECTIVA DE ACUERDO A LOS PARÁMETROS DE "LETRA" Y "VALOR" DE ACUERDO A 
     * LOS OFICIALES DE SCRABBLE
     */
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
     * ESTE MÉTODO PERMITE QUE SE PUEDA ARRASTRAR LAS FICHAS POR EL MUNDO, PARA COLOCARLAS EN EL TABLERO
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
        /**
         * AGREGA LOS PUNTOS DEPENDIENDO DEL COLOR EN EL QUE LA FICHA SE HA COLOCADO
         * ESTOS SON LOS PUNTOS DEL NUEVO TURNO
         */
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
    {   /**
     * DETECTA CUANDO EL BOTÓN SE PRESIONA, PARA ACTUALIZAR LOS PUNTAJES
     */
        if (myButton.isClicked())
        {
        int newPoints = getPoints();
        myLabel.setText(newPoints);    
        }
    }
}