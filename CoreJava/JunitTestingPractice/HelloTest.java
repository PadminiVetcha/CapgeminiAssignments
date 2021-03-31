import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HelloTest 
{
	Hello h;
	
	@BeforeEach
	void init(){
		h=new Hello();
	}
	
	@AfterEach
	void Print(){
		System.out.println("In process");
	}
	
	@BeforeAll
	 static void in(){
		System.out.println("Started execution");
	}
	
	@AfterAll
	static void out(){
		System.out.println("Completed execution");
	}
	
	@Nested
	class Add{
		
		@Test
		@Tag("Addition")
		@DisplayName("Testing Add Method for +ve nos")
		void testAddForPositiveNos() {
			//assertEquals(2,h.add(1, 1),"Addition of 2 numbers");
			assertAll(
					()->assertEquals(4,h.add(1, 3)),
					()->assertEquals(6,h.add(2, 4)),
					()->assertEquals(18,h.add(9, 9)));
		}
		
		@Test
		@Disabled
		@DisplayName("Testing Add Method for -ve nos")
		void testAddForNegativeNos() {
			assertEquals(-2,h.add(-1, -1),"Addition of 2 numbers");
		}
	}
	
	@RepeatedTest(3)
	@DisplayName("Testing Sub Method")
	void testSub() {
		assertEquals(0,h.sub(1, 1),"Subtraction of 2 numbers");
	}
}
