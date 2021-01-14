import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;

/**
   This class is a superclass for enumerated types that
   can be serialized. Subclass like this:
   <pre>
   public class MyEnumeration extends SerializableEnumeration
   {
      private MyEnumeration() {}
      public static final MyEnumeration FOO = new MyEnumeration();
      public static final MyEnumeration BAR = new MyEnumeration();
      . . .
   }
   </pre>
   This defines instances <code>MyEnumeration.FOO</code> and
   <code>MyEnumeration.BAR</code> that are guaranteed to
   be preserved through serialization and deserialization.
   Conveniently, the toString method yields the name (such
   as <code>&quot;FOO&quot;<code>).
*/
public class SerializableEnumeration implements Serializable
{
   protected Object writeReplace() throws ObjectStreamException
   {
      if (name == null) toString();
      if (name == null)
         throw new ObjectStreamException("No matching field") {};
      return this;
   }

   public String toString()
   {
      if (name != null) return getClass().getName() + "." + name;
      try
      {
         Field[] fields = getClass().getFields();
         for (int i = 0; i < fields.length; i++)
         {
            if (fields[i].get(this) == this)
            {
               name = fields[i].getName();
               return toString();
            }
         }
      }
      catch (IllegalAccessException ex) {}
      return super.toString();
   }

   protected Object readResolve() throws ObjectStreamException
   {
      try
      {
         return getClass().getField(name).get(null);
      }
      catch (IllegalAccessException ex) {}
      catch (NoSuchFieldException ex) {}
      throw new ObjectStreamException("No matching field") {};
   }

   private String name;
}
