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
	int startx,starty,endx,endy;
	boolean horizontal;
	String remaining;
	Validator v = new Validator();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	startx = 4;
	starty = 5;
	endx = 7;
	endy = 5;
	board = 
}

@After
public void tearDown() {
	startx = 0;
	starty = 0;
	endx = 0;
	endy = 0;
	board = null;
}

public void setUp2(){
	startx = 324543;
	starty = 95460;
	endx = 7;
	endy = 5;
	board = 
}

public void setUp3(){
	startx = -3;
	starty = -2;
	endx = 7;
	endy = 5;
	board = 
}

public void setUpIEQ1(){
	startx = 99999999999999999999999999999;
	starty = 99999999999999999999999999999;
	endx = 7;
	endy = 5;
	board = 
}

public void setUp4(){
	startx = 4;
	starty = 5;
	endx = 65218;
	endy = 47583;
	board = 
}

public void setUp5(){
	startx = 4;
	starty = 5;
	endx = -5;
	endy = -2;
	board = 
}

@Test
public void checkPlacementTestEQ1(){
	setUp();
	int result = v.checkPlacement(startx,starty,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}

@Test
public void checkPlacementTestEQ2(){
	setUp2();
	int result = v.checkPlacement(startx,starty,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}

public void checkPlacementTestEQ3(){
	setUp3();
	int result = v.checkPlacement(startx,starty,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}


public void checkPlacementTestIEQ1(){
	setUpIEQ1();
	int result = v.checkPlacement(startx,starty,horizontal,remaining);
	assertEquals(0, result);
	tearDown();
}

}
