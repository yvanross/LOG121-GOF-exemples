package Decorateur.Patate;


// Abstract decorator class - note that it implements Patate interface
public abstract class PatateDecorator implements IPatate {
    private final IPatate decoratedPatate;

    public PatateDecorator(IPatate c) {
        this.decoratedPatate = c;
    }

    @Override
    public Double getCost() { // Implementing methods of the interface
        return decoratedPatate.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedPatate.getDescription();
    }
}