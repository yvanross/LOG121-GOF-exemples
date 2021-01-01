package Prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
// import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Proptoptype.ConcretePrototype.ConcretePrototype1;
import Proptoptype.ConcretePrototype.ConcretePrototype2;

public class ConcretePrototype  {

  @Test
  public void createClone() throws CloneNotSupportedException {
    System.out.println("XXXX");
    Long start = System.nanoTime();
    final ConcretePrototype1 concretePrototype1 =  new ConcretePrototype1();
    System.out.println("New:" + (System.nanoTime()-start)/1000);
   
  start = System.nanoTime();
    final ConcretePrototype1 concretePrototype1Cloned = (ConcretePrototype1) concretePrototype1.clone();
   System.out.println("Clone:" + (System.nanoTime()-start)/1000);
   
   assertNotEquals(concretePrototype1,concretePrototype1Cloned);
   assertEquals(concretePrototype1.getType(), concretePrototype1Cloned.getType());
   
   final ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
   final ConcretePrototype2 concretePrototype2Cloned = (ConcretePrototype2) concretePrototype2.clone();

   assertNotEquals(concretePrototype2,concretePrototype2Cloned);   
   assertEquals(concretePrototype2.getType(), concretePrototype2Cloned.getType());

  }
}
















































//  Object obj = new Object();
// assertTrue(concretePrototype1 instanceof Object);

