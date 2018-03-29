package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class connectsToTilesTest {

@BeforeClass
public static void beforeClass(){
	Move move;
	User temp;
	Board b = new Board();
	Validator v = new Validator();
	b.placeWord(5,5,true,"hell");
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	move = new Move(5,5,true,"hello", temp);
}

@After
public void tearDown() {
	
	 move = "";
}

public void setUp2(){
	
	 move = new Move(-5,-5,true,"hello", temp);
}

public void setUp3(){
	
	 move = null;
}






@Test
public void connectsToTilesTestEQ1(){
	setUp();
	int result = v.connectsToTiles(move);
	assertEquals({1,move}, result);
	tearDown();
}

@Test
public void connectsToTilesTestEQ2(){
	setUp2();
	int result = v.connectsToTiles(move);
	assertEquals({0,move}, result);
	tearDown();
}

public void connectsToTilesTestEQ3(){
	setUp3();
	int result = v.connectsToTiles(move);
	assertEquals({0,move}, result);
	tearDown();
}





}
