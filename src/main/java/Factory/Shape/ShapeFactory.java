package Factory.Shape;

import Decorateur.Shapes.Circle;
import Decorateur.Shapes.Rectangle;
import Decorateur.Shapes.Shape;
import Decorateur.Shapes.Square;

public class ShapeFactory {
	
  //use getShape method to get object of type shape 
  public Shape getShape(String shapeType){
     if(shapeType == null){
        return null;
     }		
     if(shapeType.equalsIgnoreCase("CIRCLE")){
        return new Circle();
        
     } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
        return new Rectangle();
        
     } else if(shapeType.equalsIgnoreCase("SQUARE")){
        return new Square();
     }
     
     return null;
  }
}