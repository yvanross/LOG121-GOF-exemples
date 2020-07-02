package Mediateur.Chat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Utils.OutStream;

public class ChatMessageTest extends OutStream {

  @Test
  public void sendMessage() {

    Mediator group = new Group();
    Collegue user1 = new User("User1",group);
    Collegue user2 = new User("User2",group);
    Collegue user3 = new User("User3",group);

    user1.sendMessage("allo mon coco");

    assertEquals(
      "User2 receive message allo mon coco" + System.lineSeparator() +
      "User3 receive message allo mon coco" + System.lineSeparator(), 
      getOutput());

  }


  
}