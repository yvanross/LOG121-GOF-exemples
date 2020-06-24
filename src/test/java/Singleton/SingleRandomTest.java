package Singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleRandomTest{

  @Test
  public void singletonTest(){
    final SingleRandom singleRandom = SingleRandom.getInstance();
    singleRandom.setSeed(10);
    assertEquals(-1157793070,singleRandom.nextInt());

    assertEquals(singleRandom,SingleRandom.getInstance() );
  }
}
