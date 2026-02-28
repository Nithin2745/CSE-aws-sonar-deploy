package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {
	@Autowired
	CseController c;
	@Test
	void test() {
		int result = c.add(10, 20);
		assertEquals(30, result);
	}
	@Test
	void testHello() {
		String result = c.Hello("Nithin");
		assertEquals("Hello Nithin", result);
	}
	@Test
	void testHi() {
		String result = c.Hi();
		assertEquals("Hi, My name is Nithin with roll:23MH1A05L8", result);
	}

}
