package Memento;

import static org.junit.Assert.assertEquals;

import javax.swing.JTextArea;

import org.junit.Test;

import Memento.DerekBanas.TestMemento;
import Utils.OutStream;

public class DerekBanasTest extends OutStream {

    @Test
    public void testButton() {
        TestMemento testMemento = new TestMemento();
        JTextArea article = testMemento.getArticle();

        article.append("allo mon coco1");
        testMemento.save();
        assertEquals("allo mon coco1", article.getText());

        article.append(" allo mon coco2");
        testMemento.save();
        assertEquals("allo mon coco1 allo mon coco2", article.getText());

        article.append(" allo mon coco3");
        testMemento.save();
        assertEquals("allo mon coco1 allo mon coco2 allo mon coco3", article.getText());

        testMemento.undo();
        assertEquals("allo mon coco1 allo mon coco2", article.getText());

        testMemento.undo();
        assertEquals("allo mon coco1", article.getText());

        testMemento.redo();
        assertEquals("allo mon coco1 allo mon coco2", article.getText());

        testMemento.redo();
        assertEquals("allo mon coco1 allo mon coco2 allo mon coco3", article.getText());

        String expected = String.format(
            "From Originator: Current Version of Article%n" +
            "%n" +
            "%n" +
            "From Originator: Saving to Memento%n" +
            "From Originator: Current Version of Article%n" +
            "allo mon coco1%n" +
            "%n" +
            "From Originator: Saving to Memento%n" +
            "Save Files 1%n" +
            "From Originator: Current Version of Article%n" +
            "allo mon coco1 allo mon coco2%n" +
            "%n" +
            "From Originator: Saving to Memento%n" +
            "Save Files 2%n" +
            "From Originator: Current Version of Article%n" +
            "allo mon coco1 allo mon coco2 allo mon coco3%n" +
            "%n" +
            "From Originator: Saving to Memento%n" +
            "Save Files 3%n" +
            "From Originator: Previous Article Saved in Memento%n" +
            "allo mon coco1 allo mon coco2%n" +
            "%n" +
            "From Originator: Previous Article Saved in Memento%n" +
            "allo mon coco1%n" +
            "%n" +
            "From Originator: Previous Article Saved in Memento%n" +
            "allo mon coco1 allo mon coco2%n" +
            "%n" +
            "From Originator: Previous Article Saved in Memento%n" +
            "allo mon coco1 allo mon coco2 allo mon coco3%n" +
            "%n"
        );
        String output = this.getOutput();
        assertEquals(expected, output);
    }

    @Test
    public void testUndoRedo(){
        TestMemento testMemento = new TestMemento();
        JTextArea article = testMemento.getArticle();

        article.append("allo mon coco1");
        testMemento.save();
        assertEquals("allo mon coco1", article.getText());

        testMemento.undo();
        assertEquals("", article.getText());

        testMemento.redo();
        assertEquals("allo mon coco1", article.getText());
    }

}
