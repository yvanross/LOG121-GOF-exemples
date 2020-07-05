package Mediateur.Storage;

public class MediatorDemo {
  public static void main(String[] args) {
      Mediator<Integer> mediator = new Mediator<>();
      mediator.setValue("bob", 20);
      mediator.setValue("alice", 24);
      mediator.getValue("alice").ifPresent(value -> System.out.println("age for alice: " + value));
      
      mediator.addObserver("bob", () -> {
          System.out.println("new age for bob: " + mediator.getValue("bob").orElseThrow(RuntimeException::new));
      });
      mediator.setValue("bob", 21);
  }
}