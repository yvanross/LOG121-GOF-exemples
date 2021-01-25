package TemplateMethod.Starbuzz;

public class Cafe extends Boisson{
 
    public void infuser(){
        System.out.println("Le café est en train d'infuser!");
    }

    public void ajouter_condiments(){
        System.out.println("J'ajoute du lait et du sucre!");
    }
}
