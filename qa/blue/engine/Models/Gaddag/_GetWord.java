
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class _GetWordTest {

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
	
	word = "ddvchh";
}

public void setUp3(){
	
	word = "";
}





@Test
public void isDictionaryWordTestEQ1(){
	setUp();
	int result = g.isDictionaryWord(word);
	assertEquals(1, result);
	tearDown();
}

@Test
public void isDictionaryWordTestEQ2(){
	setUp2();
	int result = g.isDictionaryWord(word);
	assertEquals(0, result);
	tearDown();
}

public void isDictionaryWordTestEQ3(){
	setUp3();
	int result = g.isDictionaryWord(word);
	assertEquals(0, result);
	tearDown();
}




}
