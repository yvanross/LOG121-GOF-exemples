package Mediateur.Chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Mediator {
  List<Collegue> users = new ArrayList<Collegue>();

  @Override
  public void sendMessage(String message, Collegue user) {
   Iterator<Collegue> iterator = users.iterator();
   while(iterator.hasNext()){
     Collegue collegue = iterator.next();
     if(collegue != user){
       collegue.receive(message);
     }

   }
    
  }

  @Override
  public void addUser(Collegue user) {
    users.add(user);
  }

}
