import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class findUserTest {

@BeforeClass
public static void beforeClass(){
	int game_id;
	int gold_team_score;
	int green_team_score;
}

@AfterClass
public static void afterClass(){
	
}

@Before
public void setUp(){
	
	game_id = 1;
	gold_team_score = 84;
	green_team_score = 71;
}

@After
public void tearDown() {
	
	game_id = 0;
	gold_team_score = 0;
	green_team_score = 0;
}

public void setUp2(){
	
	game_id = 0;
	gold_team_score = 101;
	green_team_score = 104;
}

public void setUp3(){
	
	game_id = -47;
	gold_team_score = 115;
	green_team_score = 127;
}

public void setUp4(){
	
	game_id = 1;
	gold_team_score = -31;
	green_team_score = 81;
}

public void setUp5(){
	
	game_id = "";
	gold_team_score = 76;
	green_team_score = -104;
}






@Test
public void addNewToGameTableTestEQ1(){
	setUp();
	boolean result = addNewToGameTable(game_id);
	assertEquals(1, result);
	tearDown();
}

@Test
public void addNewToGameTableTestEQ2(){
	setUp2();
	boolean result = addNewToGameTable(game_id);
	assertEquals(0, result);
	tearDown();
}

public void addNewToGameTableTestEQ3(){
	setUp3();
	boolean result = addNewToGameTable(game_id);
	assertEquals(0, result);
	tearDown();
}

public void addNewToGameTableTestEQ4(){
	setUp4();
	boolean result = addNewToGameTable(game_id);
	assertEquals(0, result);
	tearDown();
}


public void addNewToGameTableTestEQ5(){
	setUp5();
	boolean result = addNewToGameTable(game_id);
	assertEquals(0, result);
	tearDown();
}



}
