package Composite.Graphic;

import java.util.ArrayList;

/** "Component" */
interface Graphic {
    //Prints the graphic.
    public void print();
}

/** "Composite" */
class CompositeGraphic implements Graphic {
    //Collection of child graphics.
    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    
    //Prints the graphic.
    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();  //Delegation
        }
    }
}

/** "Leaf" */
class Ellipse implements Graphic {
  String name = "";

  public Ellipse(String name){
    this.name = name;
  }
    //Prints the graphic.
    @Override
    public void print() {
        System.out.println(this.name);
    }
}

/** Client */
class CompositeDemo {
    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse("Ellipse1");
        Ellipse ellipse2 = new Ellipse("Ellipse2");
        Ellipse ellipse3 = new Ellipse("Ellipse3");
        Ellipse ellipse4 = new Ellipse("Ellipse4");

        //Creates two composites containing the ellipses
        CompositeGraphic graphic2 = new CompositeGraphic();
        graphic2.add(ellipse1);
        graphic2.add(ellipse2);
        graphic2.add(ellipse3);
        
        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic3.add(ellipse4);
        
        //Create another graphics that contains two graphics
        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.add(graphic2);
        graphic1.add(graphic3);
        graphic1.add(ellipse1);

        //Prints the complete graphic (Four times the string "Ellipse").
        graphic1.print();
    }
}
  