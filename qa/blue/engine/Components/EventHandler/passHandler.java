

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class passHandlerTest {

@BeforeClass
public static void beforeClass(){
	String username;
	EventHandler e = new EventHandler();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	username = "Scrabblefiend";
}

@After
public void tearDown() {
	
	username = "";
}

public void setUp2(){
	
	username = "$#%^%$";
}

public void setUp3(){
	
	username = "";
}





@Test
public void passHandlerEQ1(){
	setUp();
	String result = e.passHandler(username);
	assertEquals("passHandler username: Scrabblefiend", result);
	tearDown();
}

@Test
public void passHandlerEQ2(){
	setUp2();
	String result = e.passHandler(username);
	assertEquals("passHandler username: $#%^%$", result);
	tearDown();
}

public void passHandlerEQ3(){
	setUp3();
	String result = e.passHandler(username);
	assertEquals("passHandler username: ", result);
	tearDown();
}




}
