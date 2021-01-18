package Framework.Graphed2;
import java.beans.*;

/**
   A property editor for the LineStyle type.
*/
public class LineStyleEditor extends PropertyEditorSupport
{
   public String[] getTags()
   {
      return new String[] { "Solid", "Dotted" };
   }

   public String getAsText()
   {
      LineStyle mode = (LineStyle) getValue();
      if (mode == LineStyle.SOLID) return "Solid";
      if (mode == LineStyle.DOTTED) return "Dotted";
      return null;
   }

   public void setAsText(String s)
   {
      if (s.equals("Solid")) 
         setValue(LineStyle.SOLID);
      else if (s.equals("Dotted")) 
         setValue(LineStyle.DOTTED);
      else
         throw new IllegalArgumentException();
   }
}
