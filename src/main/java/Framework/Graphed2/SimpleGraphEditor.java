package Framework.Graphed2;
import javax.swing.*;

/**
   A program for editing UML diagrams.
*/
public class SimpleGraphEditor
{  
   @SuppressWarnings("deprecation")
   public static void main(String[] args)
   {  
      JFrame frame = new GraphFrame(new SimpleGraph());
      frame.show();
   }
}

