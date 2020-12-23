package com.syntax.class01;

import org.testng.annotations.Test;

public class Task1 {
    /*Executing test using @Test
    create using 3 tests with unique @test methods names
    execute all test methods
     */

    @Test
    public void first(){
        System.out.println("I am 1st method");
    }

    @Test
    public void second(){
        System.out.println("I am the 2nd method");
    }
    @Test
    public void third(){
        System.out.println("I am the 3rd method");

    }
}
