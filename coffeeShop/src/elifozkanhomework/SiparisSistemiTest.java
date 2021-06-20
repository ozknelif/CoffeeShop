package elifozkanhomework;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SiparisSistemiTest {

	SiparisSistemi testSiparisSistemi = new SiparisSistemi();
	
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void testHataMesajiGoster() {
		testSiparisSistemi.hataMesajiGoster();
	    Assert.assertEquals("L�tfen ge�erli bir �r�n giriniz.",outputStreamCaptor.toString().trim());
	}
	@Test 
	public void testMenuGoster() {
		testSiparisSistemi.menuGoster();
		Assert.assertEquals("1. Espresso (7TL)"
				+ "2. Double Espresso (12TL)"
				+ "3. Cappucino (12TL)"
				+ "4. Caffe Latte (12TL)"
				+ "5. Mocha (13TL)"
				+ "6. Americano (10TL)"
				+ "7. Hot Water (3TL)"
				,outputStreamCaptor.toString().replace("\r","").replace("\n", ""));
	}
	@Test
	public void testKahveHazirla() {
		testSiparisSistemi.kahveHazirla(5);
		Assert.assertEquals("Te�ekk�rler kahveniz haz�rlan�yor."
				+ "Mocha se�tiniz. Bu i�ece�imiz 1 doz espresso ve 1 doz s�t k�p��� ve 1 doz s�cak s�t ve 2 doz s�cak �ikolata i�ermektedir. Afiyet olsun."
				,outputStreamCaptor.toString().replace("\r","").replace("\n", ""));
	}
	
	@After
	public void tearDown() {
	    System.setOut(standardOut);
	}

}
