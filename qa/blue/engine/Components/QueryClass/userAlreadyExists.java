import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class findUserTest {

@BeforeClass
public static void beforeClass(){
	String uname;
	QueryClass qc = new QueryClass();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	uname = "Scrabblefiend";
}

@After
public void tearDown() {
	
	uname = "";
}

public void setUp2(){
	
	uname = "untaken";
}

public void setUp3(){
	
	uname = "fuck";
}

public void setUp4(){
	
	uname = "";
}





@Test
public void userAlreadyExistsTestEQ1(){
	setUp();
	boolean result = qc.userAlreadyExists(uname);
	assertEquals(1, result);
	tearDown();
}

@Test
public void userAlreadyExistsTestEQ2(){
	setUp2();
	boolean result = qc.userAlreadyExists(uname);
	assertEquals(0, result);
	tearDown();
}

public void userAlreadyExistsTestEQ3(){
	setUp3();
	boolean result = qc.userAlreadyExists(uname);
	assertEquals(0, result);
	tearDown();
}

public void userAlreadyExistsTestEQ4(){
	setUp4();
	boolean result = qc.userAlreadyExists(uname);
	assertEquals(0, result);
	tearDown();
}




}
