package Factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Decorateur.Shapes.Rectangle;
import Decorateur.Shapes.Circle;
import Decorateur.Shapes.Shape;
import Decorateur.Shapes.Square;
import Factory.Shape.ShapeFactory;
import Utils.OutStream;

public class ShapeFactoryTest extends OutStream {
  ShapeFactory shapeFactory = null;

  @Before
  public void initShape() {
    shapeFactory = new ShapeFactory();
  }

  @Test
  public void circleTest() {
    // get an object of Circle and call its draw method.
    Shape shape1 = shapeFactory.getShape("CIRCLE");

    // call draw method of Circle
    assertTrue(shape1 instanceof Circle);
    assertTrue(shape1 instanceof Shape);

    shape1.draw();
    assertEquals("Shape: draw Circle"+System.lineSeparator(), getOutput());
  }

  @Test
  public void rectangleTest() {

    // get an object of Rectangle and call its draw method.
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
        assertTrue(shape2 instanceof Rectangle);
        assertTrue(shape2 instanceof Shape);

    // call draw method of Rectangle
    shape2.draw();
    
    assertEquals("Shape: draw Rectangle"+System.lineSeparator(), getOutput());


  }

  @Test
  public void squareTest() {
    // get an object of Square and call its draw method.
    Shape shape3 = shapeFactory.getShape("SQUARE");
    assertTrue(shape3 instanceof Square);
    assertTrue(shape3 instanceof Shape);

    // call draw method of square
    shape3.draw();

    assertEquals("Shape: draw Square"+System.lineSeparator(), getOutput());

  }
}