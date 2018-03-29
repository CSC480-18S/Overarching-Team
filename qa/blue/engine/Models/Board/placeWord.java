package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class placeWordTest {

@BeforeClass
public static void beforeClass(){
	int x,y;
	boolean horizontal;
	String word;
	Board b = new Board();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	x = 4;
	y = 5;
	horizontal = true;
	word = "dog";
}

@After
public void tearDown() {
	x = 0;
	y = 0;
	word = "";
}

public void setUp2(){
	x = 324543;
	y = 95460;
	horizontal = true;
	word = "dog";
}

public void setUp3(){
	x = -3;
	y = -2;
	horizontal = true;
	word = "dog";
}

public void setUpIEQ1(){
	x = 99999999999999999999999999999;
	y = 99999999999999999999999999999;
	horizontal = true;
	word = "dog";
}

public void setUp4(){
	x = 4;
	y = 5;
	horizontal = false;
	word = "dog";
}

public void setUp5(){
	x = 4;
	y = 5;
	horizontal = true;
	word = "sssss";
}

public void setUp6(){
	x = 4;
	y = 5;
	horizontal = true;
	word = "";
}


@Test
public void placeWordTestEQ1(){
	setUp();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(true, result);
	tearDown();
}

@Test
public void placeWordTestEQ2(){
	setUp2();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(false, result);
	tearDown();
}

public void placeWordTestEQ3(){
	setUp3();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(false, result);
	tearDown();
}


public void placeWordTestIEQ1(){
	setUpIEQ1();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(false, result);
	tearDown();
}

public void placeWordTestEQ4(){
	setUp4();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(true, result);
	tearDown();
}

public void placeWordTestEQ5(){
	setUp5();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(false, result);
	tearDown();
}

public void placeWordTestEQ6(){
	setUp6();
	boolean result = placeWord(x,y,horizontal,word);
	assertEquals(false, result);
	tearDown();
}

}
