package homeworkmod3;

import homeworkmod3.Homework;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Webpage_elements extends Homework {


    public void CompareText() {
        System.out.println("Test 2: ");
        //firstly: type something on search-bar
        driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("t");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        //validating if text get by browser is equal to TOP SELLERS
        String actual = driver.findElement(By.xpath("//a[contains(text(),'Top sellers')]")).getText();
        Assert.assertEquals(actual, "TOP SELLERS");

    }
}
