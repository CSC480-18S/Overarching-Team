package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class isBonusTest {

@BeforeClass
public static void beforeClass(){
	String word;
	Validator v = new Validator();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	word = "Shineman";
}

@After
public void tearDown() {
	
	word = "";
}

public void setUp2(){
	
	word = "Shin";
}

public void setUp3(){
	
	word = "";
}





@Test
public void isBonusEQ1(){
	setUp();
	int result = v.isBonus(word);
	assertEquals(1, result);
	tearDown();
}

@Test
public void isBonusEQ2(){
	setUp2();
	int result = v.isBonus(word);
	assertEquals(0, result);
	tearDown();
}

public void isBonusEQ3(){
	setUp3();
	int result = v.isBonus(word);
	assertEquals(0, result);
	tearDown();
}




}
