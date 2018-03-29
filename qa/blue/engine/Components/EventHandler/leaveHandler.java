package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class exchangeHandlerTest {

@BeforeClass
public static void beforeClass(){
	String mac;
	String tiles;
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
public void exchangeHandlerEQ1(){
	setUp();
	String result = e.exchangeHandler(mac,tiles);
	assertEquals("abc", result);
	tearDown();
}

@Test
public void exchangeHandlerEQ2(){
	setUp2();
	String result = e.exchangeHandler(mac,tiles);
	assertEquals("", result);
	tearDown();
}

public void exchangeHandlerEQ3(){
	setUp3();
	String result = e.exchangeHandler(mac,tiles);
	assertEquals("", result);
	tearDown();
}


}
