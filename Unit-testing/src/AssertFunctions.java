

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertFunctions {

	@Test

	public void testAssert()

	{

		String s1 = "JUnit";

		String s2 = "JUnit";

//		assertEquals(s1, s2);
//
    assertSame(s1, s2);
//
//       assertNotSame(s1, s2);
//
//       assertNotNull(s1, s2);

      // assertNull(s1,s2);

		int n1 = 10;

		int n2 = 20;
//     assertTrue(n1 > n2);
//	
//     assertFalse(n1 > n2);

	}

}
