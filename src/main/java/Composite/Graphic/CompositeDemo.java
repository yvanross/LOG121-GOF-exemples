package Composite.Graphic;

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