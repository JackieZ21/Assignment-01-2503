import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AvengerTest {

	@Test
	void testAvenger() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAlias() {
		Avenger avenger = new Avenger( "captainamerica", "rogers" );
		String expected = ( "captainamerica");
		String result = avenger.getAlias();
		assertEquals(result, expected);
	}

	@Test
	void testGetLastName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFrequency() {
		Avenger avenger = new Avenger("Iron Man", "Stark");
		int expected = 1;
		int result = avenger.getFrequency();
		assertEquals(expected, result);
	}

	@Test
	void testGetOrder() {
		fail("Not yet implemented");
	}

	@Test
	void testSetOrder() {
		fail("Not yet implemented");
	}

	@Test
	void testIncreaseFrequency() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
