package com.gcode.using.gof.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jittakal
 *
 */
public class ServiceLocatorTest {

	/**
	 * 
	 */
	@Test
	public void testGetInstance() {
		ServiceLocator expected = ServiceLocator.getInstance();
		ServiceLocator actual = ServiceLocator.getInstance();
		Assert.assertEquals(expected, actual);
	}

}
