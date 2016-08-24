/* OSS Prac - Implement "Cacl" Test case. */

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

	@Test
		public void testAdd() {
			Calc c = new Calc();
			assertEquals(30, c.add(10,20));
		}
	
	@Test
		public void testSub() {
			Calc c = new Calc();
			assertEquals(10, c.sub(30, 30));
		}

	@Test
		public void testMul(){
			Calc c = new Calc();
			assetEquals(0, c.mul(100,0));
		}
}
