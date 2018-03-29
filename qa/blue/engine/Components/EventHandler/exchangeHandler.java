

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class exchangeHandlerTest {

@BeforeClass
public static void beforeClass(){
	String mac;
	String tiles;
	EventHandler e = new EventHandler();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	mac = "A5:BC:D5:67:1F:2E";
	tiles = "ahg";
}

@After
public void tearDown() {
	
	mac = "a mac";
	tiles = "agh";
}

public void setUp2(){
	
	mac = "A5:BC:D5:67:1F:2E";
	tiles = "$%#";
}

public void setUp3(){
	
	mac = "";
	tiles = "";
}





@Test
public void exchangeHandlerEQ1(){
	setUp();
	int result = e.exchangeHandler(mac);
	assertEquals(1, result);
	tearDown();
}

@Test
public void exchangeHandlerEQ2(){
	setUp2();
	int result = e.exchangeHandler(mac);
	assertEquals(0, result);
	tearDown();
}

public void exchangeHandlerEQ3(){
	setUp3();
	int result = e.exchangeHandler(mac);
	assertEquals(0, result);
	tearDown();
}




}
