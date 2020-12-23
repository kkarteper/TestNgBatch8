package com.syntax.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PreAndPostConditionAnnotations {

    @Test
    public void testMethod(){
        System.out.println("Test Method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    //output we have only 1 Test run
}
