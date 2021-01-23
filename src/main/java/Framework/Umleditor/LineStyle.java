package Framework.Umleditor;
import java.awt.BasicStroke;
import java.awt.Stroke;

/**
   This class defines line styles of various shapes.
*/
public class LineStyle extends SerializableEnumeration
{
   private LineStyle() {}

   /**
      Gets a stroke with which to draw this line style.
      @return the stroke object that strokes this line style
   */
   public Stroke getStroke()
   {
      if (this == DOTTED)
         return DOTTED_STROKE;
      return SOLID_STROKE;
   }

   private static Stroke SOLID_STROKE = new BasicStroke();
   private static Stroke DOTTED_STROKE = new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10.0f, new float[] { 3.0f, 3.0f }, 0.0f);

   public static final LineStyle SOLID = new LineStyle();
   public static final LineStyle DOTTED = new LineStyle();
}
