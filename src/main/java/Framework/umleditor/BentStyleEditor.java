/**
   A property editor for the BentStyle type.
*/
public class BentStyleEditor extends PropertySelector
{
   public BentStyleEditor()
   {
      super(names, values);
   }

   private static final String[] names = 
   { 
      "Straight", 
      "HV", 
      "VH", 
      "HVH", 
      "VHV" 
   };
   
   private static final Object[] values = 
   {
      BentStyle.STRAIGHT,
      BentStyle.HV,
      BentStyle.VH,
      BentStyle.HVH,
      BentStyle.VHV
   };
}
