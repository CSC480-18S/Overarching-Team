
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class addNewToValidWordTableTest {

@BeforeClass
public static void beforeClass(){
	int word_id;
	String word;
	int value;
	int length;
	boolean is_extension;
	int bonuses_used;
	QueryClass qc = new QueryClass();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	word_id = 99997;
	word = "cat";
	value = 5;
	length = 3;
	is_extension = false;
	bonuses_used = 0;
}

@After
public void tearDown() {
	
	word_id = 0;
	word = "";
	value = 0;
	length = 0;
	is_extension = false;
	bonuses_used = 0;

public void setUp2(){
	
	word_id = 4513848612168761;
	word = "word";
	value = 11;
	length = 4;
	is_extension = false;
	bonuses_used = 0;
}

public void setUp3(){
	
	word_id = 256;
	word = "hello";
	value = 999;
	length = 5;
	is_extension = false;
	bonuses_used = 0;
}

public void setUp4(){
	
	word_id = 256;
	word = "hello";
	value = 6;
	length = 9;
	is_extension = false;
	bonuses_used = 0;
}

public void setUp5(){
	
	word_id = 99997;
	word = "cat";
	value = 5;
	length = 3;
	is_extension = true;
	bonuses_used = 0;
}

public void setUp6(){
	
	word_id = 99997;
	word = "cat";
	value = 5;
	length = 3;
	is_extension = false;
	bonuses_used = 4;
}

public void setUp7(){
	
	word_id = -52;
	word = "cat";
	value = 5;
	length = 3;
	is_extension = true;
	bonuses_used = 0;
}

public void setUp8(){
	
	word_id = 99997;
	word = "";
	value = 5;
	length = 3;
	is_extension = true;
	bonuses_used = 0;
}

public void setUp9(){
	
	word_id = 99997;
	word = "cat";
	value = -17;
	length = 3;
	is_extension = true;
	bonuses_used = 0;
}

public void setUp10(){
	
	word_id = 99997;
	word = "cat";
	value = 5;
	length = -9;
	is_extension = true;
	bonuses_used = 0;
}

public void setUp11(){
	
	word_id = 99997;
	word = "cat";
	value = 5;
	length = 3;
	is_extension = true;
	bonuses_used = -15;
	QueryClass qc = new QueryClass();
	Validator v = new Validator();
}




@Test
public void addNewToGameTableTestEQ1(){
	setUp();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), result);
	tearDown();
}

@Test
public void addNewToGameTableTestEQ2(){
	setUp2();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}

public void addNewToGameTableTestEQ3(){
	setUp3();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}

public void addNewToGameTableTestEQ4(){
	setUp4();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}


public void addNewToGameTableTestEQ5(){
	setUp5();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}

public void addNewToGameTableTestEQ6(){
	setUp6();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}
public void addNewToGameTableTestEQ7(){
	setUp7();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}
public void addNewToGameTableTestEQ8(){
	setUp8();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}
public void addNewToGameTableTestEQ9(){
	setUp9();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}
public void addNewToGameTableTestEQ10(){
	setUp10();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}

public void addNewToGameTableTestEQ11(){
	setUp11();
	qc.addNewToGameTable(word_id);
	assertEquals(v.isDictionaryWord(word), true);
	tearDown();
}

}
