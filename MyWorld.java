import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // AGREGAR TABLERO
        Label label = new Label("PUNTOS");
        addObject(label,100,260);
        
        
        
        Casilla casilla1 = new CasillaR();
        addObject(casilla1,220,40);
        Casilla casilla2 = new CasillaR();
        addObject(casilla2,240,40);
        Casilla casilla3 = new CasillaR();
        addObject(casilla3,260,40);
        Casilla casilla4 = new CasillaR();
        addObject(casilla4,280,40);
        Casilla casilla5 = new CasillaR();
        addObject(casilla5,300,40);
        Casilla casilla6 = new CasillaR();
        addObject(casilla6,320,40);
        Casilla casilla7 = new CasillaR();
        addObject(casilla7,340,40);
        Casilla casilla8 = new CasillaR();
        addObject(casilla8,360,40);
        Casilla casilla9 = new CasillaR();
        addObject(casilla9,380,40);
        Casilla casilla10 = new CasillaR();
        addObject(casilla10,400,40);
        Casilla casilla11 = new CasillaR();
        addObject(casilla11,420,40);
        Casilla casilla12 = new CasillaR();
        addObject(casilla12,440,40);
        Casilla casilla13 = new CasillaR();
        addObject(casilla13,460,40);
        Casilla casilla14 = new CasillaR();
        addObject(casilla14,480,40);
        Casilla casilla15 = new CasillaR();
        addObject(casilla15,500,40);

        Casilla casilla1_2 = new CasillaR();
        addObject(casilla1_2,220,60);
        Casilla casilla2_2 = new CasillaP();
        addObject(casilla2_2,240,60);
        Casilla casilla3_2 = new CasillaR();
        addObject(casilla3_2,260,60);
        Casilla casilla4_2 = new CasillaR();
        addObject(casilla4_2,280,60);
        Casilla casilla5_2 = new CasillaR();
        addObject(casilla5_2,300,60);
        Casilla casilla6_2 = new CasillaO();
        addObject(casilla6_2,320,60);
        Casilla casilla7_2 = new CasillaR();
        addObject(casilla7_2,340,60);
        Casilla casilla8_2 = new CasillaR();
        addObject(casilla8_2,360,60);
        Casilla casilla9_2 = new CasillaR();
        addObject(casilla9_2,380,60);
        Casilla casilla10_2 = new CasillaO();
        addObject(casilla10_2,400,60);
        Casilla casilla11_2 = new CasillaR();
        addObject(casilla11_2,420,60);
        Casilla casilla12_2 = new CasillaR();
        addObject(casilla12_2,440,60);
        Casilla casilla13_2 = new CasillaR();
        addObject(casilla13_2,460,60);
        Casilla casilla14_2 = new CasillaP();
        addObject(casilla14_2,480,60);
        Casilla casilla15_2 = new CasillaR();
        addObject(casilla15_2,500,60);

        Casilla casilla1_3 = new CasillaR();
        addObject(casilla1_3,220,80);
        Casilla casilla2_3 = new CasillaR();
        addObject(casilla2_3,240,80);
        Casilla casilla3_3 = new CasillaP();
        addObject(casilla3_3,260,80);
        Casilla casilla4_3 = new CasillaR();
        addObject(casilla4_3,280,80);
        Casilla casilla5_3 = new CasillaR();
        addObject(casilla5_3,300,80);
        Casilla casilla6_3 = new CasillaR();
        addObject(casilla6_3,320,80);
        Casilla casilla7_3 = new CasillaY();
        addObject(casilla7_3,340,80);
        Casilla casilla8_3 = new CasillaR();
        addObject(casilla8_3,360,80);
        Casilla casilla9_3 = new CasillaY();
        addObject(casilla9_3,380,80);
        Casilla casilla10_3 = new CasillaR();
        addObject(casilla10_3,400,80);
        Casilla casilla11_3 = new CasillaR();
        addObject(casilla11_3,420,80);
        Casilla casilla12_3 = new CasillaR();
        addObject(casilla12_3,440,80);
        Casilla casilla13_3 = new CasillaP();
        addObject(casilla13_3,460,80);
        Casilla casilla14_3 = new CasillaR();
        addObject(casilla14_3,480,80);
        Casilla casilla15_3 = new CasillaR();
        addObject(casilla15_3,500,80);

        Casilla casilla1_4 = new CasillaR();
        addObject(casilla1_4,220,100);
        Casilla casilla2_4 = new CasillaR();
        addObject(casilla2_4,240,100);
        Casilla casilla3_4 = new CasillaR();
        addObject(casilla3_4,260,100);
        Casilla casilla4_4 = new CasillaP();
        addObject(casilla4_4,280,100);
        Casilla casilla5_4 = new CasillaR();
        addObject(casilla5_4,300,100);
        Casilla casilla6_4 = new CasillaR();
        addObject(casilla6_4,320,100);
        Casilla casilla7_4 = new CasillaR();
        addObject(casilla7_4,340,100);
        Casilla casilla8_4 = new CasillaY();
        addObject(casilla8_4,360,100);
        Casilla casilla9_4 = new CasillaR();
        addObject(casilla9_4,380,100);
        Casilla casilla10_4 = new CasillaR();
        addObject(casilla10_4,400,100);
        Casilla casilla11_4 = new CasillaR();
        addObject(casilla11_4,420,100);
        Casilla casilla12_4 = new CasillaP();
        addObject(casilla12_4,440,100);
        Casilla casilla13_4 = new CasillaR();
        addObject(casilla13_4,460,100);
        Casilla casilla14_4 = new CasillaR();
        addObject(casilla14_4,480,100);
        Casilla casilla15_4 = new CasillaR();
        addObject(casilla15_4,500,100);

        Casilla casilla1_5 = new CasillaR();
        addObject(casilla1_5,220,120);
        Casilla casilla2_5 = new CasillaR();
        addObject(casilla2_5,240,120);
        Casilla casilla3_5 = new CasillaR();
        addObject(casilla3_5,260,120);
        Casilla casilla4_5 = new CasillaR();
        addObject(casilla4_5,280,120);
        Casilla casilla5_5 = new CasillaP();
        addObject(casilla5_5,300,120);
        Casilla casilla6_5 = new CasillaR();
        addObject(casilla6_5,320,120);
        Casilla casilla7_5 = new CasillaR();
        addObject(casilla7_5,340,120);
        Casilla casilla8_5 = new CasillaR();
        addObject(casilla8_5,360,120);
        Casilla casilla9_5 = new CasillaR();
        addObject(casilla9_5,380,120);
        Casilla casilla10_5 = new CasillaR();
        addObject(casilla10_5,400,120);
        Casilla casilla11_5 = new CasillaP();
        addObject(casilla11_5,420,120);
        Casilla casilla12_5 = new CasillaR();
        addObject(casilla12_5,440,120);
        Casilla casilla13_5 = new CasillaR();
        addObject(casilla13_5,460,120);
        Casilla casilla14_5 = new CasillaR();
        addObject(casilla14_5,480,120);
        Casilla casilla15_5 = new CasillaR();
        addObject(casilla15_5,500,120);

        Casilla casilla1_6 = new CasillaR();
        addObject(casilla1_6,220,140);
        Casilla casilla2_6 = new CasillaO();
        addObject(casilla2_6,240,140);
        Casilla casilla3_6 = new CasillaR();
        addObject(casilla3_6,260,140);
        Casilla casilla4_6 = new CasillaR();
        addObject(casilla4_6,280,140);
        Casilla casilla5_6 = new CasillaR();
        addObject(casilla5_6,300,140);
        Casilla casilla6_6 = new CasillaO();
        addObject(casilla6_6,320,140);
        Casilla casilla7_6 = new CasillaR();
        addObject(casilla7_6,340,140);
        Casilla casilla8_6 = new CasillaR();
        addObject(casilla8_6,360,140);
        Casilla casilla9_6 = new CasillaR();
        addObject(casilla9_6,380,140);
        Casilla casilla10_6 = new CasillaO();
        addObject(casilla10_6,400,140);
        Casilla casilla11_6 = new CasillaR();
        addObject(casilla11_6,420,140);
        Casilla casilla12_6 = new CasillaR();
        addObject(casilla12_6,440,140);
        Casilla casilla13_6 = new CasillaR();
        addObject(casilla13_6,460,140);
        Casilla casilla14_6 = new CasillaO();
        addObject(casilla14_6,480,140);
        Casilla casilla15_6 = new CasillaR();
        addObject(casilla15_6,500,140);

        Casilla casilla1_7 = new CasillaR();
        addObject(casilla1_7,220,160);
        Casilla casilla2_7 = new CasillaR();
        addObject(casilla2_7,240,160);
        Casilla casilla3_7 = new CasillaY();
        addObject(casilla3_7,260,160);
        Casilla casilla4_7 = new CasillaR();
        addObject(casilla4_7,280,160);
        Casilla casilla5_7 = new CasillaR();
        addObject(casilla5_7,300,160);
        Casilla casilla6_7 = new CasillaR();
        addObject(casilla6_7,320,160);
        Casilla casilla7_7 = new CasillaY();
        addObject(casilla7_7,340,160);
        Casilla casilla8_7 = new CasillaR();
        addObject(casilla8_7,360,160);
        Casilla casilla9_7 = new CasillaY();
        addObject(casilla9_7,380,160);
        Casilla casilla10_7 = new CasillaR();
        addObject(casilla10_7,400,160);
        Casilla casilla11_7 = new CasillaR();
        addObject(casilla11_7,420,160);
        Casilla casilla12_7 = new CasillaR();
        addObject(casilla12_7,440,160);
        Casilla casilla13_7 = new CasillaY();
        addObject(casilla13_7,460,160);
        Casilla casilla14_7 = new CasillaR();
        addObject(casilla14_7,480,160);
        Casilla casilla15_7 = new CasillaR();
        addObject(casilla15_7,500,160);

        Casilla casilla1_8 = new CasillaR();
        addObject(casilla1_8,220,180);
        Casilla casilla2_8 = new CasillaR();
        addObject(casilla2_8,240,180);
        Casilla casilla3_8 = new CasillaR();
        addObject(casilla3_8,260,180);
        Casilla casilla4_8 = new CasillaY();
        addObject(casilla4_8,280,180);
        Casilla casilla5_8 = new CasillaR();
        addObject(casilla5_8,300,180);
        Casilla casilla6_8 = new CasillaR();
        addObject(casilla6_8,320,180);
        Casilla casilla7_8 = new CasillaR();
        addObject(casilla7_8,340,180);
        Casilla casilla8_8 = new CasillaP();
        addObject(casilla8_8,360,180);
        Casilla casilla9_8 = new CasillaR();
        addObject(casilla9_8,380,180);
        Casilla casilla10_8 = new CasillaR();
        addObject(casilla10_8,400,180);
        Casilla casilla11_8 = new CasillaR();
        addObject(casilla11_8,420,180);
        Casilla casilla12_8 = new CasillaY();
        addObject(casilla12_8,440,180);
        Casilla casilla13_8 = new CasillaR();
        addObject(casilla13_8,460,180);
        Casilla casilla14_8 = new CasillaR();
        addObject(casilla14_8,480,180);
        Casilla casilla15_8 = new CasillaR();
        addObject(casilla15_8,500,180);

        Casilla casilla1_9 = new CasillaR();
        addObject(casilla1_9,220,200);
        Casilla casilla2_9 = new CasillaR();
        addObject(casilla2_9,240,200);
        Casilla casilla3_9 = new CasillaY();
        addObject(casilla3_9,260,200);
        Casilla casilla4_9 = new CasillaR();
        addObject(casilla4_9,280,200);
        Casilla casilla5_9 = new CasillaR();
        addObject(casilla5_9,300,200);
        Casilla casilla6_9 = new CasillaR();
        addObject(casilla6_9,320,200);
        Casilla casilla7_9 = new CasillaY();
        addObject(casilla7_9,340,200);
        Casilla casilla8_9 = new CasillaR();
        addObject(casilla8_9,360,200);
        Casilla casilla9_9 = new CasillaY();
        addObject(casilla9_9,380,200);
        Casilla casilla10_9 = new CasillaR();
        addObject(casilla10_9,400,200);
        Casilla casilla11_9 = new CasillaR();
        addObject(casilla11_9,420,200);
        Casilla casilla12_9 = new CasillaR();
        addObject(casilla12_9,440,200);
        Casilla casilla13_9 = new CasillaY();
        addObject(casilla13_9,460,200);
        Casilla casilla14_9 = new CasillaR();
        addObject(casilla14_9,480,200);
        Casilla casilla15_9 = new CasillaR();
        addObject(casilla15_9,500,200);

        Casilla casilla1_10 = new CasillaR();
        addObject(casilla1_10,220,220);
        Casilla casilla2_10 = new CasillaO();
        addObject(casilla2_10,240,220);
        Casilla casilla3_10 = new CasillaR();
        addObject(casilla3_10,260,220);
        Casilla casilla4_10 = new CasillaR();
        addObject(casilla4_10,280,220);
        Casilla casilla5_10 = new CasillaR();
        addObject(casilla5_10,300,220);
        Casilla casilla6_10 = new CasillaO();
        addObject(casilla6_10,320,220);
        Casilla casilla7_10 = new CasillaR();
        addObject(casilla7_10,340,220);
        Casilla casilla8_10 = new CasillaR();
        addObject(casilla8_10,360,220);
        Casilla casilla9_10 = new CasillaR();
        addObject(casilla9_10,380,220);
        Casilla casilla10_10 = new CasillaO();
        addObject(casilla10_10,400,220);
        Casilla casilla11_10 = new CasillaR();
        addObject(casilla11_10,420,220);
        Casilla casilla12_10 = new CasillaR();
        addObject(casilla12_10,440,220);
        Casilla casilla13_10 = new CasillaR();
        addObject(casilla13_10,460,220);
        Casilla casilla14_10 = new CasillaO();
        addObject(casilla14_10,480,220);
        Casilla casilla15_10 = new CasillaR();
        addObject(casilla15_10,500,220);

        Casilla casilla1_11 = new CasillaR();
        addObject(casilla1_11,220,240);
        Casilla casilla2_11 = new CasillaR();
        addObject(casilla2_11,240,240);
        Casilla casilla3_11 = new CasillaR();
        addObject(casilla3_11,260,240);
        Casilla casilla4_11 = new CasillaR();
        addObject(casilla4_11,280,240);
        Casilla casilla5_11 = new CasillaP();
        addObject(casilla5_11,300,240);
        Casilla casilla6_11 = new CasillaR();
        addObject(casilla6_11,320,240);
        Casilla casilla7_11 = new CasillaR();
        addObject(casilla7_11,340,240);
        Casilla casilla8_11 = new CasillaR();
        addObject(casilla8_11,360,240);
        Casilla casilla9_11 = new CasillaR();
        addObject(casilla9_11,380,240);
        Casilla casilla10_11 = new CasillaR();
        addObject(casilla10_11,400,240);
        Casilla casilla11_11 = new CasillaP();
        addObject(casilla11_11,420,240);
        Casilla casilla12_11 = new CasillaR();
        addObject(casilla12_11,440,240);
        Casilla casilla13_11 = new CasillaR();
        addObject(casilla13_11,460,240);
        Casilla casilla14_11 = new CasillaR();
        addObject(casilla14_11,480,240);
        Casilla casilla15_11 = new CasillaR();
        addObject(casilla15_11,500,240);

        Casilla casilla1_12 = new CasillaR();
        addObject(casilla1_12,220,260);
        Casilla casilla2_12 = new CasillaR();
        addObject(casilla2_12,240,260);
        Casilla casilla3_12 = new CasillaR();
        addObject(casilla3_12,260,260);
        Casilla casilla4_12 = new CasillaP();
        addObject(casilla4_12,280,260);
        Casilla casilla5_12 = new CasillaR();
        addObject(casilla5_12,300,260);
        Casilla casilla6_12 = new CasillaR();
        addObject(casilla6_12,320,260);
        Casilla casilla7_12 = new CasillaR();
        addObject(casilla7_12,340,260);
        Casilla casilla8_12 = new CasillaY();
        addObject(casilla8_12,360,260);
        Casilla casilla9_12 = new CasillaR();
        addObject(casilla9_12,380,260);
        Casilla casilla10_12 = new CasillaR();
        addObject(casilla10_12,400,260);
        Casilla casilla11_12 = new CasillaR();
        addObject(casilla11_12,420,260);
        Casilla casilla12_12 = new CasillaP();
        addObject(casilla12_12,440,260);
        Casilla casilla13_12 = new CasillaR();
        addObject(casilla13_12,460,260);
        Casilla casilla14_12 = new CasillaR();
        addObject(casilla14_12,480,260);
        Casilla casilla15_12 = new CasillaR();
        addObject(casilla15_12,500,260);

        Casilla casilla1_13 = new CasillaR();
        addObject(casilla1_13,220,280);
        Casilla casilla2_13 = new CasillaR();
        addObject(casilla2_13,240,280);
        Casilla casilla3_13 = new CasillaP();
        addObject(casilla3_13,260,280);
        Casilla casilla4_13 = new CasillaR();
        addObject(casilla4_13,280,280);
        Casilla casilla5_13 = new CasillaR();
        addObject(casilla5_13,300,280);
        Casilla casilla6_13 = new CasillaR();
        addObject(casilla6_13,320,280);
        Casilla casilla7_13 = new CasillaY();
        addObject(casilla7_13,340,280);
        Casilla casilla8_13 = new CasillaR();
        addObject(casilla8_13,360,280);
        Casilla casilla9_13 = new CasillaY();
        addObject(casilla9_13,380,280);
        Casilla casilla10_13 = new CasillaR();
        addObject(casilla10_13,400,280);
        Casilla casilla11_13 = new CasillaR();
        addObject(casilla11_13,420,280);
        Casilla casilla12_13 = new CasillaR();
        addObject(casilla12_13,440,280);
        Casilla casilla13_13 = new CasillaP();
        addObject(casilla13_13,460,280);
        Casilla casilla14_13 = new CasillaR();
        addObject(casilla14_13,480,280);
        Casilla casilla15_13 = new CasillaR();
        addObject(casilla15_13,500,280);

        Casilla casilla1_14 = new CasillaR();
        addObject(casilla1_14,220,300);
        Casilla casilla2_14 = new CasillaP();
        addObject(casilla2_14,240,300);
        Casilla casilla3_14 = new CasillaR();
        addObject(casilla3_14,260,300);
        Casilla casilla4_14 = new CasillaR();
        addObject(casilla4_14,280,300);
        Casilla casilla5_14 = new CasillaR();
        addObject(casilla5_14,300,300);
        Casilla casilla6_14 = new CasillaO();
        addObject(casilla6_14,320,300);
        Casilla casilla7_14 = new CasillaR();
        addObject(casilla7_14,340,300);
        Casilla casilla8_14 = new CasillaR();
        addObject(casilla8_14,360,300);
        Casilla casilla9_14 = new CasillaR();
        addObject(casilla9_14,380,300);
        Casilla casilla10_14 = new CasillaO();
        addObject(casilla10_14,400,300);
        Casilla casilla11_14 = new CasillaR();
        addObject(casilla11_14,420,300);
        Casilla casilla12_14 = new CasillaR();
        addObject(casilla12_14,440,300);
        Casilla casilla13_14 = new CasillaR();
        addObject(casilla13_14,460,300);
        Casilla casilla14_14 = new CasillaP();
        addObject(casilla14_14,480,300);
        Casilla casilla15_14 = new CasillaR();
        addObject(casilla15_14,500,300);

        Casilla casilla1_15 = new CasillaR();
        addObject(casilla1_15,220,320);
        Casilla casilla2_15 = new CasillaR();
        addObject(casilla2_15,240,320);
        Casilla casilla3_15 = new CasillaR();
        addObject(casilla3_15,260,320);
        Casilla casilla4_15 = new CasillaR();
        addObject(casilla4_15,280,320);
        Casilla casilla5_15 = new CasillaR();
        addObject(casilla5_15,300,320);
        Casilla casilla6_15 = new CasillaR();
        addObject(casilla6_15,320,320);
        Casilla casilla7_15 = new CasillaR();
        addObject(casilla7_15,340,320);
        Casilla casilla8_15 = new CasillaR();
        addObject(casilla8_15,360,320);
        Casilla casilla9_15 = new CasillaR();
        addObject(casilla9_15,380,320);
        Casilla casilla10_15 = new CasillaR();
        addObject(casilla10_15,400,320);
        Casilla casilla11_15 = new CasillaR();
        addObject(casilla11_15,420,320);
        Casilla casilla12_15 = new CasillaR();
        addObject(casilla12_15,440,320);
        Casilla casilla13_15 = new CasillaR();
        addObject(casilla13_15,460,320);
        Casilla casilla14_15 = new CasillaR();
        addObject(casilla14_15,480,320);
        Casilla casilla15_15 = new CasillaR();
        addObject(casilla15_15,500,320);

        //AGREGAR LETRAS
        Ficha ficha1 = new Ficha(label,"A",1);
        int x = Greenfoot.getRandomNumber(360)+220;
        int y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha1,x,y);

        
        Ficha ficha2 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha2,x,y);
        Ficha ficha3 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha3,x,y);
        Ficha ficha4 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha4,x,y);
        Ficha ficha5 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha5,x,y);
        Ficha ficha6 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha6,x,y);
        Ficha ficha7 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha7,x,y);
        Ficha ficha8 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha8,x,y);
        Ficha ficha9 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha9,x,y);
        Ficha ficha10 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha10,x,y);
        Ficha ficha11 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha11,x,y);
        Ficha ficha12 = new Ficha(label,"A",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha12,x,y);
        Ficha ficha13 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha13,x,y);
        Ficha ficha14 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha14,x,y);
        Ficha ficha15 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha15,x,y);
        Ficha ficha16 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha16,x,y);
        Ficha ficha17 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha17,x,y);
        Ficha ficha18 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha18,x,y);
        Ficha ficha19 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha19,x,y);
        Ficha ficha20 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha20,x,y);
        Ficha ficha21 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha21,x,y);
        Ficha ficha22 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha22,x,y);
        Ficha ficha23 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha23,x,y);
        Ficha ficha24 = new Ficha(label,"E",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha24,x,y);
        Ficha ficha25 = new Ficha(label,"I",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha25,x,y);
        Ficha ficha26 = new Ficha(label,"I",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha26,x,y);
        Ficha ficha27 = new Ficha(label,"I",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha27,x,y);
        Ficha ficha28 = new Ficha(label,"I",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha28,x,y);
        Ficha ficha29 = new Ficha(label,"I",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha29,x,y);
        Ficha ficha30 = new Ficha(label,"I",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha30,x,y);
        Ficha ficha31 = new Ficha(label,"L",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha31,x,y);
        Ficha ficha32 = new Ficha(label,"L",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha32,x,y);
        Ficha ficha33 = new Ficha(label,"L",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha33,x,y);
        Ficha ficha34 = new Ficha(label,"L",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha34,x,y);
        Ficha ficha35 = new Ficha(label,"N",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha35,x,y);
        Ficha ficha36 = new Ficha(label,"N",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha36,x,y);
        Ficha ficha37 = new Ficha(label,"N",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha37,x,y);
        Ficha ficha38 = new Ficha(label,"N",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha38,x,y);
        Ficha ficha39 = new Ficha(label,"N",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha39,x,y);
        Ficha ficha40 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha40,x,y);
        Ficha ficha41 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha41,x,y);
        Ficha ficha42 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha42,x,y);
        Ficha ficha43 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha43,x,y);
        Ficha ficha44 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha44,x,y);
        Ficha ficha45 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha45,x,y);
        Ficha ficha46 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha46,x,y);
        Ficha ficha47 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha47,x,y);
        Ficha ficha48 = new Ficha(label,"O",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha48,x,y);
        Ficha ficha49 = new Ficha(label,"R",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha49,x,y);
        Ficha ficha50 = new Ficha(label,"R",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha50,x,y);
        Ficha ficha51 = new Ficha(label,"R",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha51,x,y);
        Ficha ficha52 = new Ficha(label,"R",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha52,x,y);
        Ficha ficha53 = new Ficha(label,"R",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha53,x,y);
        Ficha ficha54 = new Ficha(label,"S",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha54,x,y);
        Ficha ficha55 = new Ficha(label,"S",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha55,x,y);
        Ficha ficha56 = new Ficha(label,"S",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha56,x,y);
        Ficha ficha57 = new Ficha(label,"S",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha57,x,y);
        Ficha ficha58 = new Ficha(label,"S",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha58,x,y);
        Ficha ficha59 = new Ficha(label,"S",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha59,x,y);
        Ficha ficha60 = new Ficha(label,"T",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha60,x,y);
        Ficha ficha61 = new Ficha(label,"T",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha61,x,y);
        Ficha ficha62 = new Ficha(label,"T",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha62,x,y);
        Ficha ficha63 = new Ficha(label,"T",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha63,x,y);
        Ficha ficha64 = new Ficha(label,"U",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha64,x,y);
        Ficha ficha65 = new Ficha(label,"U",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha65,x,y);
        Ficha ficha66 = new Ficha(label,"U",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha66,x,y);
        Ficha ficha67 = new Ficha(label,"U",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha67,x,y);
        Ficha ficha68 = new Ficha(label,"U",1);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha68,x,y);
        Ficha ficha69 = new Ficha(label,"D",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha69,x,y);
        Ficha ficha70 = new Ficha(label,"D",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha70,x,y);
        Ficha ficha71 = new Ficha(label,"D",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha71,x,y);
        Ficha ficha72 = new Ficha(label,"D",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha72,x,y);
        Ficha ficha73 = new Ficha(label,"D",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha73,x,y);
        Ficha ficha74 = new Ficha(label,"G",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha74,x,y);
        Ficha ficha75 = new Ficha(label,"G",2);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha75,x,y);
        Ficha ficha76 = new Ficha(label,"B",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha76,x,y);
        Ficha ficha77 = new Ficha(label,"B",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha77,x,y);
        Ficha ficha78 = new Ficha(label,"C",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha78,x,y);
        Ficha ficha79 = new Ficha(label,"C",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha79,x,y);
        Ficha ficha80 = new Ficha(label,"C",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha80,x,y);
        Ficha ficha81 = new Ficha(label,"C",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha81,x,y);
        Ficha ficha82 = new Ficha(label,"M",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha82,x,y);
        Ficha ficha83 = new Ficha(label,"M",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha83,x,y);
        Ficha ficha84 = new Ficha(label,"P",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha84,x,y);
        Ficha ficha85 = new Ficha(label,"P",3);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha85,x,y);
        Ficha ficha86 = new Ficha(label,"F",4);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha86,x,y);
        Ficha ficha87 = new Ficha(label,"H",4);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha87,x,y);
        Ficha ficha88 = new Ficha(label,"H",4);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha88,x,y);
        Ficha ficha89 = new Ficha(label,"V",4);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha89,x,y);
        Ficha ficha90 = new Ficha(label,"Y",4);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha90,x,y);
        Ficha ficha91 = new Ficha(label,"Q",5);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha91,x,y);
        Ficha ficha92 = new Ficha(label,"C",4);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha92,x,y);
        Ficha ficha93 = new Ficha(label,"X",8);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha93,x,y);
        Ficha ficha94 = new Ficha(label,"X",8);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha94,x,y);
        Ficha ficha95 = new Ficha(label,"J",8);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha95,x,y);
        Ficha ficha96 = new Ficha(label,"J",8);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha96,x,y);
        Ficha ficha97 = new Ficha(label,"Ñ",8);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha97,x,y);
        Ficha ficha98 = new Ficha(label,"Z",10);
        x = Greenfoot.getRandomNumber(299)+220;
        y = Greenfoot.getRandomNumber(30)+350;
        addObject(ficha98,x,y);
        
        
        
    }
}
