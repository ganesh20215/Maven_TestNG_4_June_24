package testng.testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(groups = {"smoke"})
    public void verifyAddToCard() {
        Assert.assertTrue(false);
        System.out.println("verify add to card");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyOrder() {
        System.out.println("verify Order");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyPayment() {
        System.out.println("verify Payment");
    }
}
