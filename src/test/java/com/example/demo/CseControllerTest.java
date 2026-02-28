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
		String result = c.hi(10, 20);
		assertEquals("Hi, My name is Nithin with roll:23MH1A05L8. The product of 10 and 20 is 200", result);
	}
}
