
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class exchangeHandlerTest {

@BeforeClass
public static void beforeClass(){
	String userName;
	String password;
	EventHandler e = new EventHandler();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	userName = "untaken username";
	password = "password";
}

@After
public void tearDown() {
	
	userName = "";
	password = "";
}

public void setUp2(){
	
	userName = "taken username";
	password = "password";
}

public void setUp3(){
	
	userName = "fuck";
	password = "password";
}

public void setUp4() {
	userName = "";
	password = "password";
}

public void setUp5(){
	userName = "untaken username"
	password = "";
}




@Test
public void exchangeHandlerEQ1(){
	setUp();
	int result = exchangeHandler(userName);
	assertEquals("loginHandler username: " + username + " password: " + pass, result);
	tearDown();
}

@Test
public void exchangeHandlerEQ2(){
	setUp2();
	int result = exchangeHandler(userName);
	assertEquals("loginHandler username: " + username + " password: " + pass, result);
	tearDown();
}

public void exchangeHandlerEQ3(){
	setUp3();
	int result = exchangeHandler(userName);
	assertEquals("loginHandler username: " + username + " password: " + pass, result);
	tearDown();
}

public void exchangeHandlerEQ4(){
	setUp3();
	int result = exchangeHandler(userName);
	assertEquals("loginHandler username: " + username + " password: " + pass, result);
	tearDown();
}


public void exchangeHandlerEQ5(){
	setUp3();
	int result = exchangeHandler(userName);
	assertEquals("loginHandler username: " + username + " password: " + pass, result);
	tearDown();
}





}
