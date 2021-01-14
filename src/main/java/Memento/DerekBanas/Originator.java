package Memento.DerekBanas;

// Memento Design Pattern

/**
 * Originator creates and stores states in Memento objects
 */
public class Originator {

    private String article;

    // Sets the value for the article
    public void set(String newArticle) {
        System.out.format("From Originator: Current Version of Article%n%s%n%n", newArticle);
        this.article = newArticle;
    }

    // Creates a new Memento with a new article
    public Memento storeInMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(article);
    }

    // Gets the article currently stored in memento
    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.format("From Originator: Previous Article Saved in Memento%n%s%n%n", article);
        return article;
    }

}
