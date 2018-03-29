package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class setUsernameTest {

@BeforeClass
public static void beforeClass(){
	String username = "";
	User m = new User(username);
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	username = "taken";
}

@After
public void tearDown() {
	
	username = "";
}

public void setUp2(){
	
	username = "untaken";
}

public void setUp3(){
	
	username = "fuck";
}

public void setUp4(){
	
	username = "";
}







@Test
public void setUsernameTestEQ1(){
	setUp();
	int result = m.setUsername(username);
	assertEquals(m.username, result);
	tearDown();
}

@Test
public void setUsernameTestEQ2(){
	setUp2();
	int result = m.setUsername(username);
	assertEquals(m.username, result);m.
	tearDown();
}

public void setUsernameTestEQ3(){
	setUp3();
	int result = m.setUsername(username);
	assertEquals(m.username, result);
	tearDown();
}

public void setUsernameTestEQ4(){
	setUp4();
	int result = m.setUsername(username);
	assertEquals(m.username, result);
	tearDown();
}



}
