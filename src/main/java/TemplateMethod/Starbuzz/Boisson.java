package TemplateMethod.Starbuzz;

public abstract class Boisson {

    public  void preparer(){
        bouillir_eau();
        infuser();
        verser_tasse();
        ajouter_condiments();
    }

    abstract void infuser();

    abstract void ajouter_condiments();

    public void bouillir_eau(){
        System.out.println("L'eau est en train de bouillir");
    }

    public void verser_tasse(){
        System.out.println("Je vous sers dans une tasse");
    }

    
}
