package com.cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddiTest {
@BeforeAll
static void beforell() {
	System.out.println("Hey you!");	
}

	@Test
	void test() {
		Assertions.assertEquals(3,Addi.add(2,1) );
	}
}
