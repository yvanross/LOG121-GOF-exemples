package Utils;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;

public class OutStream {
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
    
    public String getOutput(){
        return outContent.toString();
    }
}