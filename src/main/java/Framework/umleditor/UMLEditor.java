package Framework.Umleditor;
// import java.awt.Dimension;
// import java.awt.Frame;
// import java.awt.Toolkit;
import javax.swing.JFrame;

/**
   A program for editing UML diagrams.
*/
public class UMLEditor
{  

   @SuppressWarnings( "deprecation" )
   public static void main(String[] args)
   {  
      JFrame frame = new GraphFrame(new ClassDiagramGraph());
      frame.show();
   }
}

