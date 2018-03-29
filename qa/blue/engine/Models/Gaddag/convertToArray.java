

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class convertToArrayTest {

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
	
	word = "ddfsc";
}

public void setUp3(){
	
	word = "";
}





@Test
public void convertToArrayTestEQ1(){
	setUp();
	int result = g.convertToArray(word);
	assertEquals(['d','o','g'], result);
	tearDown();
}

@Test
public void convertToArrayTestEQ2(){
	setUp2();
	int result = g.convertToArray(word);
	assertEquals(['d','d','f','s','c'], result);
	tearDown();
}

public void convertToArrayTestEQ3(){
	setUp3();
	int result = g.convertToArray(word);
	assertEquals([''], result);
	tearDown();
}




}
