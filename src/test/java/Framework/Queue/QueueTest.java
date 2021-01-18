package Framework.Queue;
import static org.junit.Assert.*;
import org.junit.Test;

import Framework.queue.NameComparator;

import java.util.*;

public class QueueTest {

   @Test
   public void sendMessage() {
      Framework.queue.Queue q = new Framework.queue.Queue(10);

      q.add("Belgium");     
      q.add("Italy");     
      q.add("France");     
      q.add("Thailand");     
     
      ArrayList<Object> a = new ArrayList<Object>();
      a.addAll(q);
      q.removeFirst();

      assertEquals("[Belgium, Italy, France, Thailand]",a.toString());
      assertEquals("Belgium",Collections.min(a,new NameComparator()));
      assertEquals("France",Collections.min(q,new NameComparator()));
   }
   
   
}
