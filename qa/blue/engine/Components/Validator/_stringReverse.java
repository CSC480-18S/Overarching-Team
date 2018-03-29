package org.doublecloud.sample.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class _StringReverse {

@BeforeClass
public static void beforeClass(){
	String word;
	Gaddag g = new Gaddag('d');
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	word = "dog";
}

@After
public void tearDown() {
	
	word = "";
}

public void setUp2(){
	
	word = "dadfr";
}

public void setUp3(){
	
	word = "";
}





@Test
public void _StringReverseEQ1(){
	setUp();
	String result = g.isDictionaryWord(word);
	assertEquals("god", result);
	tearDown();
}

@Test
public void _StringReverseEQ2(){
	setUp2();
	String result = g.isDictionaryWord(word);
	assertEquals("rfdad", result);
	tearDown();
}

public void _StringReverseEQ3(){
	setUp3();
	String result = g.isDictionaryWord(word);
	assertEquals("", result);
	tearDown();
}




}
