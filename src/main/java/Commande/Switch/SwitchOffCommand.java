package Commande.Switch;

/** The Command for turning off the light - ConcreteCommand #2 */
public class SwitchOffCommand implements Command {
    private final Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.turnOff();
    }
}