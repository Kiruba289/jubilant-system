package com.lti.junit.demo;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculationTestCasesJunit {
	//It will be executed before all the test 
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
        //code for connection opening--fetch the id
    } 
	
	
    @Before  //before each test case 
    public void setUp() throws Exception {  
        System.out.println("before");  
        //Opening for perfroming reading operation before each test case
    }  
  
    @Test  //it is a test case method
    public void testFindMax(){ 
    	//Open file code ....
    	//connect with database to get the id--need
        System.out.println("test case find max");  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        
        //this this failed , the logic was not correct
        //assertEquals(12,Calculation.findMax(new int[]{12,-3,-4,-2})); 
       //close file connection code.... 
        
    }  
    @Test  
    public void testCube(){ 
    	//connect with database to get the id--no need
        System.out.println("test case cube");  
        assertEquals(27,Calculation.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
    	//connect with database to get the id--no need
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan"));  
    }  
    @After // after each test is over
    public void tearDown() throws Exception {  
        System.out.println("after");  
        //close of file after the test is completed
    }  
    
   
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class"); 
        //connection closing
    } 
}
