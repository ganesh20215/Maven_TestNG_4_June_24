package testng.testngbasic;

import org.testng.annotations.Test;

public class SampleCheck {


    @Test(groups = {"smoke"})
    public void testCaseM(){
        System.out.println("test case M");
    }

    @Test(priority = -10)
    public void testCaseH(){
        System.out.println("test case H");
    }

    @Test(priority = 'b')
    public void testCaseA(){
        System.out.println("test case A");
		System.out.println("Good Morning");
    }

    @Test(priority = 5)
    public void testCaseV(){
        System.out.println("test case V");
    }

}
