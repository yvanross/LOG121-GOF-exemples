package Framework.Umleditor;
import java.beans.PropertyEditorSupport;

/**
   A helper class for showing names of objects in a property
   sheet that allows the user to pick one of a finite set of 
   named values.
*/
public class PropertySelector extends PropertyEditorSupport
{
   /**
      Constructs a selector that correlates names and objects.
      @param n the strings to display in a combo box
      @param v the corresponding object values
   */
   PropertySelector(String[] n, Object[] v)
   {
      names = n;
      values = v;
   }

   public String[] getTags()
   {
      return names;
   }

   public String getAsText()
   {
      for (int i = 0; i < values.length; i++)
         if (getValue().equals(values[i])) return names[i];
      return null;
   }

   public void setAsText(String s)
   {
      for (int i = 0; i < names.length; i++)
         if (s.equals(names[i])) setValue(values[i]);
   }

   private String[] names;
   private Object[] values;
}
