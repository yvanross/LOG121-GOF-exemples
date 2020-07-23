package Prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Proptoptype.ConcretePrototype.ConcretePrototype1;
import Proptoptype.ConcretePrototype.ConcretePrototype2;

public class ConcretePrototype  {

  @Test
  public void createClone() throws CloneNotSupportedException {
    final ConcretePrototype1 concretePrototype1 =  new ConcretePrototype1();
   final ConcretePrototype1 concretePrototype1Cloned = (ConcretePrototype1) concretePrototype1.clone();

   assertNotEquals(concretePrototype1,concretePrototype1Cloned);
   assertEquals(concretePrototype1.getType(), concretePrototype1Cloned.getType());
   
   final ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
   final ConcretePrototype2 concretePrototype2Cloned = (ConcretePrototype2) concretePrototype2.clone();

   assertNotEquals(concretePrototype2,concretePrototype2Cloned);   
  }
}
















































//  Object obj = new Object();
// assertTrue(concretePrototype1 instanceof Object);
