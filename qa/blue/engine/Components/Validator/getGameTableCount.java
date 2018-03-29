package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class getGameTableCountTest {

@BeforeClass
public static void beforeClass(){
	String teamname;
	QueryClass qc = new QueryClass();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	teamname = "green";
}

@After
public void tearDown() {
	
	 teamname = "";
}

public void setUp2(){
	
	 teamname = "gold";
}

public void setUp3(){
	
	 teamname = "team";
}

public void setUp4(){
	teamname = "";
}




@Test
public void getGameTableCountTestEQ1(){
	setUp();
	int result = qc.getGameTableCount(teamname);
	assertEquals(true, result);
	tearDown();
}

@Test
public void getGameTableCountTestEQ2(){
	setUp2();
	int result = qc.getGameTableCount(teamname);
	assertEquals(true, result);
	tearDown();
}

public void getGameTableCountTestEQ3(){
	setUp3();
	int result = qc.getGameTableCount(teamname);
	assertEquals(false, result);
	tearDown();
}

public void getGameTableCountTestEQ4(){
	setUp4();
	int result = qc.getGameTableCount(teamname);
	assertEquals(false, result);
	tearDown();
}




}
