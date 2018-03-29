package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class forfeitHandlerTest {

@BeforeClass
public static void beforeClass(){
	String userName;
	String mac;
	EventHandler e = new EventHandler();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	userName = "untaken username";
	mac = "A7:B2:C3:D5:E6:F7";
}

@After
public void tearDown() {
	
	userName = "";
	mac = "";
}

public void setUp2(){
	
	userName = "taken username";
	mac = "A7:B2:C3:D5:E6:F7";
}

public void setUp3(){
	
	userName = "fuck";
	mac = "A7:B2:C3:D5:E6:F7";
}

public void setUp4() {
	userName = "";
	mac = "A7:B2:C3:D5:E6:F7";
}

public void setUp5(){
	userName = "untaken username"
	mac = "asd";
}

public void setUp6(){
	userName = "untaken username"
	mac = "";
}


@Test
public void forfeitHandlerEQ1(){
	setUp();
	String result = e.forfeitHandler(userName);
	assertEquals("forfeitHandler username: untaken useername MAC: A7:B2:C3:D5:E6:F7" result);
	tearDown();
}

@Test
public void forfeitHandlerEQ2(){
	setUp2();
	String result = e.forfeitHandler(userName);
	assertEquals("forfeitHandler username: taken useername MAC: A7:B2:C3:D5:E6:F7", result);
	tearDown();
}

public void forfeitHandlerEQ3(){
	setUp3();
	String result = e.forfeitHandler(userName);
	assertEquals("forfeitHandler username: fuck MAC: A7:B2:C3:D5:E6:F7", result);
	tearDown();
}

public void forfeitHandlerEQ4(){
	setUp4();
	int result = e.forfeitHandler(userName);
	assertEquals("forfeitHandler username: MAC: A7:B2:C3:D5:E6:F7", result);
	tearDown();
}


public void forfeitHandlerEQ5(){
	setUp5();
	int result = e.forfeitHandler(userName);
	assertEquals("forfeitHandler username: untaken username MAC: asd", result);
	tearDown();
}

public void forfeitHandlerEQ6(){
	setUp5();
	int result = e.forfeitHandler(userName);
	assertEquals("forfeitHandler username: untaken username MAC: ", result);
	tearDown();
}



}
