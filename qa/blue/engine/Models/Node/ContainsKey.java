package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContainsKeyTest {

@BeforeClass
public static void beforeClass(){
	char key;
	Node n = new Node('d');
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	key = 'd';
}

@After
public void tearDown() {
	
	key = "";
}

public void setUp2(){
	
	key = '%';
}

public void setUp3(){
	
	key = '';
}





@Test
public void ContainsKeyTestEQ1(){
	setUp();
	boolean result = ContainsKey(key);
	assertEquals(n, result);
	tearDown();
}

@Test
public void ContainsKeyTestEQ2(){
	setUp2();
	boolean result = ContainsKey(key);
	assertEquals(new Node('%');, result);
	tearDown();
}

public void ContainsKeyTestEQ3(){
	setUp3();
	boolean result = ContainsKey(key);
	assertEquals(new Node(''), result);
	tearDown();
}




}
