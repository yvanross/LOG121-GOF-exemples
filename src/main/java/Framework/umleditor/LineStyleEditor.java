/**
   A property editor for the LineStyle type.
*/
public class LineStyleEditor extends PropertySelector
{
   public LineStyleEditor()
   {
      super(names, values);
   }

   private static final String[] names = 
   { 
      "Solid", 
      "Dotted" 
   };
   
   private static final Object[] values = 
   {
      LineStyle.SOLID,
      LineStyle.DOTTED
   };
}

