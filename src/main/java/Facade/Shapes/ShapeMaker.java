package Facade.Shapes;

import Decorateur.Shapes.Circle;
import Decorateur.Shapes.Rectangle;
import Decorateur.Shapes.Shape;
import Decorateur.Shapes.Square;

public class ShapeMaker {
  private Shape circle;
  private Shape rectangle;
  private Shape square;
//test
  public ShapeMaker() {
     circle = new Circle();
     rectangle = new Rectangle();
     square = new Square();
  }

  public void drawCircle(){
     circle.draw();
  }
  public void drawRectangle(){
     rectangle.draw();
  }
  public void drawSquare(){
     square.draw();
  }
}