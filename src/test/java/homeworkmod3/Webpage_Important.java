package homeworkmod3;

import homeworkmod3.Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Webpage_Important extends Homework {
    @FindBy(how = How.ID, id = "search_query_top")
    WebElement searchBar;
    @FindBy(id = "")
    WebElement gigel;

    //testing searchBar by typing a text and press INVIO / ENTER button
    public void searchBarTesting1() {
        System.out.println("Test1: ");
        searchBar.click();
        // First test = search bar;
        searchBar.sendKeys("test");
        //testing if search bar reacts to ENTER/INVIO key
        driver.findElement(By.id("searchBar")).sendKeys(Keys.ENTER);
    }

    //testing searchBar by typing a value and press on button
    public void searchBarTesting2() {
        System.out.println("Test 1.2: ");
        driver.findElement(By.xpath("searchBar")).click();
        // First test = search bar (again)
        driver.findElement(By.xpath("searchBar")).sendKeys("test2");
        driver.findElement(By.xpath("searchBar")).click();
    }


}
