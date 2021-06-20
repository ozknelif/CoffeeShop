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
	    Assert.assertEquals("Lütfen geçerli bir ürün giriniz.",outputStreamCaptor.toString().trim());
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
		Assert.assertEquals("Teþekkürler kahveniz hazýrlanýyor."
				+ "Mocha seçtiniz. Bu içeceðimiz 1 doz espresso ve 1 doz süt köpüðü ve 1 doz sýcak süt ve 2 doz sýcak çikolata içermektedir. Afiyet olsun."
				,outputStreamCaptor.toString().replace("\r","").replace("\n", ""));
	}
	
	@After
	public void tearDown() {
	    System.setOut(standardOut);
	}

}
