

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class getChildByIndexTest {

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
public void getChildByIndexTestEQ1(){
	setUp();
	boolean result = getChildByIndex(key);
	assertEquals(true, result);
	tearDown();
}

@Test
public void getChildByIndexTestEQ2(){
	setUp2();
	boolean result = getChildByIndex(key);
	assertEquals(false, result);
	tearDown();
}

public void getChildByIndexTestEQ3(){
	setUp3();
	boolean result = getChildByIndex(key);
	assertEquals(false, result);
	tearDown();
}




}
