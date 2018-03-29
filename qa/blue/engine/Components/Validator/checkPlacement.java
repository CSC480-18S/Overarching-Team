package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class checkPlacementTest {

@BeforeClass
public static void beforeClass(){
	int x,y;
	boolean horizontal;
	String remaining;
	Validator v = new Validator();
	Board b = new Board();
	b.placeWord(4,5,true,"dog");
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	x = 4;
	y = 5;
	horizontal = true;
	remaining = "dog";
}

@After
public void tearDown() {
	x = 0;
	y = 0;
	remaining = "";
}

public void setUp2(){
	x = 324543;
	y = 95460;
	horizontal = false;
	remaining = "d";
}

public void setUp3(){
	x = -3;
	y = -2;
	horizontal = true;
	remaining = "";
}

public void setUpIEQ1(){
	x = 99999999999999999999999999999;
	y = 99999999999999999999999999999;
	horizontal = true;
	remaining = "cat";
}



@Test
public void checkPlacementTestEQ1(){
	setUp();
	int result = v.checkPlacement(x,y,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}

@Test
public void checkPlacementTestEQ2(){
	setUp2();
	int result = v.checkPlacement(x,y,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}

public void checkPlacementTestEQ3(){
	setUp3();
	int result = v.checkPlacement(x,y,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}


public void checkPlacementTestIEQ1(){
	setUpIEQ1();
	int result = v.checkPlacement(x,y,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}

}
