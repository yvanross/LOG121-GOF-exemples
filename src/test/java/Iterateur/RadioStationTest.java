package Iterateur;

import static org.junit.Assert.assertEquals;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
import Utils.OutStream;
//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

import Iterateur.Songs.DiscJockey;
import Iterateur.Songs.SongIterator;
import Iterateur.Songs.SongsOfThe70s;
import Iterateur.Songs.SongsOfThe80s;
import Iterateur.Songs.SongsOfThe90s;

public class RadioStationTest extends OutStream {
   
	// This is the second time I used output stream for test so I created OutStream Class and extends from it
	// I refactor this class.  Will have to remove all commented line in to clean up the code.

	// private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	// private final PrintStream originalOut = System.out;

	// @Before
	// public void setUpStreams(){
	// 	System.setOut(new PrintStream(outContent));
	// }

	// @After
	// public void restoreStream(){
	// 	System.setOut(originalOut);
	// }

    @Test
	public void showTheSongs2(){
		
		SongIterator songs70s = new SongsOfThe70s();
		SongsOfThe80s songs80s = new SongsOfThe80s();
		SongIterator songs90s = new SongsOfThe90s();
		
		DiscJockey madMike = new DiscJockey(songs70s, (SongIterator)songs80s, songs90s);
		madMike.showTheSongs2();
		assertEquals("NEW WAY WITH ITERATOR"+System.lineSeparator()+System.lineSeparator() +
		"Songs of the 70s"+System.lineSeparator()+System.lineSeparator() +
		"Imagine;John Lennon;1971" + System.lineSeparator() +
		"American Pie;Don McLean;1971" + System.lineSeparator() +
		"I Will Survive;Gloria Gaynor;1979" + System.lineSeparator() +
		"Songs of the 80s"+System.lineSeparator()+System.lineSeparator() +
		"Roam;B 52s;1989" + System.lineSeparator() +
		"Cruel Summer;Bananarama;1984" + System.lineSeparator() +
		"Head Over Heels;Tears For Fears;1985" + System.lineSeparator() +
		"Songs of the 90s"+System.lineSeparator()+System.lineSeparator() +
		"Walk on the Ocean;Toad The Wet Sprocket;1991" + System.lineSeparator() +
		"Creep;Radiohead;1993" + System.lineSeparator() +
		"Losing My Religion;REM;1991" + System.lineSeparator(),getOutput());
	}
	
}