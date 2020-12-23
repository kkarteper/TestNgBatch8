package com.syntax.class01;

import org.testng.annotations.Test;

public class TestNGIntro {

    @Test
    public void saySomething(){
        System.out.println("Hello");
    }
    @Test
    public void bye(){
        System.out.println("Bye");
    }

    @Test
    public void howRu(){
        System.out.println("How are you today?");
    }
    //outputs shows the alphabetically of methods name (bye,howRu and saySomething)
}
