package PatronIterateur.Songs;

import static org.junit.Assert.assertEquals;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
import Utils.OutStream;
//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

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
		
		SongsOfThe70s songs70s = new SongsOfThe70s();
		SongsOfThe80s songs80s = new SongsOfThe80s();
		SongsOfThe90s songs90s = new SongsOfThe90s();
		
		DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);
		madMike.showTheSongs2();
		assertEquals("NEW WAY WITH ITERATOR\n\n"+
		"Songs of the 70s\n\n"+
		"Imagine;John Lennon;1971\n"+
		"American Pie;Don McLean;1971\n"+
		"I Will Survive;Gloria Gaynor;1979\n"+
		"Songs of the 80s\n\n"+
		"Roam;B 52s;1989\n"+
		"Cruel Summer;Bananarama;1984\n"+
		"Head Over Heels;Tears For Fears;1985\n"+
		"Songs of the 90s\n\n"+
		"Walk on the Ocean;Toad The Wet Sprocket;1991\n"+
		"Creep;Radiohead;1993\n"+
		"Losing My Religion;REM;1991\n",getOutput());
	}
	
}