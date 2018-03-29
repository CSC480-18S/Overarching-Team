package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class getTeamCumulativeTest {

@BeforeClass
public static void beforeClass(){
	String teamname;
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
public void getTeamCumulativeTestEQ1(){
	setUp();
	int result = getTeamCumulative(teamname);
	assertEquals(1, result);
	tearDown();
}

@Test
public void getTeamCumulativeTestEQ2(){
	setUp2();
	int result = getTeamCumulative(teamname);
	assertEquals(0, result);
	tearDown();
}

public void getTeamCumulativeTestEQ3(){
	setUp3();
	int result = getTeamCumulative(teamname);
	assertEquals(0, result);
	tearDown();
}

public void getTeamCumulativeTestEQ4(){
	setUp4();
	int result = getTeamCumulative(teamname);
	assertEquals(0, result);
	tearDown();
}




}
