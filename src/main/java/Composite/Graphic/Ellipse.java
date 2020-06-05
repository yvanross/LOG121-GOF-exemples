package Composite.Graphic;

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