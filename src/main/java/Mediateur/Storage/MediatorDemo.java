package Mediateur.Storage;

public class MediatorDemo {
  public static void main(String[] args) {
      Mediator<Integer> mediator = new Mediator<>();
      Mediator<String> mediatorStr = new Mediator<>();
      mediator.setValue("bob", 20);
      mediator.setValue("alice", 24);
   
      mediator.getValue("alice").ifPresent(value -> System.out.println("age for alice: " + value));


            mediator.addObserver("bob", () -> {
          System.out.println("new age for bob: " + mediator.getValue("bob").orElseThrow(RuntimeException::new));
      });

      mediatorStr.addObserver("bob", () -> {
        System.out.println("comments: " + mediatorStr.getValue("bob").orElseThrow(RuntimeException::new));
    });

      mediatorStr.setValue("bob", "allo mon coco");

      mediator.setValue("bob", 21);


  }
}