package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class setTileTest {

@BeforeClass
public static void beforeClass(){
	Tile t = null;
	Board b = new Board();
	Space m = new Space(new Multiplayer(1) );
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	t = new Tile('a',1);
}

@After
public void tearDown() {
	
	t = null;
}

public void setUp2(){
	
	t = new Tile('%', 0);
}

public void setUp3(){
	
	t = null;
}









@Test
public void setTileTestEQ1(){
	setUp();
	int result = m.setTile(username);
	assertEquals(m.username, result);
	tearDown();
}

@Test
public void setTileTestEQ2(){
	setUp2();
	int result = m.setTile(username);
	assertEquals(m.username, result);
	tearDown();
}

public void setTileTestEQ3(){
	setUp3();
	int result = m.setTile(username);
	assertEquals(m.username, result);
	tearDown();
}




}
