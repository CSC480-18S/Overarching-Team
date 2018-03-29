import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class isValidPlayTest {

@BeforeClass
public static void beforeClass(){
	Move move;
	User temp;
	Validator v = new Validator();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	move = new Move(5,5,true,"hello", temp);
}

@After
public void tearDown() {
	
	 move = "";
}

public void setUp2(){
	
	 move = new Move(-5,-5,true,"hello", temp);
}

public void setUp3(){
	
	 move = null;
}






@Test
public void isValidPlayTestEQ1(){
	setUp();
	Object[] result = v.isValidPlay(move);
	assertEquals({1,move}, result);
	tearDown();
}

@Test
public void isValidPlayTestEQ2(){
	setUp2();
	Object[] result = v.isValidPlay(move);
	assertEquals({0,move}, result);
	tearDown();
}

public void isValidPlayTestEQ3(){
	setUp3();
	Object[] result = v.isValidPlay(move);
	assertEquals({0,move}, result);
	tearDown();
}





}
