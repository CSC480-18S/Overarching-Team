package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class setWordTest {

@BeforeClass
public static void beforeClass(){
	String word;
	Move m = new Move(4,4, true, "");
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
public void setWordTestEQ1(){
	setUp();
	int result = m.setWord(word);
	assertEquals(m.word, result);
	tearDown();
}

@Test
public void setWordTestEQ2(){
	setUp2();
	int result = m.setWord(word);
	assertEquals(m.word, result);m.
	tearDown();
}

public void setWordTestEQ3(){
	setUp3();
	int result = m.setWord(word);
	assertEquals(m.word, result);
	tearDown();
}




}
