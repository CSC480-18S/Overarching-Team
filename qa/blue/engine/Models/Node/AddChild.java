package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddChildTest {

@BeforeClass
public static void beforeClass(){
	char letter;
	Node n = new Node('g');
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	letter = 'd';
}

@After
public void tearDown() {
	
	letter = '';
}

public void setUp2(){
	
	letter = '%';
}

public void setUp3(){
	
	letter = '';
}





@Test
public void AddChildTestEQ1(){
	setUp();
	int result = n.AddChild(letter);
	assertEquals(new Node('d'), result);
	tearDown();
}

@Test
public void AddChildTestEQ2(){
	setUp2();
	int result = n.AddChild(letter);
	assertEquals(new Node('%'), result);
	tearDown();
}

public void AddChildTestEQ3(){
	setUp3();
	int result = n.AddChild(letter);
	assertEquals(new Node(''), result);
	tearDown();
}




}
