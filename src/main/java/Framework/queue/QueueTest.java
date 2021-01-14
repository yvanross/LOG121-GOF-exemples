import java.util.*;

public class QueueTest
{
   public static void main(String[] args)
   {
      Queue q = new Queue(10);

      q.add("Belgium");     
      q.add("Italy");     
      q.add("France");     
      q.removeFirst();
      q.add("Thailand");     

      ArrayList a = new ArrayList();
      a.addAll(q);
      System.out.println("Result of bulk add: " + a);
      System.out.println("Minimum: " + Collections.min(q));
   }
}
