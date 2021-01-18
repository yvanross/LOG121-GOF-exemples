package Framework.Graphed2;
import java.awt.*;
import java.io.*;

/**
   This class defines line styles of various shapes.
*/
public class LineStyle implements Serializable
{
   /**
    *
    */
   private static final long serialVersionUID = -5902074580184838958L;

   private LineStyle(String name) {
      this.name = name;
   }

   /**
      Gets a stroke with which to draw this line style.
      @return the stroke object that strokes this line style
   */
   public Stroke getStroke()
   {
      if (this == DOTTED) return DOTTED_STROKE;
      if (this == SOLID) return SOLID_STROKE;
      return null;
   }

   protected Object readResolve() throws ObjectStreamException
   {
      if (name.equals("SOLID")) return LineStyle.SOLID;
      else if (name.equals("DOTTED")) return LineStyle.DOTTED;
      else return null;
   }

   private String name;

   private static Stroke SOLID_STROKE = new BasicStroke();
   private static Stroke DOTTED_STROKE = new BasicStroke(
      1.0f, 
      BasicStroke.CAP_SQUARE, 
      BasicStroke.JOIN_MITER, 
      10.0f, 
      new float[] { 3.0f, 3.0f }, 
      0.0f);

   public static final LineStyle SOLID 
      = new LineStyle("SOLID");
   public static final LineStyle DOTTED 
      = new LineStyle("DOTTED");
}
