package Iterateur.Collection;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Should use Test.Java.Utils.OutStrem to clean up this test code.
public class CollectionTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams(){
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStream(){
		System.setOut(originalOut);
	}

	@Test
	public void imprimerCollection(){
		final MaCollection maCollection = new MaCollection();
		maCollection.ajouter("Cette collection");
		maCollection.ajouter("contient un ensemble");
		maCollection.ajouter("de String.");
		MonClient.imprimer(maCollection);
		assertEquals("Cette collection" + System.lineSeparator()+
		"contient un ensemble" + System.lineSeparator()+
		"de String." + System.lineSeparator(), outContent.toString());
	}

	@Test
	public void ImprimerUneAutreCollection() {
		final UneAutreCollection uneAutreCollection = new UneAutreCollection();
		uneAutreCollection.ajouter("");
		uneAutreCollection.ajouter("Cette collection");
		uneAutreCollection.ajouter("contient aussi plusieurs String.");
		MonClient.imprimer(uneAutreCollection);
		assertEquals(System.lineSeparator() + "Cette collection" + System.lineSeparator()+
		"contient aussi plusieurs String." + System.lineSeparator(), outContent.toString());
	}
}
