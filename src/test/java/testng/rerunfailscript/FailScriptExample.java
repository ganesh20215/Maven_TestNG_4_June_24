package testng.rerunfailscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScriptExample {

    @Test
    public void testCaseDemo_1(){
        System.out.println("test case demo 1");
    }

    @Test
    public void testCaseDemo_2(){
        System.out.println("test case demo 2");
    }

    @Test
    public void testCaseDemo_3(){
        Assert.assertTrue(false);
        System.out.println("test case demo 3");
    }

    @Test
    public void testCaseDemo_4(){
        System.out.println("test case demo 4");
    }

    @Test
    public void testCaseDemo_5(){
        System.out.println("test case demo 5");
    }

    @Test
    public void testCaseDemo_6(){
        System.out.println("test case demo 6");
    }
}
