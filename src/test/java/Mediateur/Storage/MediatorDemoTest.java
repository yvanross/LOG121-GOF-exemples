package Mediateur.Storage;
import org.junit.Test;

public class MediatorDemoTest {
    @Test
    public  void mainTeest() {
        Mediator<Integer> mediator = new Mediator<Integer>();
        mediator.setValue("bob", 20);
        mediator.setValue("alice", 24);
        mediator.getValue("alice").ifPresent(age -> System.out.println("age for alice: " + age));
        
        mediator.addObserver("bob", () -> {
            System.out.println("new age for bob: " + mediator.getValue("bob").orElseThrow(RuntimeException::new));
        });
        mediator.setValue("bob", 21);
    }
}