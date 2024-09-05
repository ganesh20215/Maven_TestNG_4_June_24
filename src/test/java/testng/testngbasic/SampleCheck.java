package testng.testngbasic;

import org.testng.annotations.Test;

public class SampleCheck {

    @Test(priority = 'A')
    public void testCaseZ(){
        System.out.println("test case of Z");
    }

    @Test(groups = {"smoke"})
    public void testCaseM(){
        System.out.println("test case M");
    }

    @Test(priority = -10)
    public void testCaseH(){
        System.out.println("test case H");
    }

    @Test(priority = 5)
    public void testCaseV(){
        System.out.println("test case V");
    }

    @Test(priority = -60)
    public void testCaseF(){
        System.out.println("test case F");
    }

}
