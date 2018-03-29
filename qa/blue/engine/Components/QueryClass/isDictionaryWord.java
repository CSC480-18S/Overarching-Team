package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public classisDictionaryWordTest {

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
	
	word = "dog";
}

@After
public void tearDown() {
	
	word = "";
}

public void setUp2(){
	
	word = "d";
}

public void setUp3(){
	
	word = "";
}





@Test
public void isDictionaryWordTestEQ1(){
	setUp();
	int result = v.isDictionaryWord(word);
	assertEquals(1, result);
	tearDown();
}

@Test
public void isDictionaryWordTestEQ2(){
	setUp2();
	int result = v.isDictionaryWord(word);
	assertEquals(0, result);
	tearDown();
}

public void isDictionaryWordTestEQ3(){
	setUp3();
	int result = v.isDictionaryWord(word);
	assertEquals(0, result);
	tearDown();
}




}
