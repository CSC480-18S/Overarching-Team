import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class getFullWordTest {

@BeforeClass
public static void beforeClass(){
	int startx,starty;
	boolean horizontal;
	String word;
	Validator v = new Validator();
	Board b = new Board();
	b.placeWord(4,5,true,"dog");
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	startx = 4;
	starty = 5;
	horizontal = true;
	word = "";
}

@After
public void tearDown() {
	startx = 0;
	starty = 0;
	String word = "dog";
}

public void setUp2(){
	startx = 324543;
	starty = 95460;
	horizontal = false;
	String word = "d";
}

public void setUp3(){
	startx = -3;
	starty = -2;
	horizontal = true;
	String word = "";
}

public void setUpIEQ1(){
	startx = 99999999999999999999999999999;
	starty = 99999999999999999999999999999;
	horizontal = true;
	String word = "cat";
}



@Test
public void getFullWordTestEQ1(){
	setUp();
	int result = v.getFullWord(startx,starty,horizontal,word);
	assertEquals(0, result);
	tearDown();
}

@Test
public void getFullWordTestEQ2(){
	setUp2();
	int result = v.getFullWord(startx,starty,horizontal,word);
	assertEquals(0, result);
	tearDown();
}

public void getFullWordTestEQ3(){
	setUp3();
	int result = v.getFullWord(startx,starty,horizontal,word);
	assertEquals(0, result);
	tearDown();
}


public void getFullWordTestIEQ1(){
	setUpIEQ1();
	int result = v.getFullWord(startx,starty,horizontal,word);
	assertEquals(0, result);
	tearDown();
}

}
