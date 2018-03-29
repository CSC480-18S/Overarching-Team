package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class getHandHandlerTest {

@BeforeClass
public static void beforeClass(){
	String mac;
	EventHandler e = new EventHandler();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	mac = "A5:67:F1:D3:28:E4";
	
}

@After
public void tearDown() {
	
	mac = "";
	
}

public void setUp2(){
	
	mac = "a mac address";
}

public void setUp3(){
	
	mac = "";
	
}






@Test
public void getHandHandlerEQ1(){
	setUp();
	int result = e.getHandHandler(mac);
	assertEquals(1, result);
	tearDown();
}

@Test
public void getHandHandlerEQ2(){
	setUp2();
	int result = e.getHandHandler(mac);
	assertEquals(0, result);
	tearDown();
}

public void getHandHandlerEQ3(){
	setUp3();
	int result = e.getHandHandler(mac);
	assertEquals(0, result);
	tearDown();
}


}
