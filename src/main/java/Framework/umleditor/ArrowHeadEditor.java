/**
   A property editor for the ArrowHead type.
*/
public class ArrowHeadEditor extends PropertySelector
{
   public ArrowHeadEditor()
   {
      super(names, values);
   }

   private static final String[] names = 
   { 
      "None", 
      "Triangle", 
      "V", 
      "Diamond", 
      "Black Diamond" 
   };
   
   private static final Object[] values = 
   {
      ArrowHead.NONE,
      ArrowHead.TRIANGLE,
      ArrowHead.V,
      ArrowHead.DIAMOND,
      ArrowHead.BLACK_DIAMOND
   };
}
