package Decorateur.Shapes;

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
        
        System.out.println(System.lineSeparator()+"Circle of red border");
        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        
        System.out.println("Rectangle with normal border");
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println(System.lineSeparator()+"Rectangle of red border");
        Shape redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();

        assertEquals("Circle with normal border"+ System.lineSeparator()+
        "Shape: Circle"+ System.lineSeparator()+
        ""+ System.lineSeparator()+
        "Circle of red border"+ System.lineSeparator()+
        "Shape: Circle"+ System.lineSeparator()+
        "Border Color: Red"+ System.lineSeparator()+
        ""+ System.lineSeparator()+
        "Rectangle with normal border"+ System.lineSeparator()+
        "Shape: Rectangle"+ System.lineSeparator()+
        ""+ System.lineSeparator()+
        "Rectangle of red border"+ System.lineSeparator()+
        "Shape: Rectangle"+ System.lineSeparator()+
        "Border Color: Red"+System.lineSeparator()+System.lineSeparator(),getOutput());

        // pour test sur windows
        assertEquals("Circle with normal border" + System.lineSeparator() +
        "Shape: Circle" + System.lineSeparator() +
        System.lineSeparator() +"Circle of red border" + System.lineSeparator() +
        "Shape: Circle" + System.lineSeparator() +
        "Border Color: Red"+ System.lineSeparator() + System.lineSeparator() +
        "Rectangle with normal border" + System.lineSeparator() +
        "Shape: Rectangle" + System.lineSeparator() +
        System.lineSeparator() + "Rectangle of red border" + System.lineSeparator() +
        "Shape: Rectangle" + System.lineSeparator() +
        "Border Color: Red" +System.lineSeparator() + System.lineSeparator(),getOutput());
        
    }

}
