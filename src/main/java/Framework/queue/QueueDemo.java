package Framework.queue;
// import Framework.Queue.Queue;
import java.util.*;

public class QueueDemo{

   public static void main(String[] args){
      Queue q = new Queue(10);

      q.add("Belgium");     
      q.add("Italy");     
      q.add("France");     
      q.add("Thailand");     
     
      ArrayList<Object> a = new ArrayList<Object>();
      a.addAll(q);
      q.removeFirst();

      System.out.println("Result of bulk add: " + a);
      System.out.println("Minimum: " + Collections.min(a,new NameComparator()));
      System.out.println("Minimum: " + Collections.min(q,new NameComparator()));

   }
}
