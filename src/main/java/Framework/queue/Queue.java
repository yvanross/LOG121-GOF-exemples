import java.util.*;

/** 
    A first-in, first-out bounded collection of objects. 
*/ 
public class Queue extends AbstractCollection
{ 
   /** 
       Constructs an empty queue. 
       @param capacity the maximum capacity of the queue 
       @precondition capacity > 0
   */ 
   public Queue(int capacity) 
   { 
      elements = new Object[capacity]; 
      count = 0; 
      head = 0; 
      tail = 0; 
   } 

   public Iterator iterator()
   {
      return new 
         Iterator()
         {
            public boolean hasNext()
            {
               return visited < count;
            }

            public Object next()
            {
               int index = (head + visited) % elements.length;
               Object r = elements[index];
               visited++;
               return r;               
            }

            public void remove()
            {
               throw new UnsupportedOperationException();
            }

            private int visited = 0;
         };
   }

   /** 
       Remove object at head. 
       @return the object that has been removed from the queue
       @precondition size() > 0 
   */ 
   public Object removeFirst() 
   { 
      Object r = elements[head]; 
      head = (head + 1) % elements.length; 
      count--; 
      return r; 
   } 

   /** 
       Append an object at tail. 
       @param anObject the object to be appended 
       @return true since this operation modifies the queue.
       (This is a requirement of the collections framework.)
       @precondition !isFull()
   */ 
   public boolean add(Object anObject) 
   { 
      elements[tail] = anObject; 
      tail = (tail + 1) % elements.length; 
      count++; 
      return true;
   } 

   public int size() 
   { 
      return count; 
   } 

   /** 
       Checks whether this queue is full.
       @return true if the queue is full
   */ 
   public boolean isFull()
   { 
      return count == elements.length; 
   } 

   /** 
       Gets object at head. 
       @return the object that is at the head of the queue 
       @precondition size() > 0 
   */ 
   public Object getFirst() 
   { 
      return elements[head]; 
   } 

   private Object[] elements; 
   private int head; 
   private int tail; 
   private int count; 
}
