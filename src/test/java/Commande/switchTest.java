package Commande;

import Commande.Switch.*;
import Utils.OutStream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class switchTest extends OutStream {
  @Test    
  public void LightSwitchTest() {
        Light lamp = new Light();

        Command switchOn = new SwitchOnCommand(lamp);
        Command switchOff = new SwitchOffCommand(lamp);

        Switch mySwitch = new Switch();
        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");

        assertEquals("The light is on"+System.lineSeparator()+
        "The light is off"+System.lineSeparator(),getOutput());
      }
}