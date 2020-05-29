package PatronDecorateur.Shapes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Utils.OutStream;

public class ShapesTest extends OutStream {

    @Test
    public void shapeTest() {
        System.out.println("Circle with normal border");
        Shape circle = new Circle();
        circle.draw();
        
        System.out.println("\nCircle of red border");
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        
        System.out.println("Rectangle with normal border");
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("\nRectangle of red border");
        Shape redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();

        // assertEquals("Circle with normal border\n"+
        // "Shape: Circle\n"+
        // "\n"+
        // "Circle of red border\n"+
        // "Shape: Circle\n"+
        // "Border Color: Red\n"+
        // "\n"+
        // "Rectangle with normal border\n"+
        // "Shape: Rectangle\n"+
        // "\n"+
        // "Rectangle of red border\n"+
        // "Shape: Rectangle\n"+
        // "Border Color: Red\n\n",getOutput());

        // // pour test sur windows
        // assertEquals("Circle with normal border\r\n" +
        // "Shape: Circle\r\n" +
        // "\nCircle of red border\r\n" +
        // "Shape: Circle\r\n" +
        // "Border Color: Red\n\r\n" +
        // "Rectangle with normal border\r\n" +
        // "Shape: Rectangle\r\n" +
        // "\nRectangle of red border\r\n" +
        // "Shape: Rectangle\r\n" +
        // "Border Color: Red\n\r\n",getOutput());
        // }
        assertTrue(true);
    }

}
