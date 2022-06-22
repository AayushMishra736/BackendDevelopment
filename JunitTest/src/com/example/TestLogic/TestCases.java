package com.example.TestLogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.unittest.Calculations;

public class TestCases {

	@Test
	public void testFindMax() {
	assertEquals(4,Calculations.findMax(new int[]{1,3,4,2}));

	}
	@Test
	public void isPalindrome() {
	assertTrue("SOS", true);
	assertTrue("SAM", true);
	}
	@Test
	public void AgeCheck() {
	assertNull(18);	
	assertNull(34);	
	}
	
	@Test(timeout = 1000)
	public void endLessloop()
	{
	assertNull(1);		
	}

}
