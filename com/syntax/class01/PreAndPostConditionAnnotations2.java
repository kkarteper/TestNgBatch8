package com.syntax.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreAndPostConditionAnnotations2 {
    @Test
    public void testMethod(){
        System.out.println("Test Method-1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @Test
    public void testMethod2(){
        System.out.println("Test Method-2");
    }
    //Totally 2 tests run and totally 6 lines output
}
