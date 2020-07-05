package Mediateur.Chat;

public class User implements Collegue {

  Mediator group = null;
  String name;
  
  public User(String name, Mediator group) {
    this.group = group;
    this.name = name;
    group.addUser(this);
	}

    @Override
    public void sendMessage(String message) {
      group.sendMessage(message,this);

    }

    @Override
    public void receive(String message) {
      System.out.println(this.name + " receive message " + message);

    }

}
