
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class isProfaneTest {

@BeforeClass
public static void beforeClass(){
	String word;
	Validator v = new Validator();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	word = "fuck";
}

@After
public void tearDown() {
	
	word = "";
}

public void setUp2(){
	
	word = "duck";
}

public void setUp3(){
	
	word = "";
}





@Test
public void isProfaneTestEQ1(){
	setUp();
	int result = v.isProfane(word);
	assertEquals(1, result);
	tearDown();
}

@Test
public void isProfaneTestEQ2(){
	setUp2();
	int result = v.isProfane(word);
	assertEquals(0, result);
	tearDown();
}

public void isProfaneTestEQ3(){
	setUp3();
	int result = v.isProfane(word);
	assertEquals(0, result);
	tearDown();
}




}
