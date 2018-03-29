
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class plastartyHandlerTest {

@BeforeClass
public static void beforeClass(){
	int startstartx,startstarty;
	boolean horizontal;
	String word;
	String macAddress;
	Validator v = new Validator();
	EventHandler e = new EventHandler();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "cat";
	macAddress = "F4:D1:45:7A:E6:C3";
}

@After
public void tearDown() {
	startx = 0;
	starty = 0;
	word = "cat";
	macAddress =  "F4:D1:45:7A:E6:C3";
}

public void setUp2(){
	startx = 324543;
	starty = 95460;
	horizontal = true;
	word = "cat";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUp3(){
	startx = -3;
	starty = -2;
	horizontal = true;
	word = "cat";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUpIEQ1(){
	startx = 99999999999999999999999999999;
	starty = 99999999999999999999999999999;
	horizontal = true;
	word = "cat";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUp4(){
	startx = 4;
	starty = 5;
	horizontal = false;
	word = "cat";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUp5(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "cat";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUp6(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "ssssss";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUp7(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "";
	macAddress = "F4:D1:45:7A:E6:C3";
}

public void setUp8(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "cat";
	macAddress = "sssssss";
}

public void setUp9(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "cat";
	macAddress = "";
}



@Test
public void plastartyHandlerTestEQ1(){
	setUp();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

@Test
public void plastartyHandlerTestEQ2(){
	setUp2();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ3(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}


public void plastartyHandlerTestIEQ1(){
	setUpIEQ1();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ4(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ5(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ6(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ7(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ8(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

public void plastartyHandlerTestEQ9(){
	setUp3();
	int result = v.plastartyHandler(startx,starty,horizontal,word,macAddress);
	assertEquals("playHandler startX: " + startX + " startY: " + startY + 
                " horizontal: "+ horizontal + " word: " + word + "\nResult: " + result;, result);
	tearDown();
}

}
