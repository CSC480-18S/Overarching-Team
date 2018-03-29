package org.doublecloud.sample.junit.test;

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
	String mac;
	String team;
	QueryClass qc = new QueryClass();
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	uname = "Scrabblefiend";
	mac = "A2:3F:45:7B:C1:97";
	team = "green";
}

@After
public void tearDown() {
	
	uname = "";
	mac = "";
	team = "";
}

public void setUp2(){
	
	uname = "untaken";
	mac = "A2:3F:45:7B:C1:97";
	team = "green";
}

public void setUp3(){
	
	uname = "fuck";
	mac = "A2:3F:45:7B:C1:97";
	team = "green";
}

public void setUp4(){
	
	uname = "asd";
	mac = "A2:3F:45:7B:C1:97";
	team = "green";
}

public void setUp5(){
	
	uname = "";
	mac = "A2:3F:45:7B:C1:97";
	team = "green";
}

public void setUp6(){
	
	uname = "Scrabblefiend";
	mac = "asd";
	team = "green";
}

public void setUp7(){
	
	uname = "Scrabblefiend";
	mac = "";
	team = "green";
}

public void setUp8(){
	
	uname = "Scrabblefiend";
	mac = "A2:3F:45:7B:C1:97";
	team = "gold";
}

public void setUp9(){
	
	uname = "Scrabblefiend";
	mac = "A2:3F:45:7B:C1:97";
	team = "asd";
}

public void setUp9(){
	
	uname = "Scrabblefiend";
	mac = "A2:3F:45:7B:C1:97";
	team = "";
}




@Test
public void addNewUserTestEQ1(){
	setUp();
	boolean result = qc.addNewUser(uname);
	assertEquals(1, result);
	tearDown();
}

@Test
public void addNewUserTestEQ2(){
	setUp2();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

public void addNewUserTestEQ3(){
	setUp3();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

public void addNewUserTestEQ4(){
	setUp4();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}


public void addNewUserTestEQ5(){
	setUp5();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

public void addNewUserTestEQ6(){
	setUp6();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

public void addNewUserTestEQ7(){
	setUp7();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

public void addNewUserTestEQ8(){
	setUp8();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

public void addNewUserTestEQ9(){
	setUp9();
	boolean result = qc.addNewUser(uname);
	assertEquals(0, result);
	tearDown();
}

}
