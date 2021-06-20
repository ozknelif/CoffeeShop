package elifozkanhomework;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UrunTest {

	Urun testUrun = new Urun(2, "Double Espresso", 12, new Tarif(2, 0, 0, 0, 0));
	
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void testToString() {
		Assert.assertEquals("Double Espresso seçtiniz. Bu içeceðimiz 2 doz espresso içermektedir. Afiyet olsun.",
				testUrun.toString().replace("\r","").replace("\n", ""));
	}

	@After
	public void tearDown() {
	    System.setOut(standardOut);
	}
}
