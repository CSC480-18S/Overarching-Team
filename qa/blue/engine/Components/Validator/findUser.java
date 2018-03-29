package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class findUserTest {

@BeforeClass
public static void beforeClass(){
	String mac;
	QueryClass qc = new QueryClass();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	mac = "09:A4:F3:B1:73:AD";
}

@After
public void tearDown() {
	
	mac = "";
}

public void setUp2(){
	
	mac = "a string";
}

public void setUp3(){
	
	mac = "";
}





@Test
public void findUserTestEQ1(){
	setUp();
	int result = qc.findUser(mac);
	assertEquals(1, result);
	tearDown();
}

@Test
public void findUserTestEQ2(){
	setUp2();
	int result = qc.findUser(mac);
	assertEquals(0, result);
	tearDown();
}

public void findUserTestEQ3(){
	setUp3();
	int result = qc.findUser(mac);
	assertEquals(0, result);
	tearDown();
}




}
