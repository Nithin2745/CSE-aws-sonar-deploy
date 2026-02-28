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

}
