package testng.testngbasic;

import org.testng.annotations.Test;

public class InvocationCountAttribute {

    @Test(invocationCount = 100000, invocationTimeOut = 1, groups = {"smoke"})
    public void verifyInvocationCount() {
        System.out.println("Hello Selenium Guys");
    }
}
