import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AvengerTest {
	/**
	 * test the creation of a new Avenger with their Alias
	 */
	@Test
	void testAvenger() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		assertNotNull(avenger);
	}
	/**
	 * test the get method for alias
	 */
	@Test
	void testGetAlias() {
		Avenger avenger = new Avenger( "captainamerica", "rogers" );
		String expected = ( "captainamerica");
		String result = avenger.getAlias();
		assertEquals(result, expected);
	}
	/**
	 * test the get method for getting the last name
	 */
	@Test
	void testGetLastName() {
		Avenger avenger = new Avenger("captain America", "rogers");
	    String expected = "rogers";
	    String result = avenger.getLastName();
	    assertEquals(expected, result);
	}
	/**
	 * test the get method for the frequency the Avenger is shown
	 */
	@Test
	void testGetFrequency() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		int expected = 1;
		int result = avenger.getFrequency();
		assertEquals(expected, result);
	}
	/**
	 * test the get method for the order the Avenger is in 
	 */
	@Test
	void testGetOrder() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		int expected = 0;
		int result = avenger.getOrder();
		assertEquals(result, expected);
	}
	/**
	 * test the set method to set the Avenger's order 
	 */
	@Test
	void testSetOrder() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		int expected = 10;
		avenger.setOrder(10);
		int result = avenger.getOrder();
		assertEquals(result, expected);
	}
	/**
	 * test the increase frequency method for the Avenger 
	 */
	@Test
	void testIncreaseFrequency() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		int expected = 2;
		avenger.increaseFrequency();
		avenger.increaseFrequency();
		int result = avenger.getFrequency();
		assertEquals(result, expected);
	}

	/**
	 * test the to string method to output the Avengers in the correct order
	 */

	@Test
	void testToString() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		String expected = "Iron Man (Stark)";
		String result = avenger.toString();
		assertEquals(result, expected);
	}

	

}
