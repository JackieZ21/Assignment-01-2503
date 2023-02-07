import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A1Test {
	/**
	 * test the implementation of getClass method 
	 * return proper class type
	 */
	@Test
	void testGetClass() {
		A1 testInstance = new A1();
		assertEquals(A1.class, testInstance.getClass(), "getClass method does not return the correct class type.");
	}
	/**
	 * test the implementation of hashCode method 
	 */
	@Test
	void testHashCode() {
		A1 testInstance1 = new A1();
		A1 testInstance2 = new A1();
		assertNotEquals(testInstance1.hashCode(), testInstance2.hashCode(),
				"hashCode method does not return unique values for different instances.");

	}
	/**
	 * test the implementation of equals method   
	 * 
	 */
	@Test
	void testEquals() {
		A1 testInstance1 = new A1();
		A1 testInstance2 = new A1();
		assertFalse(testInstance1.equals(testInstance2), "equals method returns true for different instances.");
	}



}
