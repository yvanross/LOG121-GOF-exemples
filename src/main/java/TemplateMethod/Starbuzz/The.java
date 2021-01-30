package TemplateMethod.Starbuzz;

public class The extends Boisson {
    public void infuser(){
        System.out.println("Le thé est en train de tremper dans l'eau!");
    }

    public void ajouter_condiments(){
        System.out.println("J'ajoute du citron!");
    }
}
